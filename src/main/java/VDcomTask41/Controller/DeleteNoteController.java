package VDcomTask41.Controller;

import VDcomTask41.Model.Note;
import VDcomTask41.Repository.NoteRepository;
import VDcomTask41.Service.DeleteNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;

/**
 * @author Artur Gilyazov
 * Контроллер удаления заметки
 **/

@Controller
public class DeleteNoteController {

    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private DeleteNoteService deleteNoteService;

    @DeleteMapping("/deleter")
    public String deleteNote(Model model) {
        String title = "загулшка заголовок";
        model.addAttribute("title", title);
        Note note = noteRepository.findByTitle(title);
        deleteNoteService.deleteNote(note);
        return "redirect:/";
    }
}