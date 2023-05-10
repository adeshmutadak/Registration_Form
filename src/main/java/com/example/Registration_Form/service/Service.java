package com.example.Registration_Form.service;

import com.example.Registration_Form.entity.Model;
import com.example.Registration_Form.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    IRepository repository;



//    public Model getAllUser(Model model) {
//        return repository.findAll(model);
//    }

    public String addUser(List<Model> modelList) {
        repository.saveAll(modelList);
        return "Added successfully";
    }

    public List<Model> getAllUser() {
        return (List<Model> )repository.findAll();
    }

    public String updateIfExist(Model model) {
        if(repository.existsById(model.getUserId())){
            repository.save(model);
            return "Update Successfully";
        }
        return "No such job with this JobId to update";
    }

    public String deleteUser(Long id) {
        if(repository.existsById(id)){
            repository.deleteById(id);
            return "Delete Successfully";
        }
        return "User Id Not Found";

    }

    public Model getById(Long id) {
        return repository.findById(id).get();
    }

    public List<Model> getByName(String name) {
        return repository.findByFirstName(name);
    }

//    public List<Model> getUserById(Long id) {
//        return repository.getByUserById(id);
//    }
}
