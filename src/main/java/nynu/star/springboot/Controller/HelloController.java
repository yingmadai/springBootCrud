package nynu.star.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
//    @RequestMapping("/")
//    public String index(){
//        return "login";
//    }
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello!SpringBoot!";
    }
}
