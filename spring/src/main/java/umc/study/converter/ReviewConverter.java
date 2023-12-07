package umc.study.converter;

import umc.study.domain.Review;
import umc.study.web.dto.ReviewRequestDTO;
import umc.study.web.dto.ReviewResponseDTO;

import java.time.LocalDateTime;

public class ReviewConverter {
    public static ReviewResponseDTO.ReviewJoinResultDTO toJoinResultDTO(Review review) {
        return ReviewResponseDTO.ReviewJoinResultDTO.builder()
                .reviewId(review.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Review toReview(ReviewRequestDTO.ReviewJoinDto request) {

        return Review.builder()
                .body(request.getBody())
                .score(request.getScore())
                .build();
    }
}
