package model;

public enum Perfil {
    ADM(1,"ADM"),
    ATENDENTE(2,"Atendente");
	
	private int valor;
	 private String label;
	 
	 
	 
	private Perfil(int valor, String label) {
		this.valor = valor;
		this.label = label;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	 
	 
}
