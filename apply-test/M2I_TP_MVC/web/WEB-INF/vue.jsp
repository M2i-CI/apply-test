<%-- 
    Document   : vue
    Created on : 1 avr. 2018, 18:10:11
    Author     : Ramzi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inscription</title>
    </head>
    <body>
        <h1>Page d'inscription</h1>
        <c:if test="${!requestScope.formulaire.erreurs.isEmpty()}">
        <div>
            <form action="inscription" method="POST">
                <input type="text" name="nom" placeholder="Nom" value="${requestScope.formulaire.utilisateur.nom}"/>
                <c:out value='<span style="color: red">${requestScope.formulaire.erreurs.get("nom")}</span>' escapeXml='false'/>     <br>
                <input type="text" name="prenom" placeholder="Prenom" value="${requestScope.formulaire.utilisateur.prenom}"/>
                <c:out value='<span style="color: red">${requestScope.formulaire.erreurs.get("prenom")}</span>' escapeXml='false'/>     <br>
                <input type="text" name="nomDeCompte" placeholder="Nom de compte" value="${requestScope.formulaire.utilisateur.nomDeCompte}"/>
                <c:out value='<span style="color: red">${requestScope.formulaire.erreurs.get("nomDeCompte")}</span>' escapeXml='false'/>     <br>
                <input type="password" name="psw" placeholder="Mot de passe" />
                <c:out value='<span style="color: red">${requestScope.formulaire.erreurs.get("psw")}</span>' escapeXml='false'/>     <br>
                <input type="password" name="cpsw" placeholder="Confirmation du mot de passe"/>
                 <c:out value='<span style="color: red">${requestScope.formulaire.erreurs.get("cpsw")}</span>' escapeXml='false'/>     <br>
                <input type="submit" value="Inscription"/><br>
            </form>
        </div>
        </c:if>
        <c:if test="${requestScope.formulaire.erreurs.isEmpty()}">
        <div>
            <h2>Vous êtes inscrit avec les informations suivantes :</h2>
            Nom : ${requestScope.formulaire.utilisateur.nom}<br>
            Prenom : ${requestScope.formulaire.utilisateur.prenom}<br>
            Nom de compte : ${requestScope.formulaire.utilisateur.nomDeCompte}<br>
        </div>
        </c:if>
    </body>
</html>
