package VDcom.Task41.Service;

import VDcom.Task41.Model.Note;
import VDcom.Task41.Model.User;

import java.util.List;

/**
 * @author Artur Gilyazov
 * Интерфейс сервиса получения всех заметок
 **/

public interface GetAllNotesService {

    List<Note> getAllNotes(User user);
}
