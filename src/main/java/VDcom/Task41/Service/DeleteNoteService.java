package VDcom.Task41.Service;

import VDcom.Task41.Model.Note;

/**
 * @author Artur Gilyazov
 * Интерфейс сервиса удаления заметки
 **/

public interface DeleteNoteService {

    void deleteNote(Note note);
}
