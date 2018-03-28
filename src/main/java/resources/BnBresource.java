package resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BnBresource {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello!";
    }
}
