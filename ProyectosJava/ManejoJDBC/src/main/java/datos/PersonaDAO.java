package datos;

import static datos.Conexion.*;
import domain.Persona;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaDAO {

    private static final String SQL_SELECT = "SELECT id_persona,nombre,apellido,email,telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona (nombre,apellido,email,telefono) VALUES (?,?,?,?)"; //codigo duro
    private static final String SQL_DELETE = "DELETE FROM persona where id_persona=?";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=?, email=?, telefono=? where id_persona=?";

    public List<Persona> seleccionar() { //metodo crear lista de personas
        Connection conn = null; //se inicializan
        PreparedStatement stm = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        try {
            conn = getConnection(); //CREAMOS LA CONEXION
              //iMPLEMENTAMOS INTERFACE
            stm = conn.prepareStatement(SQL_SELECT);
            rs = stm.executeQuery();
            while (rs.next()) {
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                persona = new Persona(idPersona, nombre, apellido, email, telefono);
                personas.add(persona);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }//cerrar los objetos con finally
        finally {
            try {
                close(rs);
                close(stm);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return personas;
    }

    public int insertar(Persona persona) {
        Connection conn = null;
        PreparedStatement stm = null;
        int reg = 0;
        try {

            conn = getConnection();
            stm = conn.prepareStatement(SQL_INSERT);
            stm.setString(1, persona.getNombre());
            stm.setString(2, persona.getApellido());
            stm.setString(3, persona.getEmail());
            stm.setString(4, persona.getTelefono());
            reg = stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stm);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return reg;
    }

    public int eliminar(Persona persona) {
        Connection conn = null;
        PreparedStatement stm = null;
        int reg = 0;
        try {
            conn = getConnection();
            stm = conn.prepareStatement(SQL_DELETE);
            stm.setInt(1, persona.getIdPersona());
            reg = stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stm);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return reg;

    }

    public int actualizar(Persona Persona) {
        Connection conn = null;
        //Para ejecutar declaraciónes sql
        PreparedStatement stm = null;
        int reg = 0;
        try {

            conn = getConnection();
            stm = conn.prepareStatement(SQL_UPDATE);

            stm.setString(1, Persona.getNombre());
            stm.setString(2, Persona.getApellido());
            stm.setString(3, Persona.getEmail());
            stm.setString(4, Persona.getTelefono());
            stm.setInt(5, Persona.getIdPersona());
            reg = stm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stm);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return reg;
    }
}
