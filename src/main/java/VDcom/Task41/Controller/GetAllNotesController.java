package VDcom.Task41.Controller;

import VDcom.Task41.Model.Note;
import VDcom.Task41.Model.User;
import VDcom.Task41.Service.GetAllNotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Artur Gilyazov
 * Контроллер получения всех заметок
 **/

@Controller
public class GetAllNotesController {

    @Autowired
    private GetAllNotesService getAllNotesService;

    @GetMapping("/allnotes")
    public String getAllNotes(Model model, HttpServletRequest httpServletRequest) {
        User username = (User) httpServletRequest.getSession().getAttribute("username");
        model.addAttribute("username", username);
        List<Note> list = getAllNotesService.getAllNotes(username);
        model.addAttribute("allnotes", list);
        return "allnotes";
    }
}