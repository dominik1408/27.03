package pl.dominikkasprzak.dominikkasprzak;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World";
    }
}