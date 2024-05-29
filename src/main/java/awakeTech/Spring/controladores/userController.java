package awakeTech.Spring.controladores;

import java.util.concurrent.ExecutorService;

import awakeTech.Spring.modelos.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import awakeTech.Spring.modelos.user;
import awakeTech.Servicio.userServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    private userServicio userService;

    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable Long id, Model model) {
        Optional<user> userOptional = userService.getUserById(id);
        if (userOptional.isPresent()) {
            model.addAttribute("user", userOptional.get());
            return "edit-user";
        } else {
            return "redirect:/users";
        }
    }


    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable Long id, @ModelAttribute user userDetails) {
        userService.updateUser(id, userDetails);
        return "redirect:/users";
    }
}