package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataAlteracao;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataCriacao = new Date();
  
    private String usuarioCadastro;
    private String usuarioAlteracao;
    private String nome;
    private String codigoBrinco;
    private String codigoRaca;
    private Pai fkPai;
    private Mae fkMae;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataNascimento ;
    
    private Pesagem fkPesagem;

    
}
