package models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Lotes")
public class Lote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idLote;
	
	private long codigo;
	
	private Date dataAlteracao;
	private Date dataCriacao;
	private String usuarioCadastro;
	private String usuarioAlteracao;
	
}
