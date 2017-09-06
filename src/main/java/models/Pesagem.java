package models;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="Pesagens")
public class Pesagem {
	private long idPesagem;
	
	@Temporal(TemporalType.DATE)
	private Date data;
	
	private BigDecimal peso;
	private Date dataAlteracao;
	private Date dataCriacao;
	private String usuarioCadastro;
	private String usuarioAlteracao;
	
	

}
