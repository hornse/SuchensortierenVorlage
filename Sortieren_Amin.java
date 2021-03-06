import java.util.Random;
//Das Java Paket Arrays wird benötigt, um das Array zu einem String zu konvertieren um es in der konsole auszugeben.
import java.util.Arrays;
/**
 * Mit Hilfe von Objekten der Klasse Sortierer koennen Zahlenwerte, die in einem Array gespeichert sind,
 * der groesse nach von klein nach groß sortiert werden.
 * Hierfuer stehen drei unterschiedliche Verfahren zur Verfuegung: Bubblesort, Selectionsort und Insertionsort
 * Fuer die Erzeugung von Zufallszahlen steht die Klasse Random zur Verfügung, die zuvor siehe 1. Zeile importiert 
 * werden muss.
 * 
 * @author Sebastian Horn
 * @version 0.1
 */

public class Sortieren_Amin
{            

    //Deklaration der globalen Variablen/Zustandvariablen
    private int zZahlenarray[];
    private Random zZufallsgenerator;

    //Methoden/ Eigenschaften von Objekten der klasse Sortieren 

    /**
     * Konstruktor der Klasse Sortieren. Im Konstruktor werden die zuvor deklarieten Zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren erzeugt worden. Ein Array 
     * mit dem Namen zZahlenarray und der Grösse 30 wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von Zufallszahlen erzeugt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     */
    public Sortieren_Amin()
    {  
        //Zustandvariablen werden initialisiert
        zZahlenarray = new int [30];
        zZufallsgenerator = new Random(); 
    }

    /**
     * 2. Konstruktor der Klasse Sortieren. Im Konstruktor werden die zuvor deklarieten Zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren erzeugt worden. Ein Array 
     * mit dem Namen zZahlenarray und einer variablen Groesse wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von Zufallszahlen erzeugt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     */
    public Sortieren_Amin(int pGroesse)
    {  
        //Zustandvariablen werden initialisiert
        zZahlenarray = new int [pGroesse];
        zZufallsgenerator = new Random(); 
    }

    /**
     * 3. Konstruktor der Klasse Sortieren. Im Konstruktor werden die zuvor deklarieten Zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren erzeugt worden. Ein Array 
     * mit dem Namen zZahlenarray und einer variablen Groesse wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von Zufallszahlen erzeugt und das Array mit Zufallszahlen im Zahlenspektrum von 0 - pMaxZahl befuellt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     * 
     * @param int pGroesse gibt die Groesse des Arrays an
     * @param int pMaxZahl gibt die groesste moegliche zu erzeugenden Zufallszahl an
     */
    public Sortieren_Amin(int pGroesse, int pMaxZahl)
    {  
        zZahlenarray = new int [pGroesse];
        zZufallsgenerator = new Random(); 
        bfmsZufallflex(pMaxZahl);
    }

    /**
     * Methode bfmsZufall
     * Auftrag: Nach dem Aufruf dieser Methode ist das Array zZahlenarray mit zufälligen Zahlen im Spektrum 
     * von 0 - 1000 befüllt
     */
    public void bfmsZufall()
    {         
        for(int i = 0; i < zZahlenarray.length; i++) {
            zZahlenarray[i] = zZufallsgenerator.nextInt(1000);
        }
    }

    /**
     * Methode bfmsZufallflex
     * Auftrag: Nach dem Aufruf dieser Methode ist das Array zZahlenarray mit zufälligen Zahlen im Spektrum 
     * von 0 - pMaxZahl befüllt.
     */
    public void bfmsZufallflex(int pMaxZahl)
    {
        for(int i = 0; i < zZahlenarray.length; i++) {
            zZahlenarray[i] = zZufallsgenerator.nextInt(pMaxZahl);
        }
    }

    /**
     * Method bfms
     * Auftrag: Nach dem Aufruf der Methode ist das Array zZahlenarray mit aufsteigenden Zahlenwerten 
     * beginnend bei 1 und einer Schrittweite von 1 gefuellt.
     *
     */
    public void bfms()
    { 
        for(int i = 0; i < zZahlenarray.length; i++)
        {
            zZahlenarray[i]= i +1;
        }
    }

