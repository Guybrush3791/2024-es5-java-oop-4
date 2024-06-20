public class Veicolo {

    private String marca;
    private String modello;

    // COSTRUTTORE IMPLICITO
    // public Veicolo() {
    // }

    public Veicolo(String marca, String modello) {

        setMarca(marca);
        setModello(modello);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String toString() {

        return getMarca() + " " + getModello();
    }
}
