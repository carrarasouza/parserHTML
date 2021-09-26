package br.ufscar.dc.pooa.parserHTML;

import java.io.IOException;
import java.util.Calendar;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class App 
{
    public static void main( String[] args ) throws IOException{
    	
    	enumSites globo = enumSites.GLOBO;
    	enumSites uol = enumSites.UOL;
    	
    	gerarArquivoCSV arqCSV = new gerarArquivoCSV("testeGlobo.csv", globo.getNomeSite(), Calendar.getInstance());
    	
    	gerarArquivoCSV arq2CSV = new gerarArquivoCSV("testeUOL.csv", uol.getNomeSite(), Calendar.getInstance());
    	
    	extrairManchetes.ManchetesNoArquivo(globo, arqCSV);
    	extrairManchetes.ManchetesNoArquivo(uol, arq2CSV);
    	
    	arqCSV.FecharArq();
    }
}
