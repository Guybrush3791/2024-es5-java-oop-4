import java.util.ArrayList;
import java.util.List;

public class App {

    /**
     * TODO:
     * 
     * 1. Creare una classe `Veicolo` con i seguenti attributi:
     * - `marca` (String)
     * - `modello` (String)
     * 
     * 2. Creare una classe `Auto` che estende `Veicolo`
     * e aggiungere i seguenti attributi:
     * - `cilindrata` (int)
     * - `potenza` (int)
     * 
     * 3. Creare una classe `Camion` che estende `Auto`
     * e aggiungere i seguenti attributi:
     * - `carico` (int)
     * - `rimorchio` (boolean)
     * 
     * 4. Creare una classe `Moto` che estende `Veicolo`
     * e aggiungere i seguenti attributi:
     * - `bauletto` (boolean)
     * - `casco` (boolean)
     * 
     * 5. Definire un toString sensato per ogni classe
     * 
     * 6. Creare delle istanze di `Veicolo`, `Auto`,
     * `Camion` e `Moto` e testare il corretto funzionamento
     * di ogni classe
     */

    // ----------------------------------------------------------------

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
     */

    public static void main(String[] args) throws Exception {

        // test1();
        // testCamionManager();
        // testAutoManager();
        testVeicoloManager();

        System.out.println("The end");
    }

    public static void test1() {

        // Veicolo veicolo = new Veicolo(1000, "Fiat", "Punto");
        // System.out.println(veicolo);

        Auto auto = new Auto(100, "Fiat", "Punto", 1400, 80);
        System.out.println(auto);

        Camion camion = new Camion(100, "Iveco", "Eurocargo", 3000, 150, 10000, true);
        System.out.println(camion);

        Moto moto = new Moto(100, "Honda", "CBR", true, true);
        System.out.println(moto);
    }

    public static void testCamionManager() {

        CamionManager manager = new CamionManager();

        Camion camion1 = new Camion(9900, "Iveco", "Eurocargo", 3000, 150, 10000, true);
        Camion camion2 = new Camion(1000, "Citroen", "Jumper", 2500, 120, 8000, false);
        Camion camion3 = new Camion(10200, "Fiat", "Ducato", 2000, 100, 5000, false);
        Camion camion4 = new Camion(10300, "Renault", "Master", 2200, 110, 6000, true);
        Camion camion5 = new Camion(10500, "Mercedes", "Sprinter", 2800, 140, 9000, true);

        manager.add(camion1);
        manager.add(camion2);
        manager.add(camion3);
        manager.add(camion4);
        manager.add(camion5);

        System.out.println(manager);
        System.out.println(manager.getMaxCaricoCamion());
    }

    public static void testAutoManager() {

        AutoManager autoManager = new AutoManager();

        Auto auto1 = new Auto(100, "Fiat", "Punto", 1400, 80);
        Auto auto2 = new Auto(100, "Ford", "Fiesta", 1200, 70);
        Auto auto3 = new Auto(100, "Renault", "Clio", 1300, 75);
        Auto auto4 = new Auto(100, "Volkswagen", "Golf", 1600, 90);
        Auto auto5 = new Auto(100, "Opel", "Corsa", 1500, 85);

        autoManager.add(auto1);
        autoManager.add(auto2);
        autoManager.add(auto3);
        autoManager.add(auto4);
        autoManager.add(auto5);

        Auto[] autos = { auto4, auto2 };

        System.out.println(autoManager);
        System.out.println("Auto con la potenza maggiore: " + autoManager.getMaxPotenzaAuto());

        autoManager.remove();
        System.out.println(autoManager);

        autoManager.remove(1);
        System.out.println(autoManager);

        autoManager.addAll(autos);
        System.out.println(autoManager);

        autoManager.reversed();
        System.out.println(autoManager);

        System.out.println("Is autoManager empty? " + autoManager.isEmpty());

        autoManager.clear();
        System.out.println(autoManager);

        System.out.println("Is autoManager empty? " + autoManager.isEmpty());
    }

    public static void testVeicoloManager() {

        VeicoloManager veicoloManager = new VeicoloManager();

        // Veicolo veicolo1 = new Veicolo(1000, "Fiat", "Punto");
        Camion camion1 = new Camion(9900, "Iveco", "Eurocargo", 3000, 150, 10000, true);
        Auto auto1 = new Auto(100, "Fiat", "Punto", 1400, 80);
        Moto moto1 = new Moto(100, "Honda", "CBR", true, true);

        Veicolo[] veicoli = { camion1, auto1, moto1 };

        // Camion c1 = auto1;
        // Auto a1 = camion1;
        // a1.

        // Auto a1 = new Camion(9900, "Iveco", "Eurocargo", 3000, 150, 10000, true);
        // if (a1 instanceof Camion) {
        // Camion m1 = (Camion) a1;
        // m1.
        // }

        Auto a1 = new Auto(100, "Fiat", "Punto", 1400, 80);
        CintureDotati cd1 = a1;
        cd1.slaccia();
        cd1.allaccia();

        int sumPeso = 0;
        int sumPotenza = 0;
        int autoCount = 0;
        for (Veicolo veicolo : veicoli) {

            System.out.println(veicolo);
            sumPeso += veicolo.getPeso();

            veicolo.turnOn();

            // if (veicolo instanceof Auto) {

            // Auto auto = (Auto) veicolo;
            // // sumPotenza += auto.getPotenza();
            // // autoCount++;
            // }

            // System.out.println("Is camion: " + (veicolo instanceof Camion));

            // if (veicolo instanceof Camion) {

            // Camion camion = (Camion) veicolo;
            // System.out.println("Carico: " + camion.getCarico());
            // }
        }

        // System.out.println("Media potenza: " + sumPotenza / autoCount);
        // System.out.println("Media peso: " + sumPeso / veicoli.length);

        // veicoloManager.addAll(veicoli);

        // System.out.println(veicoloManager);
    }
}

/**
 * interface ConnessioneDati {
 * void startCom();
 * void stopCom();
 * void send(String data);
 * String receive();
 * }
 * 
 */