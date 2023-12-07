package umc.study.web.dto;

import lombok.Getter;
import umc.study.domain.enums.MissionStatus;
import umc.study.validation.annotation.CheckMissionStatus;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MemberMissionRequestDTO {
    @Getter
    public static class MemberMissionJoinDto {
        @NotNull
        Integer memberMissionId;
        @CheckMissionStatus
        MissionStatus status;
    }
}