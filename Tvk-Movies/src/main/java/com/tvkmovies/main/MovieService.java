package com.tvkmovies.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository repo;

    public List<Movies> fetchallmovie() {
        return repo.findAll();
    }

    public Movies getmovie(Integer id) {
        return repo.findById(id).orElse(null);
    }

    // add new data
    public String addmovie(Movies movie) {
        repo.save(movie);
        return "Movie added!!!!!!!";
    }

    // update
    public Movies update(int id, Movies movie) {

        Movies oldMovie = repo.findById(id).orElse(null);

        oldMovie.setMovie_id(movie.getMovie_id());
        oldMovie.setMovie_title(movie.getMovie_title());
        oldMovie.setMovie_category(movie.getMovie_category());
        oldMovie.setMovie_director(movie.getMovie_director());
        oldMovie.setMovie_staring(movie.getMovie_staring());

        return repo.save(oldMovie);
    }

    // delete
    public String deletemovie(int id) {
        repo.deleteById(id);
;
        return "Movie Deleted!!!!!!!";
    }
}