/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud10.ejer9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejer9 {
    public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/tienda?allowPublicKeyRetrieval=true&useSSL=false","fran", "Fr4n");
			System.out.println("¡Conexión exitosa!");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * FROM producto ORDER BY precio DESC");
			
			System.out.println("Listado de productos: ");
			
			while (rs.next()) {
				System.out.println("Producto " + rs.getString("nombre"));
			}
			
			con.close();
		
		} catch (SQLException e) {
			System.out.println("No se pudo conectar");
			e.printStackTrace();
		}

	}
}
