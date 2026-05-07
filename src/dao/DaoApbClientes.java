/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.Apb_Clientes;
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
public class DaoApbClientes extends DaoApbAbstract{

    @Override
    public void insert(Object object) {
        Apb_Clientes apb_Clientes = (Apb_Clientes)  object;
         try {
             Class.forName("com.mysql.jdbc.Driver");
                     String url, user, password;
                     url ="jdbc:mysql://10.7.0.51:33062/db_arielle_bitencourt";
                     user ="arielle_bitencourt";
                     password ="arielle_bitencourt";

                     Connection cnt;
                     cnt = DriverManager.getConnection(url, user, password);
                             
                String sql= "insert into apb_clientes values(?,?,?,?,?,?,?,?)";                
              PreparedStatement pst = cnt.prepareStatement(sql);
              pst.setInt(2, apb_Clientes.getApbIdCliente());
              pst.setString(2, apb_Clientes.getApbNome());
              pst.setString(3, apb_Clientes.getApbCpf());
              pst.setString(4, apb_Clientes.getApbEmail());
              pst.setDate(5, null);//apb_datanascimento
              pst.setString(6, apb_Clientes.getApbTelefone());
              pst.setString(7, apb_Clientes.getApbEndereco());
              pst.setString(8, apb_Clientes.getApbCidade());
              pst.setString(8, apb_Clientes.getApbCep());
              pst.setDate(8,null);// apb_UltimoLogin())
              pst.setDate(5,null );//apb_DataCadasto
              pst.setDouble(8, apb_Clientes.getApbLimiteCredito());
              pst.setString(8, apb_Clientes.getApbGenero());
              pst.setDate(8,null);// apb_ClientePremium())
              pst.executeUpdate();
     
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(DaoApbClientes.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(DaoApbClientes.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    

    @Override
    public void update(Object object) {
        Apb_Clientes apb_Clientes = (Apb_Clientes)  object;
    }

    @Override
    public void delete(Object object) {
         Apb_Clientes apb_Clientes = (Apb_Clientes)  object;
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
