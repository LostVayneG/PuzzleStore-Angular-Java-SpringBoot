/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.puzzlestore.BackEnd.repository;

import java.util.List;
import java.util.Optional;

import com.web.puzzlestore.BackEnd.model.entities.Person;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author User
 */
public interface IPersonRepository extends CrudRepository<Person, Long>{
    public Optional<Person> findByUsername(String username);
    public List<Person> findAll();
}
