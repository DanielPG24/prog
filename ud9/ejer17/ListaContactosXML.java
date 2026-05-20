/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud9.ejer17;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.File;
import java.util.ArrayList;
import prog.comun.Persona;

public class ListaContactosXML extends Persona{

    public static void main(String[] args) {

        try {

            //LISTA DE PERSONAS
            ArrayList<Persona> contactos = new ArrayList<>();

            contactos.add(new Persona("Ana", "Lopez",  "22"));

            contactos.add(new Persona("Carlos", "Ruiz", "32"));

            contactos.add(new Persona("Maria", "Gomez", "62"));

            // ===== CREAR DOCUMENTO XML =====
            DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = factory.newDocumentBuilder();

            Document documento = builder.newDocument();

            //NODO RAÍZ
            Element raiz = documento.createElement("contactos");
            documento.appendChild(raiz);

            //RECORRER LISTA
            for (Persona p : contactos) {

                // Nodo persona
                Element persona = documento.createElement("persona");

                // Nodo nombre
                Element nombre = documento.createElement("nombre");
                nombre.setTextContent(p.getNombre());

                // Nodo apellido
                Element apellido = documento.createElement("apellido");
                apellido.setTextContent(p.getApellido());

                // Nodo edad
                Element edad = documento.createElement("edad");
                edad.setTextContent(p.getEdad());

                // Añadir datos a persona
                persona.appendChild(nombre);
                persona.appendChild(apellido);
                persona.appendChild(edad);

                // Añadir persona al raíz
                raiz.appendChild(persona);
            }

            //EXPORTAR XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();

            Transformer transformer = transformerFactory.newTransformer();

            // Formato bonito
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");

            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount","4");

            // Archivo XML
            DOMSource source = new DOMSource(documento);

            StreamResult result = new StreamResult(new File("contactos_DanPino.xml"));

            transformer.transform(source, result);

            System.out.println("Archivo XML generado correctamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
