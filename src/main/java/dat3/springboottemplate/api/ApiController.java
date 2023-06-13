package dat3.springboottemplate.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping
@CrossOrigin
public class ApiController {
    @GetMapping("/")
    public RedirectView welcome(){
        System.out.println("Hello from ApiController");
        return new RedirectView("/swagger-ui/index.html");
    }
}
