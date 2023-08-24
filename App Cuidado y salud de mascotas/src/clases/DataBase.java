package clases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBase {
    
    Connection conexion;
    Statement manipularDB;
    
    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String user_name = "root";
        String password = "";
        String database_name = "mascotas";
        
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;
        
        try {
            this.conexion = DriverManager.getConnection(url, user_name, password);
            this.manipularDB = this.conexion.createStatement();
            System.out.println("Conexion a DataBase Exitosa.");
            
        } catch (SQLException ex) {
            System.out.println("Error en conexion a base de dato: "+ex.getMessage());
        }
    }
    
    public boolean insertarUsuario(String cedula, String nombre, String apellidos, String correo, String usuario, String contrasena){
        boolean respuesta = false;
        
        try {
            String consulta = "INSERT INTO mascotas (documento, nombre, apellidos, email, correo, usuario, contrasena) VALUES ('"+cedula+"','"+nombre+"','"+apellidos+"','"+correo+"','"+usuario+"','"+contrasena+"')";
            int resultado = this.manipularDB.executeUpdate(consulta);
            if (resultado==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar: "+ex.getMessage());
        }
        
        return respuesta;
    }

    
}
