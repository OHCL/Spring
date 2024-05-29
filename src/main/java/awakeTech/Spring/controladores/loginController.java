package awakeTech.Spring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class loginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showLoginForm() {
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView processLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
        // Here you can add the logic to validate the user credentials
        // For now, let's just print them
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        // Redirect to a new page after successful login
        return new ModelAndView("welcome");
    }
}
