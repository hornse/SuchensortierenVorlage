//Das Java Paket Random wird benötigt, um mit Hilfe eines Objektes der klasse Random Zufallszahlen zu erzeugen.
import java.util.Random;
/**
 * Mit Hilfe von Objekten der Klasse Sortierer koennen Zahlenwerte, die in einem Array gespeichert sind,
 * der groesse nach von klein nach groß sortiert werden.
 * Hierfuer stehen drei unterschiedliche Verfahren zur Verfuegung: Bubblesort, Selectionsort und Insertionsort
 * Fuer die Erzeugung von Zufallszahlen steht die Klasse Random zur Verfügung, die zuvor siehe 1. Zeile importiert 
 * werden muss.
 * 
 * @author Sebastian Horn
 * @version 0.2
 */

public class Sortieren_Emiliano
{            
    
    //Deklaration der globalen Variablen/Zustandvariablen
    private int zZahlenarray[];
    private Random zZufallsgenerator;
            
    //Methoden/ Eigenschaften von Objekten der klasse Sortieren_Emiliano 
    
    /**
     * Konstruktor der Klasse Sortieren_Emiliano. Im Konstruktor werden die zuvor deklarieten Zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren_Emiliano erzeugt worden. Ein Array 
     * mit dem Namen zZahlenarray und der Grösse 30 wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von Zufallszahlen erzeugt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     */
    public Sortieren_Emiliano()
    {  
        //Zustandvariablen werden initialisiert
        zZahlenarray = new int [30];
        zZufallsgenerator = new Random(); 
    }
    
    /**
     * 2. Konstruktor der Klasse Sortieren_Emiliano. Im Konstruktor werden die zuvor deklarieten Zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren_Emiliano erzeugt worden. Ein Array 
     * mit dem Namen zZahlenarray und einer variablen Groesse wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von Zufallszahlen erzeugt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     */
    public Sortieren_Emiliano(int pGroesse)
    {  
        //Zustandvariablen werden initialisiert
        zZahlenarray = new int [pGroesse];
        zZufallsgenerator = new Random(); 
    }
    
    /**
     * 3. Konstruktor der Klasse Sortieren_Emiliano. Im Konstruktor werden die zuvor deklarieten Zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren_Emiliano erzeugt worden. Ein Array 
     * mit dem Namen zZahlenarray und einer variablen Groesse wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von Zufallszahlen erzeugt und das Array mit Zufallszahlen im Zahlenspektrum von 0 - pMaxZahl befuellt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     * 
     * @param int pGroesse gibt die Groesse des Arrays an
     * @param int pMaxZahl gibt die groesste moegliche zu erzeugenden Zufallszahl an
     */
    public Sortieren_Emiliano(int pGroesse, int pMaxZahl)
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
        //Mit Hilfe der Methode nextInt(int pInt) der Klasse Random kann eine Zufallszahl im Spektrum
        // von 0 - pInt erzeugt werden Bs.p: der Aufruf zZufallsgenerator.nextInt(1000) erzeugt eine Zufallszahl im Spektrum 
        // von 0 - 1000
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
        for(int i = 0; i < 30; i++)
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
     * Die erste for-Schleife nimmt die erste Zahl vom Array. Die zweite for-Schleife nimmt die zweite
     * Zahl vom Array und vergleicht sie mit der ersten, ob sie größer ist als die erste, wenn ja, dann werden die beiden Zahlen 
     * getauscht.
     * Dazu wird eine temporäre Datei (tmp) verwendet. Diese nimmt die größere Zahl und nimmt den wert an. Die
     * kleinere Zahl nimmt den Wert der größeren Zahl an und die Datei, die die kleinere Zahl hatte, nimmt den Wert der
     * temporären Datei an, die den Wert der größeren Zahl hatte.
     * 
     * Wenn fertig geprüft, bzw getauscht wurde, werden die nächsten beiden Zahlen geprüft und Sortiert, sodass am Ende
     * ganz rechts die größte Zahl des Arrays steht.
     */
    public void bubblesort() 
    {
        for(int i = 0; i < zZahlenarray.length; i++)
        {  
             //loop geht komplett durch minus index minus 1, weil Zahl ganz rechts ist sortiert
             for(int j = 0; j < zZahlenarray.length - i - 1; j++)
              {
                 //überprüfung ob Zahl rechts kleiner ist
                 if(zZahlenarray[j] > zZahlenarray[j + 1])
                 {
                     //beide zahlen werden vertauscht
                     int temp = zZahlenarray[j];  
                     zZahlenarray[j] = zZahlenarray[j + 1];  
                     zZahlenarray[j + 1] = temp;  
                 }  
             }  
        } 
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
     */
    public void insertionsort()
    {   
        //Tipp: i = 1
        for (int  i = 1; i <= zZahlenarray.length - 1; i++)
        {   
            if (zZahlenarray[i - 1] > zZahlenarray[i])
            {
            }
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
     */
    public void selectionSort()
    {
        //Tipp: Auch hier werden 2 Schleifen benötigt
    }    
    
    
    /**
     * Methode lineareSuche
     *
     * @param pZahl Angabe der zu suchenden zahl
     * @return true wenn die Zahl gefunden wurde, sonst false
     */
    public boolean lineareSuche(int pZahl)
    {      
       //
       return false;
    }    
}