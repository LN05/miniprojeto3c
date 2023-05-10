package br.com.itb.miniprojeto3c.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Produto")

public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id;
	//@Column(length = 100, nullable = false)
	private String nome;
	private String descricao;
	private String codigoBarras;
	private byte [] foto;
	private double preco;
	private String categoria;
	private String destaque;
	private String statusProd;
	
}
