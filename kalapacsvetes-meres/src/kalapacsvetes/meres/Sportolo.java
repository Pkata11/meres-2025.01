
package kalapacsvetes.meres;

/**
 *
 * @author kpetr
 */
public class Sportolo {
     private String nev;
    private String orszag;
    private int ev;
    private double dobottTomeg;
    private double eredmeny;

    public Sportolo(String nev, String orszag, int ev, double dobottTomeg, double eredmeny) {
        this.nev = nev;
        this.orszag = orszag;
        this.ev = ev;
        this.dobottTomeg = dobottTomeg;
        this.eredmeny = eredmeny;
    }

    public String getNev() {
        return nev;
    }

    public String getOrszag() {
        return orszag;
    }

    public int getEv() {
        return ev;
    }

    public double getDobottTomeg() {
        return dobottTomeg;
    }

    public double getEredmeny() {
        return eredmeny;
    }
     @Override
    public String toString() {
        return nev + "\t" + orszag + "\t" + ev + "\t" + dobottTomeg + "\t" + eredmeny;
    }
    
}
    

