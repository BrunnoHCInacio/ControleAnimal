package models;

public enum FaseVida {
	
	RECEMNASCIDO("Recem Nascido"),
	NOVILHO("Novilho"), 
	ADULTO("Adulto");
	
	private String descricao;
	
	FaseVida(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
