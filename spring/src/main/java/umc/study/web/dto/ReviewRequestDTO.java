package umc.study.web.dto;

import lombok.Getter;
import umc.study.domain.Store;
import umc.study.validation.annotation.ExistStores;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ReviewRequestDTO {

    @Getter
    public static class ReviewJoinDto{
        @NotBlank
        String title;
        @NotBlank
        String body;
        @NotNull
        Float score;
        //@ExistStores
        //Store store;
    }

}
