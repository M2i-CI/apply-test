/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.m2i.mvc.modeles;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Ramzi
 */
public class Formulaire {
    
    private Utilisateur utilisateur = new Utilisateur();
    private Map<String, String> erreurs = new HashMap<String, String>();
    
    
    public Formulaire(HttpServletRequest request){
        // Récupérer les paramètres
        utilisateur.setNom(request.getParameter("nom"));
        utilisateur.setPrenom(request.getParameter("prenom"));
        utilisateur.setNomDeCompte(request.getParameter("nomDeCompte"));
        utilisateur.setPsw(request.getParameter("psw"));
        String cpsw = request.getParameter("cpsw");
        
        // Vérifier la conformité des paramètres
        String msg= "Il faut au moins 3 caractères !";
        if(!this.longeurChampsCorrecte(utilisateur.getNom()))
            erreurs.put("nom", msg);
        if(!this.longeurChampsCorrecte(utilisateur.getPrenom()))
            erreurs.put("prenom", msg);
        if(!this.longeurChampsCorrecte(utilisateur.getNomDeCompte()))
            erreurs.put("nomDeCompte", msg);
        if(!this.longeurChampsCorrecte(utilisateur.getPsw()))
            erreurs.put("psw", msg);
        if(!this.motDePasseCorrecte(utilisateur.getPsw(), cpsw))
            erreurs.put("cpsw", "Confirmation différente du mot de passe !");
        
    }
    // Méthodes de vérifications des paramètres
    
    private boolean longeurChampsCorrecte(String c){
        return (c.length()>=3);
    }
    
    private boolean motDePasseCorrecte(String psw, String cpsw){
        return psw.equals(cpsw);
    }
    
    // Accesseurs
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }
    
}
