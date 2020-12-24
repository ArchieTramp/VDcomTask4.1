package VDcom.Task41.Controller;

import VDcom.Task41.Model.Note;
import VDcom.Task41.Service.AddNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Artur Gilyazov
 * Контроллер новой заметки
 **/

@Controller
public class AddNoteController {

    @Autowired
    private AddNoteService addNoteService;

    @PostMapping("/newnote")
    public String addNewNote(Model model) {

        Note note = new Note();
        addNoteService.addNote(note);
        model.addAttribute("newnote", note);
        return "newnote";
    }
}
