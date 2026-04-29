/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.math.BigDecimal;
import java.util.Date;
import jdk.jfr.Timestamp;

/**
 *
 * @author u11174571179
 */
public class Apb_Clientes {
    private int ApbIdCliente;
    private String ApbNome ;
    private String ApbCpf;
    private String ApbEmail;
    private String ApbTelefone;
    private String ApbEndereco;
    private Date ApbDataNascimento;
    private String ApbCidade;
    private String ApbCep;
    private Timestamp ApbUltimoLogin;
    private Date ApbDataCadasto;
    private Double ApbLimiteCredito;
    private String ApbGenero;
    private Boolean ApbClientePremium;

    /**
     * @return the ApbIdCliente
     */
    public int getApbIdCliente() {
        return ApbIdCliente;
    }

    /**
     * @param ApbIdCliente the ApbIdCliente to set
     */
    public void setApbIdCliente(int ApbIdCliente) {
        this.ApbIdCliente = ApbIdCliente;
    }

    /**
     * @return the ApbNome
     */
    public String getApbNome() {
        return ApbNome;
    }

    /**
     * @param ApbNome the ApbNome to set
     */
    public void setApbNome(String ApbNome) {
        this.ApbNome = ApbNome;
    }

    /**
     * @return the ApbCpf
     */
    public String getApbCpf() {
        return ApbCpf;
    }

    /**
     * @param ApbCpf the ApbCpf to set
     */
    public void setApbCpf(String ApbCpf) {
        this.ApbCpf = ApbCpf;
    }

    /**
     * @return the ApbEmail
     */
    public String getApbEmail() {
        return ApbEmail;
    }

    /**
     * @param ApbEmail the ApbEmail to set
     */
    public void setApbEmail(String ApbEmail) {
        this.ApbEmail = ApbEmail;
    }

    /**
     * @return the ApbTelefone
     */
    public String getApbTelefone() {
        return ApbTelefone;
    }

    /**
     * @param ApbTelefone the ApbTelefone to set
     */
    public void setApbTelefone(String ApbTelefone) {
        this.ApbTelefone = ApbTelefone;
    }

    /**
     * @return the ApbEndereco
     */
    public String getApbEndereco() {
        return ApbEndereco;
    }

    /**
     * @param ApbEndereco the ApbEndereco to set
     */
    public void setApbEndereco(String ApbEndereco) {
        this.ApbEndereco = ApbEndereco;
    }

    /**
     * @return the ApbDataNascimento
     */
    public Date getApbDataNascimento() {
        return ApbDataNascimento;
    }

    /**
     * @param ApbDataNascimento the ApbDataNascimento to set
     */
    public void setApbDataNascimento(Date ApbDataNascimento) {
        this.ApbDataNascimento = ApbDataNascimento;
    }

    /**
     * @return the ApbCidade
     */
    public String getApbCidade() {
        return ApbCidade;
    }

    /**
     * @param ApbCidade the ApbCidade to set
     */
    public void setApbCidade(String ApbCidade) {
        this.ApbCidade = ApbCidade;
    }

    /**
     * @return the ApbCep
     */
    public String getApbCep() {
        return ApbCep;
    }

    /**
     * @param ApbCep the ApbCep to set
     */
    public void setApbCep(String ApbCep) {
        this.ApbCep = ApbCep;
    }

    /**
     * @return the ApbUltimoLogin
     */
    public Timestamp getApbUltimoLogin() {
        return ApbUltimoLogin;
    }

    /**
     * @param ApbUltimoLogin the ApbUltimoLogin to set
     */
    public void setApbUltimoLogin(Timestamp ApbUltimoLogin) {
        this.ApbUltimoLogin = ApbUltimoLogin;
    }

    /**
     * @return the ApbDataCadasto
     */
    public Date getApbDataCadasto() {
        return ApbDataCadasto;
    }

    /**
     * @param ApbDataCadasto the ApbDataCadasto to set
     */
    public void setApbDataCadasto(Date ApbDataCadasto) {
        this.ApbDataCadasto = ApbDataCadasto;
    }

    /**
     * @return the ApbLimiteCredito
     */
    public Double getApbLimiteCredito() {
        return ApbLimiteCredito;
    }

    /**
     * @param ApbLimiteCredito the ApbLimiteCredito to set
     */
    public void setApbLimiteCredito(BigDecimal ApbLimiteCredito) {
        this.ApbLimiteCredito = ApbLimiteCredito;
    }

    /**
     * @return the ApbGenero
     */
    public String getApbGenero() {
        return ApbGenero;
    }

    /**
     * @param ApbGenero the ApbGenero to set
     */
    public void setApbGenero(String ApbGenero) {
        this.ApbGenero = ApbGenero;
    }

    /**
     * @return the ApbClientePremium
     */
    public Boolean getApbClientePremium() {
        return ApbClientePremium;
    }

    /**
     * @param ApbClientePremium the ApbClientePremium to set
     */
    public void setApbClientePremium(Boolean ApbClientePremium) {
        this.ApbClientePremium = ApbClientePremium;
    }
}
