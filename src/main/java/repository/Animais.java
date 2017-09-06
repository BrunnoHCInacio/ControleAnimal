package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Animal;

public interface Animais extends JpaRepository<Animal, Long>{

}
