package model;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Funcionario {
	private Integer id;
	private LocalDate dataCadastro;
	@NotEmpty(message= "O campo CPF é obrigatório.")
	@Pattern(regexp = "[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}", message = "Envie o CPF seguindo esse modelo: 111.111.111-11")
	private String cpf;
	@NotEmpty(message= "O campo Senha é obrigatório.")
	@Size(min=3,max=8, message=" A senha deve ter entre 3 e 8 caracteres")
	private String senha;
	private boolean ativo;
	private Perfil perfil;

	public Funcionario(Integer id, LocalDate dataCadastro, String cpf, String senha, boolean ativo,Perfil perfil) {
		super();
		this.id = id;
		this.dataCadastro = dataCadastro;
		this.cpf = cpf;
		this.senha = senha;
		this.ativo = ativo;
	    this.perfil= perfil;
	}

	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}


	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	

}
