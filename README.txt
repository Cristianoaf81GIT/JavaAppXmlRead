Exemplo de Uso de Java + Leitura de Arquivos XML (Apache Netbeans IDE 9.0)

para realizar a leitura do xml:
1º passo
copie o arquivo chamado (arquivo.xml) localizado no diretório raiz do projeto
para o diretório que você desejar (exemplo: Área de Trabalho)

2º passo acesse o  arquivo LerArquivoXML.java e localize a seguinte linha:
 xmlArquivo = new File("/home/cristianoaf81/arquivo.xml");
 
 substitua por:

 xmlArquivo = new File("caminho/do/diretorio/onde/esta/arquivo.xml");


3º passo limpe e construa o projeto com o netbeans (pelo menos versão 8.1)