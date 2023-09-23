package hu.progmatic.persistencedemo.service;

import hu.progmatic.persistencedemo.model.Song;
import hu.progmatic.persistencedemo.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {

    private final SongRepository songRepository;

    @Autowired
    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<Song> getAllSong() {
        return songRepository.findAll();
    }
}