    /**
     * Method bubblesort
     * Auftrag: Nach Aufruf der Methode ist das Array zZahlenarray nach dem Prinzip Bubblesort sortiert worden.
     * 
     * Eine ausführliche Beschreibung muss hier eurerseits erfolgen!!!!!! Hilfe zum Prinzip findest du unter:
     * https://www.youtube.com/watch?v=lyZQPjUT5B4 und im Buch!!!!!
     * 
     * Hierfür muss das Array vorher mit Zahlenwerten gefüllt worden sein d.h. eine der Methoden zum Befüllen des Arrays
     * muss aufgerufen worden sein.
     * Wenn nicht bricht BlueJ mit einer Fehlermedung ab.
     * 
     * Bubblesort sortiert indem durch das Array iteriert wird und jeweils
     * 2 nebeneinanderstehende Zahlen verglichen und vertauscht werden.
     * 
     * @return Anzahl der Zugriffe (Vergleich=2, Vertauschung=6)
     */
    public int bubblesort() {
        int zugriffe = 0;
        boolean finished = false;
        while(!finished) {
            finished = true;
            for(int j = 0; j< zZahlenarray.length-1; j++) {
                if(zZahlenarray[j]>zZahlenarray[j+1]) {
                    int temp = zZahlenarray[j];
                    zZahlenarray[j] = zZahlenarray[j+1];
                    zZahlenarray[j+1] = temp;
                    finished = false;
                    zugriffe+=6;
                }
                zugriffe+=2;
            }
        }
        return zugriffe;
    }

    /**
     * Method insertionsort
     * Auftrag: Nach Aufruf der Methode ist das Array zZahlenarray nach dem Prinzip Insertionsort sortiert worden.
     * 
     * Eine ausführliche Beschreibung muss hier eurerseits erfolgen!!!!!!!!!Hilfe findest du hier:
     * https://www.youtube.com/watch?v=ROalU379l3U und im Buch.
     * 
     * Hierfür muss das Array vorher mit Zahlenwerten gefüllt worden sein d.h. eine der Methoden zum Befüllen des Arrays
     * muss aufgerufen worden sein.
     * Wenn nicht bricht BlueJ mit einer Fehlermedung ab.
     * 
     * Insertionsort arbeitet, indem immer eine Zahl abgespeichert wird und sie dann mit jeder anderen Zahl verglichen wird
     * bis eine kleinere gefunden wurde. Dann werden sie getauscht und es wird zur nächsten Zahl übergegangen.
     */
    public void insertionsort()
    {   
        //Tipp: i = 1
        for (int i = 1; i < zZahlenarray.length; i++) {
            int temp = zZahlenarray[i];
            int j = i;
            while (j > 0 && zZahlenarray[j - 1] > temp) {
                zZahlenarray[j] = zZahlenarray[j - 1];
                j--;
            }
            zZahlenarray[j] = temp;
        }
    }

    /**
     * Method selectionsort
     * Auftrag: Nach Aufruf der Methode ist das Array zZahlenarray nach dem Prinzip Insertionsort sortiert worden.
     * 
     * Eine ausführliche Beschreibung muss hier eurerseits erfolgen!!!!!!!!! Hilfe findest du hier:
     * https://www.youtube.com/watch?v=Ns4TPTC8whw und im Buch!!!
     * 
     * Hierfür muss das Array vorher mit Zahlenwerten gefüllt worden sein d.h. eine der Methoden zum Befüllen des Arrays
     * muss aufgerufen worden sein.
     * Wenn nicht bricht BlueJ mit einer Fehlermedung ab.
     * 
     * Der Algorithmus funktioniert wie bubblesort. Er unterscheidet sich darin, dass von rechts nach links iteriert wird.
     * 
     * @return Anzahl der Zugriffe (Vergleich=2, Vertauschung=6)
     */
    public int selectionSort()
    {
        int zugriffe = 0;
        for (int i = 0; i < zZahlenarray.length - 1; i++) {
            for (int j = i + 1; j < zZahlenarray.length; j++) {
                if (zZahlenarray[i] > zZahlenarray[j]) {
                    int temp = zZahlenarray[i];
                    zZahlenarray[i] = zZahlenarray[j];
                    zZahlenarray[j] = temp;
                    zugriffe+=6;
                }
                zugriffe+=2;
            }
        }
        return zugriffe;
    }    

