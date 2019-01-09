package boutique;

import article.ArticleListe;
import client.ClientListe;
import commande.CommandeListe;
import java.io.Serializable;

public class Boutique implements Serializable {

    private String name;
    private String adressePostale;
    private String numeroTelephone;
    private String email;
    double charge;
    double salaire;  // salaire totale
    double loyer;
    ClientListe clientListe;
    CommandeListe commandeListe;
    ArticleListe stock;

    public Boutique(String name, String adressePostale, String numeroTelephone, String email, double charge, double salaire, double loyer) {
        this.name            = name;
        this.adressePostale  = adressePostale;
        this.numeroTelephone = numeroTelephone;
        this.email           = email;
        this.charge          = charge;
        this.salaire         = salaire;
        this.loyer           = loyer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdressePostale() {
        return adressePostale;
    }

    public void setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getLoyer() {
        return loyer;
    }

    public void setLoyer(double loyer) {
        this.loyer = loyer;
    }

    public double getCoutDeFonctionnement() {
        double cout = this.charge + this.loyer + this.salaire;
        return cout;
    }

    public void setCommandeListe(CommandeListe commandeListe) {
        this.commandeListe = commandeListe;
    }

    public void setClientListe(ClientListe clientListe) {
        this.clientListe = clientListe;
    }

    public void setArticleListe(ArticleListe stock) {
        this.stock = stock;
    }

    public CommandeListe getCommandeListe() {
        return commandeListe;
    }

    public ClientListe getClientListe() {
        return clientListe;
    }

    public ArticleListe getArticleListe() {
        return stock;
    }
}
