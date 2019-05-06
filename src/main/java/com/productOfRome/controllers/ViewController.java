package com.productOfRome.controllers;

import com.productOfRome.dataobjects.Greeting;
import com.productOfRome.dataobjects.Node;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/")
    public String getWelcome(){
        return "index";
    }

    @RequestMapping("/selection")
    public String getInputPage(){
        return "selection";
    }

    @GetMapping("/selection")
    public String selectionForm(Model model) {
        model.addAttribute("node", new Node());
        return "selection";
    }

    @PostMapping("/danikaForm")
    public String submitData(@ModelAttribute Node node) {
        return "danikaResult";
    }
}
