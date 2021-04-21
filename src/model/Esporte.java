package model;


public enum Esporte {
    VOLEI(1,"Vôlei"),
    FUTEBOL(2,"Futebol"),
    KARATE(3,"Karatê"),
    SKATE(4,"Skate");
	
	private int num;
	private String label;
	
	
	private Esporte(int num, String label) {
		this.num = num;
		this.label = label;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	
}