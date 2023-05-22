package br.com.portugal.loja.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {

	@Id
	private Long id;

	private String nome;

	private String descricao;

	private BigDecimal preco;

}