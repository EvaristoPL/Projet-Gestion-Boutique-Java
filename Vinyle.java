package article;

public class Vinyle extends ArticleUnique{

    private int taille;
    private int vitesse;
    private int masse;

    public Vinyle(String reference, String nomAlbum, String nomArtiste, String label, int nbDisque, double prix, int taille, int vitesse, int masse) {
        super(reference, nomAlbum, nomArtiste, label, nbDisque, prix);
        this.taille = taille;       // 12, 10 pouces
        this.vitesse = vitesse;     // 33, 45 tours/min
        this.masse = masse;         // 180g
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public int getMasse() {
        return masse;
    }

    public void setMasse(int masse) {
        this.masse = masse;
    }

    public String toString() {
        return "Vinyle " +
                "{\"Reference\": " + reference
                + ", \"Titre\": " + getNomAlbum()
                + ", \"Artiste\": " + getNomArtiste()
                + ", \"Label\": " + getLabel()
                + ", \"Nombre de disques\": " + getNbDisque()
                + ", \"Prix\": " + getPrix()
                + ", \"Taille\": " + taille
                + ", \"Vitesse\": " + vitesse
                + ", \"Masse d'un disque\": " + masse
                + "}";
    }

}
