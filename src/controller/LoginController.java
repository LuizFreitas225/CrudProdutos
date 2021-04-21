package controller;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import model.Esporte;
import model.Funcionario;
import model.Perfil;
import model.Produto;
import model.Publico;

@Named
@RequestScoped
public class LoginController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8480010518493068784L;
	private Funcionario funcionario;
	List<Funcionario> listFuncionario;
	private int cont = 0;

	public String entrar() {

		System.out.println("Metodo Entrar");
		if (getListFuncionario().contains(getFuncionario())) {
			int index = 0;
			for (index = 0; index < getListFuncionario().size(); index++) {
				if (getListFuncionario().get(index).equals(getFuncionario())) {

					if (getListFuncionario().get(index).isAtivo()) {
						if (getListFuncionario().get(index).getPerfil() == Perfil.ADM) {
							return "menu.xhtml?faces-redirect=true";
						} else {
							return "sistemaemconstrucao.xhtml?faces-redirect=true";
						}
					} else {
						FacesContext.getCurrentInstance().addMessage(null,
								new FacesMessage(FacesMessage.SEVERITY_INFO, "Esse funcionário não está ativo.", null));
						return null;
					}
				}
			}
		}
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Senha ou CPF incorreto.", null));
		return null;
	}

	public void limpar() {
		this.setFuncionario(null);
	}

	public List<Funcionario> getListFuncionario() {
		if (listFuncionario == null) {
			setListFuncionario(new ArrayList<Funcionario>(Arrays.asList(new Funcionario[] {
					new Funcionario(1, LocalDate.now(), "142.532.531-20", "senha1", true, Perfil.ADM),
					new Funcionario(2, LocalDate.now(), "135.642.555-30", "senha2", true, Perfil.ATENDENTE),
					new Funcionario(3, LocalDate.now(), "452.645.543-09", "senha3", false, Perfil.ATENDENTE),
					new Funcionario(4, LocalDate.now(), "487.977.058-44", "senha4", false, Perfil.ADM),
					new Funcionario(5, LocalDate.now(), "489.606.123-76", "senha5", true, Perfil.ATENDENTE),
					new Funcionario(6, LocalDate.now(), "567.254.864-23", "senha6", true, Perfil.ADM) })));
			cont = listFuncionario.size();
		}
		return listFuncionario;
	}

	public Funcionario getFuncionario() {
		if (funcionario == null)
			setFuncionario(new Funcionario());
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void setListFuncionario(List<Funcionario> listFuncionario) {
		this.listFuncionario = listFuncionario;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

}
