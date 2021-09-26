# parserHTML
### Trabalho 2 POOA - Wesley Azevedo Souza

Foi utilizado nesse projeto a biblioteca Jsoup para realizar o parser HTML.
Para compilar o projeto é necessário o uso do Maven, a versão utilizada foi a Apache Maven 3.8.1. Para compilar, digite o seguinte comando no terminal 
no diretório **parserHTML/parserHTML**:
```
mvn compile assembly:single
```
Caso não ocorra nenhum problema, será criado um arquivo no dirétorio **target/** com o nome **parserHTML-1.0-SNAPSHOT-jar-with-dependencies.jar**. 
Para executar esse arquivo é necessário digitar o seguinte comando no terminal:
```
java -jar parserHTML-1.0-SNAPSHOT-jar-with-dependencies.jar
```
A versão java utilizada foi a 15.0.2. <br />
Lembrando que pode ser necessário ter permissão de superusuário para execução do código. Após sucesso na execução, serão criados dois arquivos CSV no
diretório **target/** que irão conter o resultado da extração das manchetes.

## Adicionando novos sites para extração
Para adicionar novos sites para realizar a extração das manchetes é necessário incluir o novo site no arquivo **enumSites.java**. Para isso, é necessário
criar um novo enum com o nome do site e especificar a URL e a lista de identificadores de manchetes utilizada pelo site.

## Adicionando novos recursos 
Caso seja necessário outro tipo de manipulação das manchetes, ao invés de salvar em um arquivo CSV, isso pode ser feito criando novas classes que podem
ser filhas da classe **gerarArquivo** ou adicionando novos metódos na classe **extrairManchetes**.

