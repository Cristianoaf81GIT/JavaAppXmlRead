Exemplo de Uso de Java + Leitura de Arquivos XML (Apache Netbeans IDE 9.0)

para realizar a leitura do xml:
1� passo
copie o arquivo chamado (arquivo.xml) localizado no diret�rio raiz do projeto
para o diret�rio que voc� desejar (exemplo: �rea de Trabalho)

2� passo acesse o  arquivo LerArquivoXML.java e localize a seguinte linha:
 xmlArquivo = new File("/home/cristianoaf81/arquivo.xml");
 
 substitua por:

 xmlArquivo = new File("caminho/do/diretorio/onde/esta/arquivo.xml");


3� passo limpe e construa o projeto com o netbeans (pelo menos vers�o 8.1)