/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Apb_CompraProdutos;
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
public class DaoApbComprasProdutos extends DaoApbAbstract{
         
    @Override
    public void insert(Object object) {
       Apb_CompraProdutos apb_compraprodutos = (Apb_CompraProdutos) object;
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
              pst.setInt(2, apb_compraprodutos.getApbIdCompraProdutos());
              pst.setInt(2, apb_compraprodutos.getApbIdCompra());
              pst.setInt(3, apb_compraprodutos.getApbIdProduto());
              pst.setInt(6, apb_compraprodutos.getApbIdQuantidade());
              pst.setDouble(7, apb_compraprodutos.getApbValorUnitario());
              pst.setDouble(8, apb_compraprodutos.getApbDesconto());
              pst.setDouble(8, apb_compraprodutos.getApbTotalItem());
              pst.executeUpdate();
     
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(DaoApbComprasProdutos.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(DaoApbComprasProdutos.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    @Override
    public void update(Object object) {
        Apb_CompraProdutos apb_compraprodutos = (Apb_CompraProdutos) object;
    }

    @Override
    public void delete(Object object) {
      Apb_CompraProdutos apb_compraprodutos = (Apb_CompraProdutos) object;
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
