package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
  @Autowired                // annotation to indicate that it is a dependency injection (let the framework handle the instantiation)
  private MovieRepository movieRepository;
  public List<Movie> allMovies() {
    return movieRepository.findAll();
  }

  public Optional<Movie> movieById(ObjectId id) {
    return movieRepository.findById(id);
    // we can add `.orElse(null)` to return null if the movie is not found
  }

  public Optional<Movie> movieByImdbId(String imdbId) {
    return movieRepository.findMovieByImdbId(imdbId);
  }
}
