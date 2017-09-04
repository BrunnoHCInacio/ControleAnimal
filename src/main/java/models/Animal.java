package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name="Animais")
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAnimal;
	
    private Fazenda fkFazenda;
    private Lote fkLote;
    
    @Temporal(TemporalType.DATE)
    private Date dataAlteracao;
    
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;
    
    private String usuarioCadastro;
    private String usuarioAlteracao;
    private String codigoBrinco;
    private String codigoRaca;
    private Pai fkPai;
    private Mae fkMae;
    private Date datahoraCadastrado ;
    private Pesagem fkPesagem;

    public String getCodigoBrinco() {
		return codigoBrinco;
	}

	public void setCodigoBrinco(String codigoBrinco) {
		this.codigoBrinco = codigoBrinco;
	}

	public String getCodigoRaca() {
		return codigoRaca;
	}

	public void setCodigoRaca(String codigoRaca) {
		this.codigoRaca = codigoRaca;
	}

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
