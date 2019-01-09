package client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class ClientListe implements Serializable {

    ArrayList<Client> clientListe;

    public ClientListe() {
        clientListe = new ArrayList();
    }

    public boolean addClient(Client c) {
        clientListe.add(c);
        return true;
    }

    public boolean rmClient(Client c) {
        clientListe.remove (c);
        return true;
    }

    public void affiche() {
        Client c = null;
        Iterator<Client> it = clientListe.iterator();
        while(it.hasNext()) {
            c = it.next();
            System.out.println(c.toString());
            c = null;
        }
    }

    public Client getClient(int numRecherche) {
        Client c = null;
        Iterator<Client> it = clientListe.iterator();
        while(it.hasNext()) {
            c = it.next();
            if(c.getNumero() == numRecherche) {
                return c;
            }
            c = null;
        }
        return c;
    }

}
