package VDcom.Task41.Service;

import VDcom.Task41.Model.Note;
import VDcom.Task41.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Artur Gilyazov
 * Сервис удаления заметки
 **/

@Service
public class DeleteNoteServiceImpl implements DeleteNoteService {

    @Autowired
    private NoteRepository noteRepository;


    @Override
    public void deleteNote(Note note) {

        String title = note.getTitle();
        noteRepository.deleteNoteByTitle(title);

    }
}