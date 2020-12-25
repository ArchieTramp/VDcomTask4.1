package VDcomTask41.Service;

import VDcomTask41.Model.Note;
import VDcomTask41.Model.User;

import java.util.List;

/**
 * @author Artur Gilyazov
 * Интерфейс сервиса получения всех заметок
 **/

public interface GetAllNotesService {

    List<Note> getAllNotes(User user);
}
