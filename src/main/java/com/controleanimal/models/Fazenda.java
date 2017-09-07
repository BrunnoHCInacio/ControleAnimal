package com.controleanimal.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

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

	@OneToMany(mappedBy = "fazenda")
	private List<Animal> animal;
	

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
