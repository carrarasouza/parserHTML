package br.ufscar.dc.pooa.parserHTML;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import org.jsoup.nodes.Element;


/*
  Classe abstrata para criar e fechar arquivos, e poder ser extendidada para criar o tipo de manipulação no arquivo
  */
public abstract class gerarArquivo {
	
	private PrintWriter arq;

	
	public gerarArquivo(String nomeArq) throws IOException {
		this.arq = new PrintWriter(new FileWriter(new File(nomeArq)));
	}
	
	public PrintWriter getArq() {
		return this.arq;
	}
	
	public void FecharArq() {
		this.arq.close();
	}
	

	public abstract void escreverManchetesNoArquivo(Element manchete, String tipo);
	
	public abstract void gerarCabecalho();

}
