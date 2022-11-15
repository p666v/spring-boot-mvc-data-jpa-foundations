package ru.itsjava.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.itsjava.domain.Genre;

@AllArgsConstructor
@Data
public class GenreDto {
    private String id;
    private String name;

    public static Genre fromDto(GenreDto genreDto) {
        if (genreDto.id == null){
            genreDto.id = "0";
        }
        return new Genre(Long.parseLong(genreDto.id), genreDto.name);
    }

    public static GenreDto toDto(Genre genre) {
        return new GenreDto(String.valueOf(genre.getId()), genre.getName());
    }

}
