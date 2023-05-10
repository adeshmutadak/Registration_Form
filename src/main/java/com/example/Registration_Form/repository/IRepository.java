package com.example.Registration_Form.repository;

import com.example.Registration_Form.entity.Model;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface IRepository extends CrudRepository<Model,Long> {
  List <Model> findByFirstName(String name);

//    @Query(value = "select * from model_table where first_name=:name",nativeQuery = true)
  //  Model getbyName(String name);
    // @Query(value = "select * from model_table where user_id=:id",nativeQuery = true)

  //  Model getById(Long id);
    //  List<Model> getByUserById(Long id);

    //  Model findAll(Model model);

}
