/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Apb_Fornecedor;
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
public class DaoApbFornecedor extends DaoApbAbstract{

    @Override
    public void insert(Object object) {
     Apb_Fornecedor apb_fornecedor = (Apb_Fornecedor) object;
     try {
             Class.forName("com.mysql.jdbc.Driver");
                     String url, user, password;
                     url ="jdbc:mysql://10.7.0.51:33062/db_arielle_bitencourt";
                     user ="arielle_bitencourt";
                     password ="arielle_bitencourt";

                     Connection cnt;
                     cnt = DriverManager.getConnection(url, user, password);
                             
                String sql= "insert into apb_fornecedor values(?,?,?,?,?,?,?,?)";                
              PreparedStatement pst = cnt.prepareStatement(sql);
              pst.setInt(2, apb_fornecedor.getApbIdFornecedor());
              pst.setString(1, apb_fornecedor.getApbNomeEmpresa());
              pst.setString(2, apb_fornecedor.getApbCnpj());
              pst.setString(3, apb_fornecedor.getApbEmail());
              pst.setString(4, apb_fornecedor.getApbTelefone());
              pst.setString(5, apb_fornecedor.getApbEndereco());
              pst.setString(6, apb_fornecedor.getApbCidade());
              pst.setString(7, apb_fornecedor.getApbEstado());
              pst.setString(8, apb_fornecedor.getApbCep());
              pst.setString(9, apb_fornecedor.getApbContatoResponsavel());
              pst.setString(10, apb_fornecedor.getApbMarcafornecida());
              pst.setString(11, apb_fornecedor.getApbPrazoEntrega());
              pst.setDouble(12, apb_fornecedor.getApbDataAvaliacao());
              pst.setDate(13,null);// apb_dataCadastro
              pst.setString(14, apb_fornecedor.getApbAtivo());
              pst.executeUpdate();
     
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(DaoApbFornecedor.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(DaoApbFornecedor.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    @Override
    public void update(Object object) {
       Apb_Fornecedor apb_fornecedor = (Apb_Fornecedor) object;
    }

    @Override
    public void delete(Object object) {
       Apb_Fornecedor apb_fornecedor = (Apb_Fornecedor) object;
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
