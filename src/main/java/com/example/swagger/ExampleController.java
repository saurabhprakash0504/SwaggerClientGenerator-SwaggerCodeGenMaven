package com.example.swagger;

import com.swagger.client.codegen.rest.api.PetApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RequestMapping("/sample/endpoint")
@RestController
public class ExampleController {

    @Autowired
    PetApi petApi;

    @GetMapping
    public Object getApiDetail(@RequestParam(name = "param") Long param){
        return petApi.getPetById(param);
    }
}
