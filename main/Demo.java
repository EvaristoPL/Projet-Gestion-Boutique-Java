package main;

import article.*;
import boutique.*;
import client.*;
import commande.*;
import donnees.Enregistrement;
import donnees.ExceptionSave;

public class Demo {

    public static void main(String[] args) throws ExceptionSave {

        // Création d'une boutique
        Boutique b = new Boutique("MusicShop", "Rue du Commerce, 91000 Evry", "0123456789", "mail@shop.fr", 500.0, 5400.0, 1000.0);

        // Création des listes
        CommandeListe cm = new CommandeListe();
        ClientListe cl = new ClientListe();
        ArticleListe al = new ArticleListe();

        // Ajout des listes à la boutique
        b.setCommandeListe(cm);
        b.setClientListe(cl);
        b.setArticleListe(al);

        // Création des articles
        Article a1 = new Vinyle("VIN1", "Golden Age EP", "Lenzman", "Metalheadz", 1, 13.0, 12, 45, 90);
        Article a2 = new Vinyle("VIN2", "Wild Grace EP", "Tokyo Prose", "The North Quarter", 1, 20.0, 12, 45, 180);
        Article a3 = new Cd("CD1", "Scorpion", "Drake", "OVO", 1, 10);

        // Création des lots
        Article lot1 = new ArticleLot("VIN1", (ArticleUnique)a1, 10, 0.0);
        Article lot2 = new ArticleLot("VIN2", (ArticleUnique)a2, 100, 0.0);
        Article lot3 = new ArticleLot("CD1", (ArticleUnique)a3, 1, 0.0);

        // Ajout des lots
        al.addArticle(lot1);
        al.addArticle(lot2);
        al.addArticle(lot3);

        // Création des clients
        Client c1 = new Client("Evaristo", "Luis", "Rue de Luis, 91000 Evry");
        Client c2 = new Client("Dan", "Tran", "Rue de Tran, 91000 evry");

        // Ajout des clients
        cl.addClient(c1);
        cl.addClient(c2);

        // Création des commandes
        CommandePanier cp1 = new CommandePanier();
        CommandePanierArticle cpa1 = new CommandePanierArticle(a2, 3);
        CommandePanierArticle cpa2 = new CommandePanierArticle(a3, 5);
        cp1.addArticle(cpa1);
        cp1.addArticle(cpa2);
        Commande cm1 = new Commande(c1, cp1, 0.0, 15.0);
        cm.addCommande(cm1);

        CommandePanier cp2 = new CommandePanier();
        CommandePanierArticle cpa3 = new CommandePanierArticle(a1, 1);
        CommandePanierArticle cpa4 = new CommandePanierArticle(a3, 5);
        cp2.addArticle(cpa3);
        cp2.addArticle(cpa4);
        Commande cm2 = new Commande(c2, cp2, 0.0, 15.0);
        cm.addCommande(cm2);

        CommandePanier cp3 = new CommandePanier();
        CommandePanierArticle cpa5 = new CommandePanierArticle(a2, 1);
        CommandePanierArticle cpa6 = new CommandePanierArticle(a1, 1);
        cp3.addArticle(cpa5);
        cp3.addArticle(cpa6);
        Commande cm3 = new Commande(c1, cp3, 0.0, 15.0);
        cm.addCommande(cm3);

        //Enregistrement sm = new Enregistrement();
        //Boutique b = sm.load("save1");

        /* affichage des listes
        System.out.println("liste d'article");
        System.out.println("------------------");
        //al.affiche();
        b.getArticleListe().affiche();

        System.out.println("------------------");
        System.out.println("liste de clients");
        System.out.println("------------------");
        //cl.affiche();
        b.getClientListe().affiche();

        System.out.println("------------------");
        System.out.println("liste de commandes");
        System.out.println("------------------");
        //cm.affiche();
        b.getCommandeListe().affiche();

        // affichage de commande d'un client spécifique
        System.out.println("------------------");
        System.out.println("commandes d'evaristo");
        System.out.println("------------------");
        //cm.affiche(c1);
        b.getCommandeListe().affiche(0);

        System.out.println("------------------");
        System.out.println("commandes de dan");
        System.out.println("------------------");
        //cm.affiche(c2);
        b.getCommandeListe().affiche(1);*/

        Enregistrement sm = new Enregistrement();
        sm.save(b, "save1");

    }


}
