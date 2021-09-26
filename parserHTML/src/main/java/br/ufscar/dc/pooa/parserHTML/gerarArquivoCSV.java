package br.ufscar.dc.pooa.parserHTML;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import org.jsoup.nodes.Element;


/*
  Gera um arquivos CSV com cabeçalho(nome do site e data da extração)
  É possível criar outro tipo de manipulação(gerar pdf, imprimir) criando-se um nova classe filha de gerarArquivo
 */
public class gerarArquivoCSV extends gerarArquivo{
	
	private String nomeSite;
	private Calendar data;
	
	public gerarArquivoCSV(String nomeArq, String nomeSite, Calendar data) throws IOException {
		super(nomeArq);
		this.nomeSite = nomeSite;
		this.data = data;
		gerarCabecalho();
	}
	
	@Override
	public void gerarCabecalho() {
		PrintWriter arq = super.getArq();
		arq.println(String.format("%s;%s/%s/%s", 
				this.nomeSite, Integer.toString(this.data.get(Calendar.DAY_OF_MONTH)), Integer.toString(this.data.get(Calendar.MONTH)),
				Integer.toString(this.data.get(Calendar.YEAR))));
		arq.println("Tipo;Notícia");
	}
	
	@Override
	public void escreverManchetesNoArquivo(Element manchete, String tipo) {
		PrintWriter arq = super.getArq();
		arq.println(String.format("%s;%s", tipo, manchete.text()));
	}
	
}
