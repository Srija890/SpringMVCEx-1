package com.stackroute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController
{
    @RequestMapping("/")
    public String display(Model model)
    {
        User user = new User();
        user.setName("Srija");
        String name=user.getName();
        model.addAttribute("name",name);
        return "index";
    }

}


