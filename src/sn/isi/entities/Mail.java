/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.isi.entities;

/**
 *
 * @author khadi
 */
public class Mail {

    private int idMail;
    private String objet;
    private String corps;
    private Client client = new Client();

    public Mail() {
    }

    public Mail(int idMail, String objet, String corps) {
        this.idMail = idMail;
        this.objet = objet;
        this.corps = corps;
    }

    public int getIdMail() {
        return idMail;
    }

    public void setIdMail(int idMail) {
        this.idMail = idMail;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
