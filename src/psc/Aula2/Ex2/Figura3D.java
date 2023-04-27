package psc.Aula2.Ex2;

public class Figura3D extends Figura {
    private double area, perimetro, volume;

    public Figura3D(double area, double perimetro, double volume) {
        super(area, perimetro);
        this.volume = volume;
    }
}
