package umc.study.service.MemberMissionService;

import umc.study.domain.Member;
import umc.study.domain.mapping.MemberMission;
import umc.study.web.dto.MemberMissionRequestDTO;
import umc.study.web.dto.MemberRequestDTO;

public interface MemberMissionCommandService {
    public MemberMission joinMemberMission(MemberMissionRequestDTO.MemberMissionJoinDto request);
}
