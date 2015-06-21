package fr.squiggy.poc.control;

import fr.squiggy.poc.bean.Utilisateur;
import fr.squiggy.poc.service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private IUtilisateurService utilisateurService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        Utilisateur utilisateur = utilisateurService.selectUtilisateurById((long) 1);
        model.addAttribute("message", "Hello world!");
        model.addAttribute("utilisateur", utilisateur);
        return "hello";
    }
}