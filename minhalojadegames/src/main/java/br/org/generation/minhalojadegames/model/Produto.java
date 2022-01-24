package br.org.generation.minhalojadegames.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@NotBlank(message = "O campo NOME é obrigatório!")
	private String nome; 
	
	@NotBlank(message = "O campo HABILIDADES é obrigatório!")
	private String habilidades;
	
	private int PoderAtaque;
	
	private int PoderDefesa;
	
	@Column(name = "data_lançamento")
	@JsonFormat(pattern = "YYYY-MM-DD")
	private LocalDate dataLancamento;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@NotNull(message = "O campo preço é obrigatório!")
	@Positive(message = "O preço deve ser maior que zero!")
	private BigDecimal preco;
	
	private String foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	public int getPoderAtaque() {
		return PoderAtaque;
	}

	public void setPoderAtaque(int poderAtaque) {
		PoderAtaque = poderAtaque;
	}

	public int getPoderDefesa() {
		return PoderDefesa;
	}

	public void setPoderDefesa(int poderDefesa) {
		PoderDefesa = poderDefesa;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
}
