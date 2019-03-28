package com.hlb.controller;

import com.hlb.pojo.Dog;
import com.hlb.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fly on 2019/3/28.
 */
@Controller
public class FreeMarkerController {
    @GetMapping("/fr/{number}")
    public String m1(Model model, @PathVariable Integer number){
        model.addAttribute("name", "李晨");
//        model.addAttribute("number", number);

        User user = new User();
        user.setName("张三");
        user.setAge(22);

        Dog dog = new Dog();
        dog.setName("狗狗");
        user.setDog(dog);

        model.addAttribute("user", user);

        List<User> list = new ArrayList<User>();
        list.add(user);
        list.add(user);
        list.add(user);
        list.add(user);
        list.add(user);
        list.add(user);
        model.addAttribute("list", list);
        model.addAttribute("sdfffsa","sdfsafs");
        return "fr";
    }
}