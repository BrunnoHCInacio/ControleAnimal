package models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private Animal fkAnimal;
	private Date dataAlteracao;
	private Date dataCriacao;
	private String usuarioCadastro;
	private String usuarioAlteracao;
	
	
	
}
