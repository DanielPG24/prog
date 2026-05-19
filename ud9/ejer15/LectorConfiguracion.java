/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud9.ejer15;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
/**
 *
 * @author 12_1DAW_Alum
 */
public class LectorConfiguracion {
     public static void main(String[] args) {
        try {
            //TODO: 1. Crear la factoría y el constructor de documentos
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = factory.newDocumentBuilder();

            //TODO: 2. Parsear el archivo XML
            Document documento = builder.parse(new File("config.xml"));

            // Opcional pero recomendado: Normaliza el árbol XML
            documento.getDocumentElement().normalize();

            //TODO: 3. Obtener el elemento raíz (<configuracion>)
            Element raiz = documento.getDocumentElement();

            System.out.println("Raíz: " + raiz.getNodeName());
            
            //TODO: 4. Obtener los hijos de <base-datos>
            NodeList listaBaseDatos = documento.getElementsByTagName("base-datos");
            // Tomamos el primero
            Node nodoBaseDatos =  listaBaseDatos.item(0);
            
            //TODO: 5. Vamos a ver sus hijos directos
            NodeList hijos = nodoBaseDatos.getChildNodes();
            System.out.println("\nNúmero de hijos detectados: " + hijos);
            
            System.out.println("--- Listando hijos ---");
            
           //TODO: Mostrar todos los nodos
             for (int i = 0; i < hijos.getLength(); i++) {

                Node hijo = hijos.item(i);

                if (hijo.getNodeType() == Node.ELEMENT_NODE) {

                    Element elemento = (Element) hijo;

                    System.out.println(
                            elemento.getTagName()
                            + ": "
                            + elemento.getTextContent()
                    );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
