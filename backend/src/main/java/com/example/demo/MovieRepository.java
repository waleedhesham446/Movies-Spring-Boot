package com.example.demo;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository                  // annotation to indicate that it is a repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
  //  the framework will automatically generate the implementation of this method
  Optional<Movie> findMovieByImdbId(String imdbId);     //  the name of the method is important, it must start with "find" and end with "By" followed by the name of the field to search for (in this case, "ImdbId")
}
