/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;

/**
 *
 * @author u11174571179
 */
public class Apb_Compras {
  private int ApbIdCompras;
  private int ApbIdFornecedor;
  private int ApbIdProdutos;
  private Date ApbDataCompras;
  private int ApbQuantidade;
  private Double ApbValorUnitario;
  private Double ApbTotalCompras;

    /**
     * @return the ApbIdCompras
     */
    public int getApbIdCompras() {
        return ApbIdCompras;
    }

    /**
     * @param ApbIdCompras the ApbIdCompras to set
     */
    public void setApbIdCompras(int ApbIdCompras) {
        this.ApbIdCompras = ApbIdCompras;
    }

    /**
     * @return the ApbIdFornecedor
     */
    public int getApbIdFornecedor() {
        return ApbIdFornecedor;
    }

    /**
     * @param ApbIdFornecedor the ApbIdFornecedor to set
     */
    public void setApbIdFornecedor(int ApbIdFornecedor) {
        this.ApbIdFornecedor = ApbIdFornecedor;
    }

    /**
     * @return the ApbIdProdutos
     */
    public int getApbIdProdutos() {
        return ApbIdProdutos;
    }

    /**
     * @param ApbIdProdutos the ApbIdProdutos to set
     */
    public void setApbIdProdutos(int ApbIdProdutos) {
        this.ApbIdProdutos = ApbIdProdutos;
    }

    /**
     * @return the ApbDataCompras
     */
    public Date getApbDataCompras() {
        return ApbDataCompras;
    }

    /**
     * @param ApbDataCompras the ApbDataCompras to set
     */
    public void setApbDataCompras(Date ApbDataCompras) {
        this.ApbDataCompras = ApbDataCompras;
    }

    /**
     * @return the ApbQuantidade
     */
    public int getApbQuantidade() {
        return ApbQuantidade;
    }

    /**
     * @param ApbQuantidade the ApbQuantidade to set
     */
    public void setApbQuantidade(int ApbQuantidade) {
        this.ApbQuantidade = ApbQuantidade;
    }

    /**
     * @return the ApbValorUnitario
     */
    public Double getApbValorUnitario() {
        return ApbValorUnitario;
    }

    /**
     * @param ApbValorUnitario the ApbValorUnitario to set
     */
    public void setApbValorUnitario(Double ApbValorUnitario) {
        this.ApbValorUnitario = ApbValorUnitario;
    }

    /**
     * @return the ApbTotalCompras
     */
    public Double getApbTotalCompras() {
        return ApbTotalCompras;
    }

    /**
     * @param ApbTotalCompras the ApbTotalCompras to set
     */
    public void setApbTotalCompras(Double ApbTotalCompras) {
        this.ApbTotalCompras = ApbTotalCompras;
    }
}
