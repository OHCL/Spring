package awakeTech.Spring.controladores;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@Controller
@RequestMapping(path = "/")
public class HomeController {

    // Constantes
    // -----------------------------------------------------------------------------------------

    /** Objeto {@link Logger} that contains the debugging methods */
    private static final Logger logger = LogManager.getLogger(HomeController.class);

    // GET Requests
    // -----------------------------------------------------------------------------------------

    /**
     * Shows the Home Page
     *
     * @param nombre  name of the person (optional)
     * @param request {@link HttpServletRequest} object that contains the information
     *                of the request made by the client to the {@link HttpServlet}
     * @param modelo  {@link Model} object with the view model
     *
     * @return a {@link String} object with the response to the request
     */
    @GetMapping(path = { "/", "/{nombre}" })
    public String paginaInicio(@PathVariable Optional<String> nombre, HttpServletRequest request, Model modelo) {
        // Debugging
        logger.info("GET Request: {}", request.getRequestURI());

        // Verify if the parameter entered by url is present
        if (nombre.isPresent()) {
            // Add name to the model
            modelo.addAttribute("nombre", nombre.get());

            // Show page
            return "home2";
        }

        // Show page
        return "home";
    }

}
