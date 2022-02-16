package org.withgoing.movie.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.withgoing.movie.entity.Member;
import org.withgoing.movie.entity.Movie;
import org.withgoing.movie.entity.Review;

import java.util.stream.IntStream;

@SpringBootTest
public class ReviewRepositoryTests {

    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    public void insertMovieReviews() {

        IntStream.rangeClosed(1,200).forEach(i -> {

            Long mno = (long)(Math.random()*100) + 1;

            Long mid = (long)(Math.random()*100) + 1;
            Member member = Member.builder().mid(mid).build();

            Review movieReview = Review.builder()
                    .member(member)
                    .movie(Movie.builder().mno(mno).build())
                    .grade((int)(Math.random()*5 + 1))
                    .text("이 영화에 대한 느낌..."+i)
                    .build();

            reviewRepository.save(movieReview);
        });
    }
}