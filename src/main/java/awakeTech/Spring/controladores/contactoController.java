package awakeTech.Spring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contacto")
public class contactoController {
	@GetMapping
    public String contacto() {
        return "contacto";
    }
}
