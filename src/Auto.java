public class Auto extends Veicolo implements PortiereDotati, CintureDotati {

    private int cilindrata;
    private int potenza;

    public Auto(int peso, String marca, String modello, int cilindrata, int potenza) {

        super(peso, marca, modello);
        // super();

        setCilindrata(cilindrata);
        setPotenza(potenza);
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public int getPotenza() {
        return potenza;
    }

    public void setPotenza(int potenza) {
        this.potenza = potenza;
    }

    @Override
    public String toString() {

        return super.toString() + " " + "cc: " + getCilindrata() + " CV: " + getPotenza();
    }

    @Override
    public void turnOn() {

        System.out.println("Brum");
    }
}

/**
 * abstract class Shape:
 * String color;
 * 
 * public Shape() { // ... }
 * public Shape(String color) { // ... }
 * 
 * - abstract getPer() : int;
 * - abstract getArea() : int;
 * 
 * class Square extends Shape:
 * - int side;
 * - getPer() {
 * // ...
 * }
 * - getArea() {
 * // ...
 * }
 * 
 * class Rect extends Square: // ...
 * class Circle extends Shape: // ...
 */

/**
 * Person
 * String name
 * String lastname;
 * 
 * abstract getYearSalary();
 * 
 * Employee extends Person
 * Boss extends Person
 */