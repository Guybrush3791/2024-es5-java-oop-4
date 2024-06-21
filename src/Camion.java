public class Camion extends Auto {

    private int carico;
    private boolean rimorchio;

    public Camion(
            int peso, String marca, String modello, int cilindrata, int potenza,
            int carico, boolean rimorchio) {

        super(peso, marca, modello, cilindrata, potenza);

        setCarico(carico);
        setRimorchio(rimorchio);
    }

    public int getCarico() {
        return carico;
    }

    public void setCarico(int carico) {
        this.carico = carico;
    }

    public boolean isRimorchio() {
        return rimorchio;
    }

    public void setRimorchio(boolean rimorchio) {
        this.rimorchio = rimorchio;
    }

    @Override
    public String toString() {

        return super.toString() + " carico: " + getCarico() + " rimorchio (yes/no): " + isRimorchio();
    }

    @Override
    public void turnOn() {

        System.out.println("Sroom");
    }
}
