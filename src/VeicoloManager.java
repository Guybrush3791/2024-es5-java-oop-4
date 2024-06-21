import java.util.Arrays;

public class VeicoloManager {

    private int index;
    private Veicolo[] veicoli;

    public VeicoloManager() {

        index = 0;
        veicoli = new Veicolo[3];
    }

    public int getIndex() {

        return index;
    }

    public void setIndex(int index) {

        this.index = index;
    }

    public Veicolo[] getVeicoli() {

        return veicoli;
    }

    public void setVeicoli(Veicolo[] veicoli) {

        this.veicoli = veicoli;
    }

    public void add(Veicolo veicolo) {

        // se c'e' spazio nell'array
        if (index < veicoli.length) {

            veicoli[index++] = veicolo;

            return;
        }

        // se devo ridimensionare l'array
        Veicolo[] newVeicoli = new Veicolo[getVeicoli().length * 2];

        for (int x = 0; x < index; x++) {

            newVeicoli[x] = veicoli[x];
        }

        newVeicoli[index++] = veicolo;

        setVeicoli(newVeicoli);
    }

    public void addAll(Veicolo[] veicoli) {

        for (Veicolo veicolo : veicoli) {
            add(veicolo);
        }
    }

    @Override
    public String toString() {

        return "VeicoloManager: " + getIndex() + "\n" + Arrays.toString(getVeicoli());
    }
}
