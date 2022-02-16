package org.withgoing.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.withgoing.movie.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
