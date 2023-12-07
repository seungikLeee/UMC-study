package umc.study.converter;

import umc.study.domain.Member;
import umc.study.domain.Store;
import umc.study.domain.mapping.MemberMission;
import umc.study.web.dto.*;

import java.time.LocalDateTime;

public class MemberMissionConverter {
    public static MemberMissionResponseDTO.MemberMissionJoinResultDTO toJoinResultDTO(MemberMission memberMission){
        return MemberMissionResponseDTO.MemberMissionJoinResultDTO.builder()
                .memberMissionId(memberMission.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static MemberMission toMemberMission(MemberMissionRequestDTO.MemberMissionJoinDto request){
        return MemberMission.builder()
                .status(request.getStatus())
                .build();
    }
}
