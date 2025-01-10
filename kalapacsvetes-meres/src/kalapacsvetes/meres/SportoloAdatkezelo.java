
package kalapacsvetes.meres;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author kpetr
 */
public class SportoloAdatkezelo {
     public static List<Sportolo> beolvas(String fajlNev) throws IOException {
        List<Sportolo> sportolok = new ArrayList<>();

        List<String> sorok = Files.readAllLines(Path.cf(fajlNev)); 
        for (int i = 1; i < sorok.size(); i++) { 
            String[] adatok = sorok.get(i).split("\t");
            String nev = adatok[0];
            String orszag = adatok[1];
            int ev = Integer.parseInt(adatok[2]);
            double dobottTomeg = Double.parseDouble(adatok[3]);
            double eredmeny = Double.parseDouble(adatok[4]);
            sportolok.add(new Sportolo(nev, orszag, ev, dobottTomeg, eredmeny));
        }

        return sportolok;
    }
    
}
