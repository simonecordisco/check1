//Creare un programma in Java che dato un array di interi abbia i seguenti metodi:
//a) Scrivere un metodo che a partire da un array calcoli il valore massimo e il valore minimo e
//stampi l’informazione a video.
//b) Scrivere un metodo che calcoli la somma di tutti i numeri pari all’interno dell’array e stampi l’informazione a video.
//Creare un programma in Java che dato un array di Stringhe abbia il seguente metodo:
//
//c) Scrivere un metodo che ricerchi se una stringa di lunghezza definita dall’utente è contenuta o
// meno all’iterno dell’array
// e che restituisca true o false come risultato della ricerca. Il risultato della
// ricerca dovrà essere stampato a video.


public class Main {

    public static void main(String[] args) {
        int lunghezzaStringa = 6;
        System.out.println(lunghezzaStringa);
        String[] arrayDiStringhe = {"Ciao", "Arrivederci", "Addio", "Salve"};

        boolean risultatoRicerca = ricercaArray(arrayDiStringhe, lunghezzaStringa);

        System.out.println("Il risultato della ricerca è : " + risultatoRicerca);
    }
    private static boolean ricercaArray(String[] arrayDiStringhe, int lunghezzaStringa) {
        for (String str : arrayDiStringhe) {
            if (str.length() == lunghezzaStringa ) {
                return true;
            }
        }
        return false;
    }
}
