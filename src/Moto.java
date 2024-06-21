public class Moto extends Veicolo {

    private boolean bauletto;
    private boolean casco;

    public Moto(int peso, String marca, String modello,
            boolean bauletto, boolean casco) {

        super(peso, marca, modello);

        setBauletto(bauletto);
        setCasco(casco);
    }

    public boolean isBauletto() {
        return bauletto;
    }

    public void setBauletto(boolean bauletto) {
        this.bauletto = bauletto;
    }

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    @Override
    public String toString() {

        return super.toString() + " bauletto (yes/no): " + isBauletto() + " casco (yes/no): " + isCasco();
    }

    @Override
    public void turnOn() {

        System.out.println("Vroom");
    }
}
