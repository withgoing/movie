package org.withgoing.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.withgoing.movie.entity.MovieImage;

public interface MovieImageRepository extends JpaRepository<MovieImage, Long> {
}
