package ru.itsjava.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itsjava.domain.Genre;
import ru.itsjava.repository.GenreRepository;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {
    private final GenreRepository genreRepository;


    @Transactional
    @Override
    public void changeGenre(String oldName, String updateName) {
        Genre genre = genreRepository.getByName(oldName).get();
        genre.setName(updateName);
        genreRepository.save(genre);
        System.out.println("Successfully saved!");
    }

    @Transactional(readOnly = true)
    @Override
    public void printGenre(String name) {
        Genre genre = genreRepository.getByName(name).get();
        System.out.println(genre);
    }
}
