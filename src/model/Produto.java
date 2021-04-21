package model;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class Produto implements Cloneable {
	   private Integer id; 
	   @NotEmpty(message="O nome do produto não pode está vazio.") 
	   @Size(min=3,max=20, message=" O nome deve ter entre 3 e 20 caracteres")
	   private String nome;
	   @NotEmpty(message="A marca do produto não pode está vazio.") 
	   @Size(min=3,max=20, message=" A marca deve ter entre 3 e 20 caracteres")
	   private String marca;
	   private Esporte esporte;
	   private Publico publicoAlvo;
	   @DecimalMin("0")
	   private int preco;
	   @FutureOrPresent(message="Digite uma data futura ou atual")
	   private LocalDate dataDeValidade;
	   
	   



	public Produto(Integer id, String nome, String marca,Esporte esporte, 
			Publico publicoAlvo, int preco,LocalDate dataDeValidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.esporte = esporte;
		this.publicoAlvo = publicoAlvo;
		this.preco = preco;
		this.dataDeValidade = dataDeValidade;
	}


	public Produto() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Esporte getEsporte() {
		return esporte;
	}
	public void setEsporte(Esporte esporte) {
		this.esporte = esporte;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public LocalDate getDataDeValidade() {
		return dataDeValidade;
	}
	public void setDataDeValidade(LocalDate validade) {
		this.dataDeValidade = validade;
	}
	  
	public Publico getPublicoAlvo() {
		return publicoAlvo;
	}


	public void setPublicoAlvo(Publico publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}


	public Produto getClone() {
		try {
			return (Produto) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
