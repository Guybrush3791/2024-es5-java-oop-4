public abstract class Veicolo {

    private int peso;
    private String marca;
    private String modello;

    // COSTRUTTORE IMPLICITO
    // public Veicolo() {
    // }

    public Veicolo(int peso, String marca, String modello) {

        setPeso(peso);
        setMarca(marca);
        setModello(modello);
    }

    abstract void turnOn();

    // public void turnOn() {

    // System.out.println("Mroom");
    // }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
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

        return getMarca() + " " + getModello() + " - peso: " + getPeso();
    }
}

/**
 * abstract class A {
 * // ...
 * abstract void m1();
 * }
 * 
 * class B extends A {
 * // ...
 * void m1() {
 * // ...
 * }
 * }
 * 
 * abstract class C extends A {
 * // ...
 * abstract void m2();
 * }
 * 
 * class D extends C {
 * // ...
 * void m1() {
 * // ...
 * }
 * void m2() {
 * // ...
 * }
 * }
 */