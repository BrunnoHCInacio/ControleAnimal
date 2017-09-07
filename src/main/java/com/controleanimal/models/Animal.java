package com.controleanimal.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="AnimaisRepository")
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAnimal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_fazenda")
    @JsonIgnore
    private Fazenda fazenda;

    //private Lote fkLote;
    
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
    @Transient
    private Pai fkPai;
    @Transient
    private Mae fkMae;
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataNascimento ;

    @Transient
    private Pesagem fkPesagem;

    
}
