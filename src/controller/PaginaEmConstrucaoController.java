package controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PaginaEmConstrucaoController {
	
	public String irLogin() {
		return "login.xhtml?faces-redirect=true";
	}
}
