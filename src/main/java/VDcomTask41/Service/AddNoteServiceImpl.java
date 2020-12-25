package VDcomTask41.Service;

import VDcomTask41.Model.Note;
import VDcomTask41.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Artur Gilyazov
 * Сервис создания заметки
 **/

@Service
public class AddNoteServiceImpl implements AddNoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public void addNote(Note note) {


        String newTitle = "Заглушка";
        Long newTimeStamp = System.currentTimeMillis();
        String newBodyOfNote = "текст заметки, который будет вводится с например jsp странцы";

        //создание заметки
        Note newNote = Note.builder()
                .title(newTitle)
                .timestamp(newTimeStamp)
                .note(newBodyOfNote)
                .build();
        noteRepository.save(newNote);

    }
}