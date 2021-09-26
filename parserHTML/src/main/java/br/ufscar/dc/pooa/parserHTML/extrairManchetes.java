package br.ufscar.dc.pooa.parserHTML;


import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 Foi utilizado o Jsoup para realizar o parser em HTML
 Portanto, é passado o nome do site e os identificadores de manchetes usados pelo site para extrair as manchetes
*/

public class extrairManchetes {
	
	
	public static void ManchetesNoArquivo(enumSites site, gerarArquivoCSV arq) throws IOException {
		
		Document doc = Jsoup.connect(site.getNomeSite()).get();
		
		for (String ident : site.getIdent()) {
			Elements manchetes = doc.select(ident);
		
			for (Element manchete : manchetes) {
				arq.escreverManchetesNoArquivo(manchete, ident);
			}
		}
	}
	
	
	
	
	
	


}
