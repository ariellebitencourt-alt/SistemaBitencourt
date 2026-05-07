/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.Apb_Produtos;
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
public class DaoApbprodutos extends DaoApbAbstract{

    @Override
    public void insert(Object object) {
        Apb_Produtos apb_produtos = (Apb_Produtos) object; 
        try {
             Class.forName("com.mysql.jdbc.Driver");
                     String url, user, password;
                     url ="jdbc:mysql://10.7.0.51:33062/db_arielle_bitencourt";
                     user ="arielle_bitencourt";
                     password ="arielle_bitencourt";

                     Connection cnt;
                     cnt = DriverManager.getConnection(url, user, password);
                             
                String sql= "insert into apb_produtos values(?,?,?,?,?,?,?,?)";                
              PreparedStatement pst = cnt.prepareStatement(sql);
              pst.setInt(1, apb_produtos.getApbIdProdutos());
              pst.setString(2, apb_produtos.getApbNomeProduto());
              pst.setString(3, apb_produtos.getApbMarca());
              pst.setString(5, apb_produtos.getApbModelo());
              pst.setInt(6, apb_produtos.getApbMemoriaRam());
              pst.setInt(7, apb_produtos.getApbArmazenamento());
              pst.setDouble(8, apb_produtos.getApbPreco());
              pst.executeUpdate();
     
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(DaoApbprodutos.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(DaoApbprodutos.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    @Override
    public void update(Object object) {
    Apb_Produtos apb_produtos = (Apb_Produtos) object; 
    }

    @Override
    public void delete(Object object) {
   Apb_Produtos apb_produtos = (Apb_Produtos) object; 
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
