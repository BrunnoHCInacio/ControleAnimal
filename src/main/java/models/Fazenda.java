package models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Fazendas")
public class Fazenda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFazenda;
	
	private String nome;
	private Date dataAlteracao;
	private Date dataCriacao;
	private String usuarioCadastro;
	private String usuarioAlteracao;
	
	public Fazenda() {
		super();
	}
	public Long getIdFazenda() {
		return idFazenda;
	}
	public void setIdFazenda(Long idFazenda) {
		this.idFazenda = idFazenda;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	
	
	
}
