package client;

import java.io.Serializable;

public class Client implements Serializable {

    private int numero;
    private static int incrementeur;
    private String prenom;
    private String nom;
    private String adressePostale;

    public Client(String prenom, String nom, String adressePostale) {
        this.prenom = prenom;
        this.nom = nom;
        this.adressePostale = adressePostale;
        numero = incrementeur;
        incrementeur += 1;
    }

    public int getNumero() {
        return numero;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdressePostale() {
        return adressePostale;
    }

    public void setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
    }

    public String toString() {
        return "Client " +
                "{\"Numero\": " + numero
                + ", \"Prenom\": " + prenom
                + ", \"Nom\": " + nom
                + ", \"Adresse\": " + adressePostale
                + "}";
    }
}
