Aufgaben in JAVA
================

Mit diesen Übungsaufgaben starten wir in die Java Welt:

Einfache, kurze Aufgaben
------------------------

- "Hallo Welt"-Ausgabe `HelloWorld.java`


- Eingabe eines Namens und Ausgabe "Hallo Name" `HalloName.java`


- Eingabe zweier Ganzzahlen (Integer) und Ausgabe Summe `AusgabeSumme.java`


- Eingabe eines Euro-Betrags und Ausgabe in Dollar (Umrechung mit festem Faktor) `EuroDollar.java`
 

- Eingabe von min und max, Ausgabe einer zufälligen Zahl aus dem Intervall `Zufallszahl.java`


- Einkaufsliste: einzelne Eingabe von Einkäufen, speichern in einer Liste /Array, anschließend gesamte Ausgabe, also
  z.B. Orangen, Milch, Schokolade `EinkaufsListe.java`

Komplexere Aufgaben
-------------------

- **Ratespiel:** Zufallszahl aus 1-100 erraten. `Ratespiel.java`
  - Generiere eine zufällige Zahl zwischen 1-100
  - Nach jedem Rateversuch soll das Programm ausgeben, ob der Tipp zu groß, zu klein oder richtig war
  - Wenn die richtige Zahl erraten wurde, soll das Programm die Anzahl der Versuche insgesamt ausgeben
  - Sollte derselbe Tipp mehrmals abgegeben werden, soll es nur als ein Versuch gezählt werden
  - Am Ende soll das Programm fragen, ob man nochmal spielen will


- **Notendurchschnitt:** Gib x Noten im Bereich von 1 bis 5 ein. Wird ein Wert größer 5
  eingegeben, soll das Programm stoppen und den Notendurchschnitt berechnen (ohne
  dabei die letzte Zahl, die größer 5 ist, mitzurechnen).
  Dabei auf zwei Stellen nach dem Komma runden.


- Implementierung eines **Taschenrechners:** Eingabe zweier Zahlen und des Rechenzeichens,
  dann Ergebnis. Implementierung der Grundrechenarten Summe, Subtraktion, Multiplikation,
  Division.

---

Exkurs **Java-Methoden** allgemein
----------------------------------

  Methoden fassen Funktionalitäten in einem Programm zusammen und machen die Programmierung
  übersichtlicher.

  Eine Methode sieht in Java beispielsweise so aus (hier: zwei Zahlen zusammenzählen):

```java
public Integer sum(Integer i, Integer j) {
  return i +  j;
}
```

Aufruf einer Methode:

```java
public static void main(String[] args) {
  int mySum = sum(8, 5);
  System.out.println("Sum is: " + mySum);
}
```
---

- **Primzahlen errechnen** und ausgeben `PrimZahlen.java`
  Eine Primzahl ist per Definition eine Zahl, die größer ist als 1 und nur durch eins und
  sich selbst teilbar ist (2,3,5,7,11…)
  Das Programm soll also mit 2 beginnend in einer Schleife eine Variable hochzählen, und
  jede Zahl über eine Methode `public Boolean isPrime(int zahl){…}` testen, ob die
  jeweilige Zahl *zahl* eine Primzahl ist (Rückgabe true oder false). Wenn es eine Primzahl
  ist, soll diese ausgegeben werden. Dann die nächste Zahl testen und so weiter.
  Abbruch des Programms über Strg-C.

  Wenn das Programm zuverlässig funktioniert, sollte es optimiert werden:
  - Wie viele Primzahlen schafft das Programm pro Sekunde?
  - Wie viele Primzahlen gibt es zwischen 2 und 200.000?
  - Welche Optimierungen sind möglich?
  - Müssen alle Zahlen getestet werden?
  - Bis zu welchem Teiler muss in `isPrime()` geteilt werden? 

  Bitte recherchiere nach Algorithmen, um Primzahlen effizient zu berechnen.


- Implementierung einer **Preisfunktion für Konzerttickets.** Je näher das Konzert ist, desto teurer werden die Tickets.
  - Eingabe Anzahl Tickets, Ausgabe Einzel- und Gesamtpreis
  - Konzertbeginn ist um 20 Uhr
  - Tickets kosten regulär 30 Euro bis zum Tag des Konzerts um 10 Uhr
  - Am Tag des Konzerts kosten die Tickets um 10 Uhr 35 Euro
  - Bis zu Konzertbeginn steigt der Preis jede Stunde um 2 Euro. Also um 11 Uhr 37 Euro, um 12 Uhr 39 Euro usw.
  - Ab 20 Uhr kann man keine Tickets mehr kaufen
  
  **Implementierungshinweis:** es braucht zwei Datums-Angaben: Konzertdatum und aktuelles Datum und Zeit. Beides als
  Variablen, damit man die verschiedenen Preise testen kann.
