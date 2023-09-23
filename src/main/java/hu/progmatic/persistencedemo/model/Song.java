package hu.progmatic.persistencedemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Song {
    @Id
    private Long id;
    private String title;
    private String artist;


}
