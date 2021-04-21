package controller;



import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MenuController {
   
	
	public String irCadastro() {
		return "cadastro.xhtml?faces-redirect=true";
	}
	
	public String irLogin() {
		return "login.xhtml?faces-redirect=true";
	}
}
