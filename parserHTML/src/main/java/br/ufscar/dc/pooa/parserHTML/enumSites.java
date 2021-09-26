package br.ufscar.dc.pooa.parserHTML;

/*
 Esse Enum serve para adicionar novos sites e as tag + classes utilizadas para especificar os títulos das
 manchetes no site.
 
  */

public enum enumSites {
	
	GLOBO("https://www.globo.com",new String[] {"h3.post__title"}),
	UOL("https://www.uol.com.br/", new String[] {"h1.titulo", "h2.titulo", "span.linha", "span.title", "span.chamada"});
	
	private final String[] ident; // Um lista de identificador para títulos de manchetes
	private final String nomeSite;
	
	private enumSites(String nomeSite, String[] ident) {
		this.ident = ident;
		this.nomeSite = nomeSite;
	}
	
	public String[] getIdent() {
		return this.ident;
	}
	
	public String getNomeSite() {
		return this.nomeSite;
	}
}
