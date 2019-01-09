package article;

public class Cd extends ArticleUnique {

    public Cd(String reference, String nomAlbum, String nomArtiste, String label, int nbDisque, double prix) {
        super(reference, nomAlbum, nomArtiste, label, nbDisque, prix);
    }

    public String toString() {
        return "CD " +
                "{\"Reference\": " + reference
                + ", \"Titre\": " + getNomAlbum()
                + ", \"Artiste\": " + getNomArtiste()
                + ", \"Label\": " + getLabel()
                + ", \"Nombre de disques\": " + getNbDisque()
                + ", \"Prix\": " + getPrix()
                + "}";
    }

}
