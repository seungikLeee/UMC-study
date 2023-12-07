package umc.study.validation.validator;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import umc.study.apiPayload.code.status.ErrorStatus;
import umc.study.repository.FoodCategoryRepository;
import umc.study.repository.MemberMissionRepository;
import umc.study.repository.MissionsRepository;
import umc.study.validation.annotation.CheckMissionStatus;
import umc.study.validation.annotation.ExistCategories;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MissionStatusValidator implements ConstraintValidator<CheckMissionStatus, List<Long>> {

    private final MemberMissionRepository memberMissionRepository;

    @Override
    public void initialize(CheckMissionStatus constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(List<Long> values, ConstraintValidatorContext context) {
        boolean isValid = values.stream()
                .allMatch(value -> memberMissionRepository.existsById(value));

        if (isValid) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(ErrorStatus.Mission_STATUS_NOT_MATCH.toString()).addConstraintViolation();
        }

        return isValid;

    }
}