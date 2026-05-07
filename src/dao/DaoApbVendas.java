/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Apb_Vendas;
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
public class DaoApbVendas extends DaoApbAbstract{

    @Override
    public void insert(Object object) {
        Apb_Vendas apb_vendas = (Apb_Vendas) object;
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
              pst.setInt(1, apb_vendas.getApbIdVendas());
              pst.setInt(2, apb_vendas.getApbIdclientes());
              pst.setInt(3, apb_vendas.getApbIdProdutos());
              pst.setDate(4,null);// apb_DataVenda
              pst.setInt(5, apb_vendas.getApbQuantidade());
              pst.setDouble(6, apb_vendas.getApbValorUnitario());
              pst.setDouble(7, apb_vendas.getApbValorTotal());
              pst.setString(7, apb_vendas.getApbVendaPago());
              pst.executeUpdate();
     
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(DaoApbVendas.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(DaoApbVendas.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    @Override
    public void update(Object object) {
     Apb_Vendas apb_vendas = (Apb_Vendas) object;
    }

    @Override
    public void delete(Object object) {
     Apb_Vendas apb_vendas = (Apb_Vendas) object;
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
