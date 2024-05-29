package awakeTech.Spring.controladores;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crearCapacitacion")
public class capacitacionController {
	@GetMapping
    public String crearCapacitacion() {
        return "crearCapacitacion";
    }

	
	 @GetMapping("/listarCapacitaciones")
	    public String listarCapacitaciones(Model model) {
	        List<String> capacitaciones = Arrays.asList("Capacitación 1", "Capacitación 2", "Capacitación 3");
	        model.addAttribute("capacitaciones", capacitaciones);
	        return "listarCapacitaciones";
	    }
}
