/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud10.ejer10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejer10 {
     public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/tienda?allowPublicKeyRetrieval=true&useSSL=false","fran","Fr4n");
            Statement stmt = con.createStatement();

            // Borro todos los registros
            stmt.executeUpdate("DELETE FROM producto");

            // Inserto los nuevos productos
            stmt.executeUpdate("INSERT INTO producto VALUES " + "(1,'manzana','Manzanas golden',50,'Francia')");

            stmt.executeUpdate("INSERT INTO producto VALUES " + "(2,'pera','Peras conferencia',25,'Espana')");

            stmt.executeUpdate("INSERT INTO producto VALUES " + "(3,'uva','Uvas gourmet',30,'Espana')");

            System.out.println("Productos insertados correctamente");
            
            //Modifico el precio de las peras
            stmt.executeUpdate("UPDATE producto SET precio = 20 WHERE nombre = 'pera'");

            System.out.println("Precio de la pera actualizado");

            stmt.close();
            con.close();

        } catch (SQLException e) {

            System.out.println("Error al acceder a la base de datos");
        }
    }
}
