/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import static datos.Conexion.*;
import domain.Usuario;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class UsuarioDAO {

    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario (usuario, password) VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario=?, password=? WHERE id_usuario=?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario=?";

    public List<Usuario> seleccionar() {
        Connection conn = null;
        PreparedStatement stm = null;
        Usuario us = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {

            conn = getConnection();
            stm = conn.prepareStatement(SQL_SELECT);
            rs = stm.executeQuery();

            while (rs.next()) {

                int idUsuario = rs.getInt("id_usuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");

                us = new Usuario(idUsuario, usuario, password);

                usuarios.add(us);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(stm);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return usuarios;
    }

    public int insertar(Usuario us) {
        Connection conn = null;
        PreparedStatement stm = null;
        int reg = 0;
        try {

            conn = getConnection();
            stm = conn.prepareStatement(SQL_INSERT);
            stm.setString(1, us.getUsuario());
            stm.setString(2, us.getPassword());
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

    public int eliminar(Usuario us) {
        Connection conn = null;
        PreparedStatement stm = null;
        int reg = 0;
        try {

            conn = getConnection();
            stm = conn.prepareStatement(SQL_DELETE);
            stm.setInt(1, us.getIdPersona());

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

    public int actualizar(Usuario us) {
        Connection conn = null;
        PreparedStatement stm = null;
        int reg = 0;
        try {

            conn = getConnection();
            stm = conn.prepareStatement(SQL_UPDATE);
            stm.setString(1, us.getUsuario());
            stm.setString(2, us.getPassword());
            stm.setInt(3, us.getIdPersona());
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
