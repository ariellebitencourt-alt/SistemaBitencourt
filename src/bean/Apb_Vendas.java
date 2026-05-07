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
public class Apb_Vendas {
    private int ApbIdVendas;
    private int ApbIdclientes;
    private int ApbIdProdutos;
    private Date ApbDataVenda;
    private int ApbQuantidade;
    private Double ApbValorUnitario;
    private Double ApbValorTotal;
    private String ApbVendaPago;

    /**
     * @return the ApbIdVendas
     */
    public int getApbIdVendas() {
        return ApbIdVendas;
    }

    /**
     * @param ApbIdVendas the ApbIdVendas to set
     */
    public void setApbIdVendas(int ApbIdVendas) {
        this.ApbIdVendas = ApbIdVendas;
    }

    /**
     * @return the ApbIdclientes
     */
    public int getApbIdclientes() {
        return ApbIdclientes;
    }

    /**
     * @param ApbIdclientes the ApbIdclientes to set
     */
    public void setApbIdclientes(int ApbIdclientes) {
        this.ApbIdclientes = ApbIdclientes;
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
     * @return the ApbdataVenda
     */
    public Date getApbDataVenda() {
        return ApbDataVenda;
    }

    /**
     * @param ApbDataVenda the ApbdataVenda to set
     */
    public void setApbDataVenda(Date ApbDataVenda) {
        this.ApbDataVenda = ApbDataVenda;
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
     * @return the ApbValorTotal
     */
    public Double getApbValorTotal() {
        return ApbValorTotal;
    }

    /**
     * @param ApbValorTotal the ApbValorTotal to set
     */
    public void setApbValorTotal(Double ApbValorTotal) {
        this.ApbValorTotal = ApbValorTotal;
    }

    /**
     * @return the ApbVendaPago
     */
    public String getApbVendaPago() {
        return ApbVendaPago;
    }

    /**
     * @param ApbVendaPago the ApbVendaPago to set
     */
    public void setApbVendaPago(String ApbVendaPago) {
        this.ApbVendaPago = ApbVendaPago;
    }
}
