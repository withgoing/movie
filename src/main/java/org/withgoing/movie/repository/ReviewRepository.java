package org.withgoing.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.withgoing.movie.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
