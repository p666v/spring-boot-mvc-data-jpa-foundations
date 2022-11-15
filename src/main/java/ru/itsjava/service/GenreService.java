package ru.itsjava.service;

import ru.itsjava.domain.Genre;

public interface GenreService {
    void changeGenre(String oldName, String updateName);
    void printGenre(String name);
    void createGenre(Genre genre);
    Genre getGenreBiId(long id);
    void deleteGenreById(long id);
}
