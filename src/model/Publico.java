package model;

public enum Publico {
    INFANTIL(1,"Infantil"),
    JOVEM(2,"Jovem"),
    ADULTO(3,"Adulto"),
    TERCEIRA_IDADE(4,"Teceira Idade");
	
	
    private int valor;
    private String label;
    
    
    
	private Publico(int valor, String label) {
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
