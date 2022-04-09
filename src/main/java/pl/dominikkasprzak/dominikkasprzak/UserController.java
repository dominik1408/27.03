package pl.dominikkasprzak.dominikkasprzak;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    private Map<Integer, UserEntity> users = new LinkedHashMap<>();

    @PostConstruct
    private void onCreate(){
        users.put(1, new UserEntity(1, "Dominik"));
        users.put(2, new UserEntity(2, "Adam"));
        users.put(3, new UserEntity(3, "Tomek"));
        users.put(4, new UserEntity(4, "Piotrek"));
        users.put(5, new UserEntity(5, "Patryk"));
    }

    @RequestMapping("users/{id}/get")
    @ResponseBody
    private Object getUser(@PathVariable int id){
        return this.users.get(id);
    }


    @DeleteMapping("/users/{id}/remove")
    private Object onDelete(@PathVariable("id") int id){
        return this.users.remove(id);
    }
}
