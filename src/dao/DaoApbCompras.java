/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Apb_Compras;
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
public class DaoApbCompras extends DaoApbAbstract{

    @Override
    public void insert(Object object) {
       Apb_Compras apb_Compras = (Apb_Compras) object;
          try {
             Class.forName("com.mysql.jdbc.Driver");
                     String url, user, password;
                     url ="jdbc:mysql://10.7.0.51:33062/db_arielle_bitencourt";
                     user ="marcos_vilhanueva";
                     password ="arielle_bitencourt";

                     Connection cnt;
                     cnt = DriverManager.getConnection(url, user, password);
                             
                String sql= "insert into apb_compras values(?,?,?,?,?,?,?,?)";                
              PreparedStatement pst = cnt.prepareStatement(sql);
              pst.setInt(2, apb_Compras.getApbIdCompras());
              pst.setInt(2, apb_Compras.getApbIdFornecedor());
              pst.setInt(3, apb_Compras.getApbIdProdutos());
              pst.setDate(4,null);// apb_dataCompras
              pst.setInt(6, apb_Compras.getApbQuantidade());
              pst.setDouble(7, apb_Compras.getApbValorUnitario());
              pst.setDouble(8, apb_Compras.getApbTotalCompras());
              pst.executeUpdate();
     
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(DaoApbCompras.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(DaoApbCompras.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    

    @Override
    public void update(Object object) {
        Apb_Compras apb_Compras = (Apb_Compras) object;
    }

    @Override
    public void delete(Object object) {
         Apb_Compras apb_Compras = (Apb_Compras) object;
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
