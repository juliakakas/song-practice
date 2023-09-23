package hu.progmatic.persistencedemo.repository;


import hu.progmatic.persistencedemo.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song,Long> {
}
