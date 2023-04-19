package model;

import java.util.ArrayList;
import java.util.Date;

public class Invoice {

    private String idInvoice;
    private String nameCompany;
    private String cnpj;
    private String nameClient;
    private ArrayList<Product> lCommodity;
    private Date dIssue;
    private Date validity;

    public Invoice(String idInvoice, String nameCompany, String cnpj, String nameClient, ArrayList<Product> lCommodity, Date dIssue, Date validity) {
        this.idInvoice = idInvoice;
        this.nameCompany = nameCompany;
        this.cnpj = cnpj;
        this.nameClient = nameClient;
        this.lCommodity = lCommodity;
        this.dIssue = dIssue;
        this.validity = validity;
    }

    public String getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(String idInvoice) {
        this.idInvoice = idInvoice;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public ArrayList<Product> getlCommodity() {
        return lCommodity;
    }

    public void setlCommodity(ArrayList<Product> lCommodity) {
        this.lCommodity = lCommodity;
    }

    public Date getdIssue() {
        return dIssue;
    }

    public void setdIssue(Date dIssue) {
        this.dIssue = dIssue;
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }
}
