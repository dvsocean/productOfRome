package com.productOfRome.controllers;

import com.productOfRome.dataobjects.Node;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class LaunchController {

    //@PostMapping("/updateFormData")
    @RequestMapping(value = "/updateFormData", method = RequestMethod.POST, headers = "Content-Type=application/x-www-form-urlencoded;charset=UTF-8", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String informedDecision(@RequestBody Node node){
        return node.getActivity();
    }
}
