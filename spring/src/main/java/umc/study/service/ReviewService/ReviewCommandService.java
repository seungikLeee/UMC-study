package umc.study.service.ReviewService;

import lombok.Getter;
import umc.study.domain.Review;
import umc.study.web.dto.ReviewRequestDTO;

public interface ReviewCommandService {
    public Review joinReview(ReviewRequestDTO.ReviewJoinDto request);
}
