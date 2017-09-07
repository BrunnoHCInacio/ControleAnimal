package com.controleanimal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controleanimal.models.Animal;

public interface AnimaisRepository extends JpaRepository<Animal, Long>{

}
