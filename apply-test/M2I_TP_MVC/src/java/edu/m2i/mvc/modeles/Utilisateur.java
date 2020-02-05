/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.m2i.mvc.modeles;

/**
 *
 * @author Ramzi
 */
public class Utilisateur {
    private String nom;
    private String prenom;
    private String nomDeCompte;
    private String psw;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDeCompte() {
        return nomDeCompte;
    }

    public void setNomDeCompte(String nomDeCompte) {
        this.nomDeCompte = nomDeCompte;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
    
}
