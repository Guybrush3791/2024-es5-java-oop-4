import java.util.Arrays;

public class CamionManager {

    private int index;
    private Camion[] camions;

    public CamionManager() {

        index = 0;
        camions = new Camion[10];
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Camion[] getCamions() {
        return camions;
    }

    public void setCamions(Camion[] camions) {
        this.camions = camions;
    }

    public void add(Camion camion) {

        if (index < camions.length) {

            camions[index] = camion;
            index++;

            return;
        }

        // fare un array di camion con la dimensione maggiorata di 1
        Camion[] newCamions = new Camion[getCamions().length * 2];

        // copia il vecchio array nel nuovo
        for (int x = 0; x < getCamions().length; x++) {

            newCamions[x] = camions[x];
        }

        // aggiungi l'elemento mancante al nuovo array
        newCamions[index] = camion;

        // sostituzione del vecchio array con il nuovo
        setCamions(newCamions);

        index++;
    }

    public Camion getMaxCaricoCamion() {

        int maxCarico = Integer.MIN_VALUE;
        Camion camionMaxCarico = null;

        for (Camion c : getCamions()) {

            if (c.getCarico() > maxCarico) {

                maxCarico = c.getCarico();
                camionMaxCarico = c;
            }
        }

        return camionMaxCarico;
    }

    @Override
    public String toString() {

        return "CamionManager: " + index + "\n" + Arrays.toString(camions);
    }
}
