package pl.dominikkasprzak.dominikkasprzak;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleClass
{
    @RequestMapping("/example")
    public String example(){
        return "example";
    }
}
