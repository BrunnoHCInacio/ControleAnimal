package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="")
public class Animal {
    private Long idAnimal;

    
    private Date datahoraCadastrado ;


    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Date getDatahoraCadastrado() {
        return datahoraCadastrado;
    }

    public void setDatahoraCadastrado(Date datahoraCadastrado) {
        this.datahoraCadastrado = datahoraCadastrado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return idAnimal != null ? idAnimal.equals(animal.idAnimal) : animal.idAnimal == null;
    }

    @Override
    public int hashCode() {
        return idAnimal != null ? idAnimal.hashCode() : 0;
    }
}
