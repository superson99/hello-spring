package hello.hellospring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hello!!");
        /*model -> key : data, value = hello!!*/

        return "hello";
        /*goto tamplates.hello (view Resolver)*/
    }
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name , Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

}
