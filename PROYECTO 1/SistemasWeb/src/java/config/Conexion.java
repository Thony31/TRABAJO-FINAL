/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;
import java.sql.DriverManager;
import java.sql.Connection;

public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/bd_ventas";
    String user="root";
    String pass="";
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver"); //Carga controlador MySQL
            con=DriverManager.getConnection(url,user,pass); //Establece la conexión
        } catch (Exception e) {
        }
        return con;
    }
}
