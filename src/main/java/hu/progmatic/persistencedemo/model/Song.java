package hu.progmatic.persistencedemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Song {
    @Id
    private Long id;
    private String artist;
    private String title;

    public Song(Long id, String artist, String title){
        this.id = id;
        this.artist = artist;
        this.title = title;
    }

    public Song() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
