import java.util.*;

public class Zufall {

    Random rnd;
    long lowrange, highrange;

    // Konstruktor mit Übergabe des Bereiches
    public Zufall(long lowrange, long highrange) {
        this.lowrange = lowrange;
        this.highrange = highrange;
        rnd = new Random(highrange);
    }

    // Gibt die nächste Zufallszahl im Bereich LowRange <-> HighRange aus!
    public long getNextRandom() {
        return lowrange + rnd.nextLong();
    }
}
//Montag Online Beispiel