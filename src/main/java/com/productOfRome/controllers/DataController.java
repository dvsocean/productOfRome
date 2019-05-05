package com.productOfRome.controllers;

import com.productOfRome.dataobjects.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private Node node;

    @RequestMapping(value = "/updateFormData", method = RequestMethod.POST, consumes = "application/json")
    public String informedDecision(@RequestBody Node node){
        return node.getActivity();
    }
}
