package com.controleanimal.models;

import com.controleanimal.Enum.FaseVida;
import com.controleanimal.Enum.Localizacao;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="CiclosVida")
public class CicloVida {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCiclo;
	
	@Enumerated(EnumType.STRING)
	private FaseVida fase;
	
	@Enumerated(EnumType.STRING)
	private Localizacao local;

	@Transient
	private Animal fkAnimal;
	
	private Date dataAlteracao;
	private Date dataCriacao;
	private String usuarioCadastro;
	private String usuarioAlteracao;
	
	
	
}
