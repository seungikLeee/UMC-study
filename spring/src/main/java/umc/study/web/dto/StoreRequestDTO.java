package umc.study.web.dto;

import lombok.Getter;
import umc.study.domain.Region;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class StoreRequestDTO {

    @Getter
    public static class StoreJoinDto{
        @NotBlank
        String name;
        @NotBlank
        String address;
        @NotNull
        Region region;
    }
}