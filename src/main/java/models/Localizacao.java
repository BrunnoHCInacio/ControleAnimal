package models;

public enum Localizacao {
	
	BERCARIO("bercario"), 
	BEZERREIRA("Bezerreira"), 
	COLETIVO("Coletivo");
	
	private String descricao;
	
	Localizacao(String descricao){
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
}
