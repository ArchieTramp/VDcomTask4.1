package VDcom.Task41.Repository;

import VDcom.Task41.Model.Note;
import VDcom.Task41.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Artur Gilyazov
 * Репозиторий для хранения заметок
 **/

public interface NoteRepository extends JpaRepository<Note, Long> {
    Note findByTitle(String title);

    List<Note> findAllByUsername(User username);

    Note deleteNoteByTitle(String title);


}
