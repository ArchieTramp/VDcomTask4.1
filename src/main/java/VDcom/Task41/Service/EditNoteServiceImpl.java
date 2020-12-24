package VDcom.Task41.Service;

import VDcom.Task41.Model.Note;
import VDcom.Task41.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Artur Gilyazov
 * Сервис редактирования заметки
 **/

@Service
public class EditNoteServiceImpl implements EditNoteService {

    @Autowired
    private NoteRepository noteRepository;


    @Override
    public void editNote(Note note) {

        String editNote = "текст загулшка";
        note.setNote(editNote);
        Long newTimeStamp = System.currentTimeMillis();
        note.setTimestamp(newTimeStamp);
        noteRepository.save(note);

    }
}