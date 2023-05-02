package kubernates.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/greet")
public class Controller {
    @GetMapping("/me")
    public String greet()
    {
        return "hello world";

    }
}
