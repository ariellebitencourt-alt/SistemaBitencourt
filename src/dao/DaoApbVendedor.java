/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Apb_Vendedor;
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
public class DaoApbVendedor extends DaoApbAbstract{

    @Override
    public void insert(Object object) {
        Apb_Vendedor apb_vendedor = (Apb_Vendedor) object;
                  try {
             Class.forName("com.mysql.jdbc.Driver");
                     String url, user, password;
                     url ="jdbc:mysql://10.7.0.51:33062/db_arielle_bitencourt";
                     user ="arielle_bitencourt";
                     password ="arielle_bitencourt";

                     Connection cnt;
                     cnt = DriverManager.getConnection(url, user, password);
                             
                String sql= "insert into apb_vendedor values(?,?,?,?,?,?,?,?)";                
              PreparedStatement pst = cnt.prepareStatement(sql);
              pst.setInt(1, apb_vendedor.getApbIdVendedor());
              pst.setString(2, apb_vendedor.getApbNome());
              pst.setString(3, apb_vendedor.getApbCpf());
              pst.setDate(4,null);// apb_DataNascimento
              pst.setString(5, apb_vendedor.getApbEmail());
              pst.setString(6, apb_vendedor.getApbTelefone());
              pst.setString(7, apb_vendedor.getAPbCep());
              pst.setString(8, apb_vendedor.getApbEnderedo());
              pst.setString(9, apb_vendedor.getApbBairro());
              pst.setString(10, apb_vendedor.getApbCidade());
              pst.setString(11, apb_vendedor.getApbNumero());
              pst.setString(12, apb_vendedor.getApbComplemento());
              pst.setDate(13,null);// apb_DataAdmissao
              pst.setString(14, apb_vendedor.getApbAtivo());
              pst.executeUpdate();
     
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(DaoApbVendedor.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(DaoApbVendedor.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }

    @Override
    public void update(Object object) {
     Apb_Vendedor apb_vendedor = (Apb_Vendedor) object;
    }

    @Override
    public void delete(Object object) {
     Apb_Vendedor apb_vendedor = (Apb_Vendedor) object;
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
