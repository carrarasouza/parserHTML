# parserHTML
Trabalho 2 POOA - Wesley Azevedo Souza

Foi utilizado nesse projeto a biblioteca Jsoup para realizar o parser HTML.
Para compilar o projeto é necessário o uso do Maven, a versão utilizada foi a Apache Maven 3.8.1. Para compilar digite esse comando em linha de comando 
no diretório parserHTML/parserHTML:
## mvn compile assembly:single
Caso não ocorra nenhum problema, será criado um arquivo no dirétorio target/ com o seguinte nome parserHTML-1.0-SNAPSHOT-jar-with-dependencies.jar. 
Para executar esse arquivo é necessário digitar esse comando em linha de comanbrando:
## java -jar parserHTML-1.0-SNAPSHOT-jar-with-dependencies.jar
A versão java utilizada para execução de código foi a 15.0.2.
Lembrando que pode ser necessário ter permissão de superusuário para execução do código. Após sucesso na execução, serão criados dois arquivos CSV no
diretório target/ que irão conter o resultado da extração das manchetes.

