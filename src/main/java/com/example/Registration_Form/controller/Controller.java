package com.example.Registration_Form.controller;

import com.example.Registration_Form.entity.Model;
import com.example.Registration_Form.service.Service;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/controller")
public class Controller {
    @Autowired
    Service service;

    @PostMapping
public String addUser(@Valid @RequestBody List<Model>modelList){
     return   service.addUser(modelList);

    }

    @GetMapping(value = "/getAllUser")
    public List<Model>getAllUser(){
        return service.getAllUser();
    }

   @GetMapping("getByName/{name}")
    public List<Model> getByName(@PathVariable String name) {
        return service.getByName(name);
   }


    @GetMapping ("getById/{id}")
    public Model getById(@PathVariable Long id){
        return service.getById(id);
    }
//


    @PutMapping("/upadate")
    public String updateIfExist(@RequestBody Model model){
        return service.updateIfExist(model);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        return service.deleteUser(id);
    }

}
