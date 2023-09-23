package hu.progmatic.persistencedemo.controller;

import hu.progmatic.persistencedemo.model.Song;
import hu.progmatic.persistencedemo.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SongController {
    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping
    public List<Song> showAllSongs(){
        return songService.getAllSong();
    }

}
