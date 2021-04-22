package test;
//NO SE USA
//import com.mysql.cj.xdevapi.Statement;
import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestMySqlJDBC {
    public static void main(String[] args) {
//        Crear cadena de conexión
       var url="jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           try {
               Connection conexion=DriverManager.getConnection(url, "root", "741M");
               //Para crear instrucciones sql
               Statement instruccion = conexion.createStatement();
               var sql="SELECT id_persona,nombre,apellido,email,telefono FROM persona";
               ResultSet resultado=instruccion.executeQuery(sql);
               while(resultado.next()){
                   System.out.print("id_persona: " +resultado.getInt("id_persona"));
                   System.out.print(" Nombre: "+ resultado.getString("nombre"));
                   System.out.print(" Apellido: "+ resultado.getString("apellido"));
                   System.out.print(" Email: "+ resultado.getString("email"));
                   System.out.print(" Telefono: "+ resultado.getString("telefono"));
                   System.out.println("");
               }
               resultado.close();
               instruccion.close();
               conexion.close();
           } catch (SQLException ex) {
              ex.printStackTrace(System.out);
           }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out); //lo mandamos a la salida estandar
        }
    }
}
