package org.withgoing.movie.service;

import org.withgoing.movie.dto.MovieDTO;
import org.withgoing.movie.dto.MovieImageDTO;
import org.withgoing.movie.entity.Movie;
import org.withgoing.movie.entity.MovieImage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface MovieService {

    Long register(MovieDTO movieDTO);

    default Map<String, Object> dtoToEntity(MovieDTO movieDTO) {
        Map<String, Object> entityMap = new HashMap<>();

        Movie movie = Movie.builder()
                .mno(movieDTO.getMno())
                .title(movieDTO.getTitle())
                .build();

        entityMap.put("movie", movie);

        List<MovieImageDTO> imageDTOList = movieDTO.getImageDTOList();

        if(imageDTOList != null && imageDTOList.size() > 0) {
            List<MovieImage> movieImageList = imageDTOList.stream().map(movieImageDTO -> {
               MovieImage movieImage = MovieImage.builder()
                       .path(movieImageDTO.getPath())
                       .imgName(movieImageDTO.getImgName())
                       .uuid(movieImageDTO.getUuid())
                       .movie(movie)
                       .build();

               return movieImage;
            }).collect(Collectors.toList());
        }

        return entityMap;
    }
}
