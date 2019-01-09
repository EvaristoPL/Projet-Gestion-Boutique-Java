package article;

import java.io.Serializable;

public abstract class Article implements Serializable {

    String reference;

    Article(String reference) {
        this.reference = reference;
    }

    public abstract String getNomAlbum();

    public abstract String getNomArtiste();

    public abstract double getPrix();

    public String getReference() {
        return reference;
    }

}
