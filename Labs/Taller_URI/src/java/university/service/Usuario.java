package university.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DANIELAROSERO
 */
public class Usuario {
    String idUsuario;
    String nombreUsuario;
    String password;
    String permisos;
    
        public Usuario(){
    }
      public static void main(String[] args){
 
    }
    private Conexion conexion = new Conexion();
    public Usuario(String idUsuario, String nombreUsuario, String password, String permisos) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.permisos = permisos;
    }

    public void AgregarUsuario(Usuario usuario) {
        //Cargar la Conexion
        Connection con = conexion.getConnection();
        Statement st;
        //Creamos las sentenia sql
        String sql = "INSERT INTO usuario (IdUsuario,NombreUsuario,password,permisos) "
                + "VALUES ('" + usuario.getIdUsuario() + "','" + usuario.getNombreUsuario() + "','" + usuario.getPassword() + "','" + usuario.getPermisos() +"')";
        //Ejecutamos la sentencia SQL
        try {
            st = con.createStatement();
            st.executeUpdate(sql);
            //Cerramos las conexiones 
            st.close();
            con.close();
        }//Permite determinar los errores 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error no se puede registrar usuario");
        }

    }


    public void EliminarUsuario(String n) {
        Connection con = conexion.getConnection();
        Statement st;
        //Creamos las sentenia sql
        String sql = "DELETE FROM usuario WHERE IdUsuario='" + n + "'";
        //Ejecutamos la sentencia SQL
        try {
            st = con.createStatement();
            int confirmar = st.executeUpdate(sql);
            if (confirmar == 1) {
                JOptionPane.showMessageDialog(null,"Registro eliminado con exito!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Error no existe usuario");
            }
            //Cerramos las conexiones 
            st.close();
            con.close();
        }//Permite determinar los errores 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error no se elimino el usuario");
        }
    }

    
  public String ListUsuario(){
   Connection con = conexion.getConnection();
        Statement st;
        ResultSet rs;
        String sql = "SELECT * FROM 'usuario'";
        String list="";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
               list=list+("IdUsuario:" + rs.getString(1) + " NombreUsuario:" + rs.getString(2) + " password:" + rs.getString(3) + " permisos:" + rs.getFloat(4) +"\n");

            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a los datos de usuarios");
        }
        return list;
}

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }
    
    
}
