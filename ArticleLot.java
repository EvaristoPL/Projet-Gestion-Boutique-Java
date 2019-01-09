package article;

public class ArticleLot extends Article {

    Article article;
    int quantite;
    double reduction;

    public ArticleLot(String reference, Article article, int quantite, double reduction) {
        super(reference);
        this.article = article;
        this.quantite = quantite;
        this.reduction = reduction;
    }

    @Override
    public double getPrix() {
        return 0;
    }

    public double getReduction() {
        return this.quantite*article.getPrix()*((100-this.reduction)/100);
    }

    public String getNomArtiste() {
        return article.getNomArtiste();
    }

    public String getNomAlbum() {
        return "Lot de " + this.quantite + " " + article.toString();
    }

}