    /**
     * Methode lineareSuche
     *
     *Es wird durch das Array iteriert und die übergebene Zahl mit der jeweiligen Zahl verglichen.
     *Wenn keine Zahl gefunden wird gibt die Methode false zurück
     *
     * @param pZahl Angabe der zu suchenden zahl
     * @return true wenn die Zahl gefunden wurde, sonst false
     */
    public boolean lineareSuche(int pZahl)
    {      
        for(int i : zZahlenarray) {
            if(i == pZahl) {
                return true;
            }
        }
        return false;
    }

    /**
     * Initiale Sortiermethode fuer den Quicksort-Algorithmus
     */
    public int quickSort()
    {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Beginne neuen Sortiervorgang mit Quicksort");
        print();        
        print();
        System.out.println("--------------------------------------------------------------------");
        return quicksort_intern(0, zZahlenarray.length-1);
    }
    
    
    /**
     * Methode quicksort_intern
     *
     * Der Algorithmus teilt das Array durch ein Pivotelement in
     * 2 kleinere Arrays. Dabei werden immer die Zahlen links und 
     * rechts vom Pivotelement auf die richtige Seite gebracht
     *
     *
     * @param pL linker Rand des Arrays
     * @param pR rechter rand des Arrays
     */
    private int quicksort_intern(int pL, int pR)
    {   
        int zugriffe = 0;
        int hLinks = pL;  // Hilfszeiger f¸r links
        int hRechts = pR; // Hilfszeiger f¸r rechts
        int hPivot = (int) (Math.random()*(pR-pL+1))+pL; // Stelle des Pivot

        if(pL<pR && hPivot>=0){
            while(hLinks!=hRechts){
                if(zZahlenarray[hLinks] >= zZahlenarray[hPivot]){
                    zugriffe+=2;
                    if(zZahlenarray[hRechts] <= zZahlenarray[hPivot]){
                        int temp = zZahlenarray[hRechts];
                        zZahlenarray[hRechts] = zZahlenarray[hLinks];
                        zZahlenarray[hLinks] = temp;
                        zugriffe+=6;

                        if(hLinks == hPivot){
                            hPivot = hRechts;
                        } else if(hRechts == hPivot){
                            hPivot = hLinks;
                        }

                        if(hLinks < hPivot){
                            hLinks ++;
                        }
                        if(hRechts > hPivot){
                            hRechts--;
                        }
                    }else{
                        hRechts--;
                    }
                }else{
                    hLinks ++;
                    if(zZahlenarray[hRechts] >= zZahlenarray[hPivot] && hRechts > hPivot){
                        hRechts --;
                    }
                }
            }

            //Spaltung des Arrays und rekursiver Aufruf
            zugriffe += quicksort_intern(pL, hPivot-1);
            zugriffe += quicksort_intern(hPivot + 1, pR);


        }
        return zugriffe;
    }
    
    
    /**
     * Methode binaereSuche
     *
     * Das sortierte Array wird durch die mitte geteilt. Falls die mittlere Zahl größer
     * als die gesuchte ist, wird der Prozess rekursiv mit der rechten Hälfte des Arrrays
     * wiederholt, ansonsten mit der linken.
     *
     * @param pL linker Rand des Arrays
     * @param pR rechter Rand des Arrays
     * @return Index der gesuchten Zahl. -1 Falls sie nicht vorhanden ist.
     */
    public int binaereSuche(int pL, int pR, int x)
    {
        if (pR >= pL) {
            int mitte = pL + (pR - pL) / 2;
            
            if (zZahlenarray[mitte] == x)
                return mitte;
  
            if (zZahlenarray[mitte] > x)
                return binaereSuche(pL, mitte - 1, x);
  
            return binaereSuche(mitte + 1, pR, x);
        }
          
        return -1;
    }
    

    /**
     * Methode print
     *
     * Das Array wird in der Konsole ausgegeben
     */    

    public void print() {
        System.out.println(Arrays.toString(zZahlenarray));
    }
}
