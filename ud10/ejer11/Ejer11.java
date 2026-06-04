/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud10.ejer11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejer11 {
    public static void main(String[] args) {

        try {

        	Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/tienda?allowPublicKeyRetrieval=true&useSSL=false", "fran", "Fr4n");
        	Statement stmt = con.createStatement();
        	
        	//Mueestro los productos españoles usando execute
        	
        	boolean resultado = stmt.execute("SELECT * FROM producto WHERE pais='Espana'");
        	
        	//Si devuelve true eso es que hay algún ResultSet
        	if(resultado) {
        		// Cojo los resultados de la consulta
        	    ResultSet rs = stmt.getResultSet();
        	    
        	    // Recorro todos los registros obtenidos
        	    while(rs.next()) {

        	        System.out.println(
        	        		rs.getInt("id") + " - " + rs.getString("nombre") + " - " + rs.getString("pais")
        	        );
        	    }

        	    rs.close();
        	}
        	
        	// Ejecutar un lote de consultas batch

        	stmt.addBatch("INSERT INTO producto VALUES " + "(4,'kiwi','Zaspri gold',120,'Nueva Zelanda')");

        	stmt.addBatch("INSERT INTO producto VALUES " + "(5,'perito','Peritos de Tavizna',18,'Espana')");

        	stmt.addBatch("INSERT INTO producto VALUES " + "(6,'platano','Platano canario',40,'Espana')"
        	);
        	
        	//Ejecutar el lote 
        	stmt.executeBatch();
        	
        	System.out.println("Batch ejecutado correctamente");

        	stmt.close();
        	con.close();

        } catch (SQLException e) {

            System.out.println("Error al acceder a la base de datos");
        }
    }
}
