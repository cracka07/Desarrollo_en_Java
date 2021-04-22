package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuario {
    public static void main(String[] args) {
        
       UsuarioDAO user=new UsuarioDAO();
       
//       Usuario usInsert=new Usuario("Carlos", "45ds13");
//       user.insertar(usInsert);
//       
//       Usuario usDelete=new Usuario(3);
//       user.eliminar(usDelete);
//       
       Usuario usUpdate=new Usuario(1,"Eduardo", "456dfas45");
       user.actualizar(usUpdate);
       
       List<Usuario> usuarios=user.seleccionar();
       
       usuarios.forEach(usuario-> {
            System.out.println("Usuarios:" + usuario);
       });
      
    }
}
