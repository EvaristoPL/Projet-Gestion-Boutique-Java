
package article;

public abstract class ArticleUnique extends Article {

    private String nomAlbum;
    private String nomArtiste;
    private String label;
    private int nbDisque;
    private double prix;
    private double coutObtention;

    public ArticleUnique(String reference, String nomAlbum, String nomArtiste, String label, int nbDisque, double prix) {
        super(reference);
        this.nomAlbum = nomAlbum;
        this.nomArtiste = nomArtiste;
        this.label = label;
        this.nbDisque = nbDisque;
        this.prix = prix;
    }

    @Override
    public String getNomAlbum() {
        return nomAlbum;
    }

    @Override
    public String getNomArtiste() {
        return nomArtiste;
    }

    @Override
    public double getPrix() {
        return prix;
    }

    public String getLabel() {
        return label;
    }

    public int getNbDisque() {
        return nbDisque;
    }

    public double getCoutObtention() {
        return coutObtention;
    }

}
