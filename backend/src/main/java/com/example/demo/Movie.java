package com.example.demo;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "movies")         // annotation to indicate that it is a MongoDB document
@Data                                   // annotation to generate getters and setters
@AllArgsConstructor                     // annotation to generate a constructor with all arguments
@NoArgsConstructor                      // annotation to generate a constructor with no arguments
public class Movie {
  @Id                                   // annotation to indicate that it is the primary key
  private ObjectId id;
  private String imdbId;
  private String title;
  private String releaseDate;
  private String trailerLink;
  private String poster;
  private List<String> genres;
  private List<String> backdrops;
  @DocumentReference                    // annotation to indicate that it is a reference to another document
  private List<Review> reviewIds;
}
