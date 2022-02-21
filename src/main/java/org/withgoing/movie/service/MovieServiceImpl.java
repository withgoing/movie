package org.withgoing.movie.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.withgoing.movie.dto.MovieDTO;
import org.withgoing.movie.repository.MovieRepository;

@Service
@Log4j2
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public Long register(MovieDTO movieDTO) {
        return null;
    }

}
