//Das Java Paket Random wird benötigt, um mit Hilfe eines Objektes der klasse Random Zufallszahlen zu erzeugen.
import java.util.Random;
import java.util.Arrays;
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

public class Sortieren_Niki
{            
    
    //Deklaration der globalen Variablen/Zustandvariablen
    private int zMaxzahl;
    private int zZahlenarray[];
    private Random zZufallsgenerator;
            
    //Methoden/ Eigenschaften von Objekten der klasse Sortieren_Niki 
    
    /**
     * Konstruktor der Klasse Sortieren_Niki. Im Konstruktor werden die zuvor deklarieten Zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren_Niki erzeugt worden. Ein Array 
     * mit dem Namen zZahlenarray und der Grösse 30 wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von Zufallszahlen erzeugt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     */
    public Sortieren_Niki()
    {  
        //Zustandvariablen werden initialisiert
        zZahlenarray = new int [30];
        zZufallsgenerator = new Random(); 
    }
    
    /**
     * 2. Konstruktor der Klasse Sortieren_Niki. Im Konstruktor werden die zuvor deklarieten Zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren_Niki erzeugt worden. Ein Array 
     * mit dem Namen zZahlenarray und einer variablen Groesse wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von Zufallszahlen erzeugt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     */
    public Sortieren_Niki(int pGroesse)
    {  
        //Zustandvariablen werden initialisiert
        zZahlenarray = new int [pGroesse];
        zZufallsgenerator = new Random(); 
    }
    
    /**
     * 3. Konstruktor der Klasse Sortieren_Niki. Im Konstruktor werden die zuvor deklarieten Zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren_Niki erzeugt worden. Ein Array 
     * mit dem Namen zZahlenarray und einer variablen Groesse wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von Zufallszahlen erzeugt und das Array mit Zufallszahlen im Zahlenspektrum von 0 - pMaxZahl befuellt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     * 
     * @param int pGroesse gibt die Groesse des Arrays an
     * @param int pMaxZahl gibt die groesste moegliche zu erzeugenden Zufallszahl an
     */
    public Sortieren_Niki(int pGroesse, int pMaxZahl)
    {  
        //Zustandvariablen werden initialisiert
        //Dein Quellcode hier
        zZahlenarray = new int [pGroesse];
        zZufallsgenerator = new Random();
        zMaxzahl = pMaxZahl;
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
        for(int i=0; i<zZahlenarray.length;i++)
            {
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
       // Dein Quellcode hier
       for(int i=0; i<zZahlenarray.length;i++)
           {
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
     * Hierfür muss das Array vorher mit Zahlenwerten gefüllt worden sein d.h. eine der Methoden zum Befüllen des Arrays
     * muss aufgerufen worden sein.
     * Wenn nicht bricht BlueJ mit einer Fehlermedung ab.
     */
    public void bubblesort()
    {   
       //Dein Quellcode
       int zZugriffanzahl = 0;
       for(int i = 0; i < zZahlenarray.length; i++){  
             /**
              * dieser loop geht immer bis zu dem array bis zu dem ende minus dem index,
              * da nach einem durchgang die letzte zahl sortiert ist
              * und - 1, da neben rechts der letzten zahl nichts ist
              */
             for(int j = 0; j < zZahlenarray.length - i - 1; j++){  
                 // wir gucken ob die zahl rechts neben von dem aktuellen index kleiner ist
                 zZugriffanzahl = zZugriffanzahl + 2;
                 
                 if(zZahlenarray[j] > zZahlenarray[j + 1]){   
                     // wir vertauschen die beiden zahlen
                     int temp = zZahlenarray[j];  
                     zZahlenarray[j] = zZahlenarray[j + 1];  
                     zZahlenarray[j + 1] = temp;  
                     zZugriffanzahl = zZugriffanzahl + 6;
                 }  
             }  
         }  
       System.out.println("Anzahl der Zugriffe: " + zZugriffanzahl);  
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
        for (int i = 1; i <= zZahlenarray.length - 1; i++)
        {   
            if(zZahlenarray[i - 1] > zZahlenarray[i]) {
                while( (i > -1) && zZahlenarray[i - 1] > zZahlenarray[i]) {
                    int temp = zZahlenarray[i];  
                    zZahlenarray[i] = zZahlenarray[i - 1];  
                    zZahlenarray[i - 1] = temp;  
                    i--;
                }
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
        for(int i = 0; i < zZahlenarray.length - 1; i++) { 
            int lowest = i;
            for(int j = i + 1; j < zZahlenarray.length; j++) {  
                if(zZahlenarray[j] < zZahlenarray[lowest]){
                    lowest = j;
                }
            }
            int temp = zZahlenarray[i];
            zZahlenarray[i] = zZahlenarray[lowest];  
            zZahlenarray[lowest] = temp;
        }
    }    
    
    
    /**
     * Methode lineareSuche
     *
     * @param pZahl Angabe der zu suchenden zahl
     * @return true wenn die Zahl gefunden wurde, sonst false
     */
    public boolean lineareSuche(int pZahl)
    {      
       for(int i = 0; i < zZahlenarray.length; i++){    
            if(zZahlenarray[i] == pZahl){    
                return true;    
            }
        }    
        return false;
    }
    
    public void quickSort()
    {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Beginne neuen Sortiervorgang mit Quicksort");
        //zeigeElementenfolge();
        quicksort_intern(0, zZahlenarray.length-1);        
        //zeigeElementenfolge();
        //System.out.println("--------------------------------------------------------------------");        
    } 
    
    private void quicksort_intern(int pL, int pR)
    {
        int hLinks = pL;  // Hilfszeiger f¸r links
        int hRechts = pR; // Hilfszeiger f¸r rechts
        int hPivot = (int) (Math.random()*(pR-pL+1))+pL; // Stelle des Pivot

        if(pL<pR && hPivot>=0){
            while(hLinks!=hRechts){
                if(zZahlenarray[hLinks] >= zZahlenarray[hPivot]){
                    if(zZahlenarray[hRechts] <= zZahlenarray[hPivot]){
                        int temp = zZahlenarray[hRechts];
                        zZahlenarray[hRechts] = zZahlenarray[hLinks];
                        zZahlenarray[hLinks] = temp;

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
            quicksort_intern(pL, hPivot-1);
            quicksort_intern(hPivot + 1, pR);


        }
    }
    
    public boolean binaereSuche(int pGesuchteZahl)
    {
        boolean gefunden = binaereSuche_intern(pGesuchteZahl,0, zZahlenarray.length -1);
        return gefunden;        
    }
    
    private boolean binaereSuche_intern(int pZahl, int pBeginn, int pEnde)
    {
        //Dein Quellcode hier
        
        if(pEnde >= pBeginn){
            int mitte = (pEnde + pBeginn) /2;
            if( pZahl < zZahlenarray[mitte]){
                return binaereSuche_intern(pZahl, pBeginn, mitte -1);
            }else if( pZahl > zZahlenarray[mitte]){
                return binaereSuche_intern(pZahl, mitte + 1, pEnde);
                
            }else{
                return true;  
            }
        }
        else if(zZahlenarray[pBeginn] == pZahl){
            return true;
        }else{
            return false;
        }
        
    }
    
    public void printArray() 
    {
        System.out.println(Arrays.toString(zZahlenarray));
        }
}

