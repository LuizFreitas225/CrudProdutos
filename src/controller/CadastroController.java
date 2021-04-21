package controller;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import model.Esporte;
import model.Produto;
import model.Publico;

@Named
@ViewScoped
public class CadastroController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4929982584909869863L;
	private Produto produto;
	private Esporte esporteFiltro;
	private List<Produto> listProduto;
	private int cont = 0;

	public List<Produto> getFiltrar() {
		System.out.println(" filtrar");
		System.out.println(esporteFiltro);

		if (esporteFiltro == null) {
			return getListProduto();

		}

		List<Produto> listFiltro = new ArrayList<Produto>();

		for (int index = 0; index < getListProduto().size(); index++) {
			if (esporteFiltro == Esporte.FUTEBOL && getListProduto().get(index).getEsporte() == Esporte.FUTEBOL) {
				listFiltro.add(getListProduto().get(index));
			} else if (esporteFiltro == Esporte.VOLEI && getListProduto().get(index).getEsporte() == Esporte.VOLEI) {
				listFiltro.add(getListProduto().get(index));
			}

			else if (esporteFiltro == Esporte.SKATE && getListProduto().get(index).getEsporte() == Esporte.SKATE) {
				listFiltro.add(getListProduto().get(index));
				
			} else if (esporteFiltro == Esporte.KARATE && getListProduto().get(index).getEsporte() == Esporte.KARATE) {
				listFiltro.add(getListProduto().get(index));
			}
		}

		return listFiltro;

	}

	public void incluir() {
		System.out.println("Entrou no metódo incluir");

		this.getListProduto().add(produto);

		cont++;
		produto.setId(cont);
		limpar();
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Inclusão realizada com sucesso", null));
	}

	public void limpar() {
		System.out.println("Entrou no metódo limpar");
		this.setProduto(null);
	}

	public void editar(Produto prod) {
		System.out.println("Entrou no metódo editar");
		setProduto(prod);
	}

	public void excluir(Produto prod) {
		System.out.println("Entrou no metódo excluir");
		this.listProduto.remove(prod);
		limpar();

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Exclusão realizada com sucesso", null));
	}

	public void excluir() {
		this.excluir(getProduto());
	}

	public void alterar() {
		System.out.println("entrou no metodo alterar");

		limpar();
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Alteração realizada com sucesso", null));
	}

	public Produto getProduto() {
		if (produto == null) {
			setProduto(new Produto());
		}
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getListProduto() {
		if (listProduto == null) {
			setListProduto(new ArrayList<Produto>(Arrays
					.asList(new Produto[] { new Produto(1, "Bola", "Adidas", Esporte.FUTEBOL,Publico.JOVEM, 233, LocalDate.now()),
							new Produto(2, "Skate", "Element", Esporte.SKATE,Publico.ADULTO, 300, LocalDate.now()),
							new Produto(3, "Rede", "Mikasa", Esporte.VOLEI,Publico.INFANTIL, 550, LocalDate.now())
							,new Produto(4, "Tenis", "Nike", Esporte.VOLEI,Publico.JOVEM, 450, LocalDate.now()),
							new Produto(5, "Chuteira", "Adidas", Esporte.FUTEBOL,Publico.ADULTO, 240, LocalDate.now()),
							new Produto(6, "Manguito", "Puma",Esporte.VOLEI,Publico.INFANTIL, 450, LocalDate.now())})));
			cont = listProduto.size();
		}

		return listProduto;
	}

	public void setListProduto(List<Produto> listProduto) {
		this.listProduto = listProduto;
	}

	public Esporte[] getListaEsportes() {
		return Esporte.values();
	}
	public Publico[] getListaPublico() {
		return Publico.values();
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public Esporte getEsporteFiltro() {
		return esporteFiltro;
	}

	public void setEsporteFiltro(Esporte esporteFiltro) {
		this.esporteFiltro = esporteFiltro;
	}

}
