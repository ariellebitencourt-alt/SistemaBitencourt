/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.Apb_Usuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u11174571179
 */
public class DaoApbUsuarios extends DaoApbAbstract{

    @Override
    public void insert(Object object) {
        Apb_Usuarios apb_usuarios = (Apb_Usuarios) object;
       try {
             Class.forName("com.mysql.jdbc.Driver");
                     String url, user, password;
                     url ="jdbc:mysql://10.7.0.51:33062/db_arielle_bitencourt";
                     user ="arielle_bitencourt";
                     password ="arielle_bitencourt";

                     Connection cnt;
                     cnt = DriverManager.getConnection(url, user, password);
                             
                String sql= "insert into apb_comprasprodutos values(?,?,?,?,?,?,?,?)";                
              PreparedStatement pst = cnt.prepareStatement(sql);
              pst.setInt(2, apb_usuarios.getApbIdUsuarios());
              pst.setString(1, apb_usuarios.getApbNome());
              pst.setString(2, apb_usuarios.getApbApelido());
              pst.setString(3, apb_usuarios.getApbCpf());
              pst.setDate(4,null);// apb_DataNascimento
              pst.setString(5, apb_usuarios.getApbNivel());
              pst.setString(6, apb_usuarios.getApbSenha());
              pst.setString(7, apb_usuarios.getApbAtivo());
              pst.executeUpdate();
     
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(DaoApbUsuarios.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(DaoApbUsuarios.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    @Override
    public void update(Object object) {
      Apb_Usuarios apb_usuarios = (Apb_Usuarios) object;
    }

    @Override
    public void delete(Object object) {
        Apb_Usuarios apb_usuarios = (Apb_Usuarios) object;
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
        return null;
    }
    
}
