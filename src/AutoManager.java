import java.util.Arrays;

public class AutoManager {

    /*
     * TODO:
     * 
     * Creare una classe AutoManager che si occupera' di gestire un array
     * di Auto
     * 
     * La classe deve implementare i seguenti metodi:
     * - void : add(Auto)
     * per aggiungere un auto al parco auto presente
     * - Auto : getMaxPotenzaAuto()
     * per restituire l'auto con la potenza maggiore
     * - toString
     * ritorna il numero di auto presenti e tutti i dati delle auto
     * 
     * BONUS:
     * 
     * Aggiungere il seguente metodo alla classe:
     * - boolean : remove()
     * rimuove l'ultima auto presente nell'array, ritorna true se
     * e' stata fatta effettivamente l'eliminazione, false altrimenti
     * - boolean : remove(int)
     * rimuove l'auto all'indice specificato per argomento, ritorna true se
     * e' stata fatta effettivamente l'eliminazione, false altrimenti
     * 
     * TL;DR
     * 
     * aggiungere alla classe AutoManager le seguenti funzioni:
     * - void : addAll(Auto[] autos)
     * aggiunge tutti gli elementi dell'array in input all'array di Auto
     * - void : clear()
     * svuota l'array di Auto
     * - boolean : isEmpty()
     * ritorna true se l'array di Auto e' vuoto, false altrimenti
     * - void : reversed()
     * inverte l'ordine degli elementi nell'array di Auto
     * 
     */

    private int index;
    private Auto[] autos;

    public AutoManager() {

        index = 0;
        autos = new Auto[3];
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Auto[] getAutos() {
        return autos;
    }

    public void setAutos(Auto[] autos) {
        this.autos = autos;
    }

    public void add(Auto auto) {

        // se c'e' spazio nell'array
        if (index < autos.length) {

            autos[index++] = auto;
            // index++;

            return;
        }

        // se devo ridimensionare l'array
        Auto[] newAutos = new Auto[getAutos().length * 2];

        for (int x = 0; x < index; x++) {

            newAutos[x] = autos[x];
        }

        newAutos[index++] = auto;

        setAutos(newAutos);
    }

    public void addAll(Auto[] autos) {

        for (Auto auto : autos) {
            add(auto);
        }
    }

    public void clear() {

        for (int x = 0; x < index; x++) {
            autos[x] = null;
        }

        index = 0;
    }

    public boolean isEmpty() {

        return index < 1;
    }

    public void reversed() {

        Auto[] reversed = new Auto[getAutos().length];

        for (int x = 0; x < getIndex(); x++) {

            reversed[x] = getAutos()[getIndex() - x - 1];
        }

        setAutos(reversed);
    }

    public Auto getMaxPotenzaAuto() {

        int maxPotenza = Integer.MIN_VALUE;
        Auto autoMaxPotenza = null;

        for (int x = 0; x < getIndex(); x++) {

            Auto a = autos[x];

            if (a.getPotenza() > maxPotenza) {

                maxPotenza = a.getPotenza();
                autoMaxPotenza = a;
            }
        }

        return autoMaxPotenza;
    }

    public boolean remove() {

        if (index == 0)
            return false;

        getAutos()[index - 1] = null;
        index--;

        return true;
    }

    public boolean remove(int i) {

        /**
         * [ [0], [1], [2], [3], [4] ]
         * arr: [ 1, 2, 3, 4, 5 ]
         * --> remove(2);
         * 
         * [ 1, 2, null, 4, 5 ];
         * 
         * for (int x=2;x<4;x++) {
         * arr[x] = arr[x+1];
         * }
         * 
         * [ 1, 2, 4, 5, 5 ];
         * 
         * obbiettivo: [ 1, 2, 4, 5, null ]
         */

        if (i < 0 || i >= index)
            return false;

        for (int x = i; x < index - 1; x++) {
            autos[x] = autos[x + 1];
        }

        autos[index - 1] = null;
        index--;

        return true;
    }

    @Override
    public String toString() {

        return "AutoManager: " + index + "\n" + Arrays.toString(autos);
    }
}
