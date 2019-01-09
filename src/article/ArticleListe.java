package article;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class ArticleListe implements Serializable {

    private ArrayList<Article> articleListe;

    public ArticleListe() {
        articleListe = new ArrayList();
    }

    public boolean addArticle(Article a) {
        articleListe.add(a);
        return true;
    }

    public boolean rmArticle(Article a) {
        articleListe.remove (a);
        return true;
    }

    public void affiche() {
        Article a = null;
        Iterator<Article> it = articleListe.iterator();
        while(it.hasNext()) {
            a = it.next();
            System.out.println(a.getNomAlbum());
            a = null;
        }
    }

    public Article getArticle(String refRecherche) {
        Article a = null;
        Iterator<Article> it = articleListe.iterator();
        while(it.hasNext()) {
            a = it.next();
            if(a.getReference().equals(refRecherche)) {
                return a;
            }
            a = null;
        }
        return a;
    }

}
