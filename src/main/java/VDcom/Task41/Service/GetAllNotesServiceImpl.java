package VDcom.Task41.Service;

import VDcom.Task41.Model.Note;
import VDcom.Task41.Model.User;
import VDcom.Task41.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Artur Gilyazov
 * Сервис получения всех заметок
 **/

@Service
public class GetAllNotesServiceImpl implements GetAllNotesService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public List<Note> getAllNotes(User username) {

        return noteRepository.findAllByUsername(username);

    }
}
