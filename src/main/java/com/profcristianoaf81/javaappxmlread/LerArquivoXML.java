/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.profcristianoaf81.javaappxmlread;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

/**
 *
 * @author cristianoaf81
 */
public class LerArquivoXML {
    private File xmlArquivo;
    private DocumentBuilderFactory FabricaDocumento;
    private DocumentBuilder ConstrutorDocumento;
    private Document doc;
    private NodeList ListaNos;
    private Node Nos;
    private Element elemento;
    
    public void MostrarDados(){
        try{
            xmlArquivo = new File("/home/cristianoaf81/arquivo.xml");
            FabricaDocumento = DocumentBuilderFactory.newInstance();
            ConstrutorDocumento = FabricaDocumento.newDocumentBuilder();
            doc = ConstrutorDocumento.parse(xmlArquivo);
            doc.getDocumentElement().normalize();
            System.out.println("Elemento raiz :"
                    +doc.getDocumentElement().getNodeName()+" da empresa");
            ListaNos = doc.getElementsByTagName("funcionario");
            System.out.println("---------------------------------");
            
            for(int i = 0; i < ListaNos.getLength();i++){
                Nos = ListaNos.item(i);
                System.out.println("\nElemento Atual : "+ Nos.getNodeName());
                
                if(Nos.getNodeType() == Node.ELEMENT_NODE){
                    elemento =  (Element) Nos;
                    
                    System.out.println("Registro do funcionário: "
                    +elemento.getAttribute("reg"));
                    System.out.println("Nome: "
                            +elemento.getElementsByTagName("nome").item(0)
                                    .getTextContent());
                    System.out.println("Setor: "
                    +elemento.getElementsByTagName("setor").item(0)
                            .getTextContent());
                    System.out.println("Salário: "
                            +elemento.getElementsByTagName("salario").item(0)
                                    .getTextContent());
                    
                }
            }
        
        }catch(IOException | ParserConfigurationException 
                | DOMException | SAXException e){
            System.out.println("Falha: "+e.getMessage());
        }
    
    }
    
}
