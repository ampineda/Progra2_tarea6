package Tarea6;

public class Circulo extends FiguraGeometrica {

    public Circulo(){
        super();
    }

    @Override
    public double Area(){
        double radio;
        double area;
        radio = this.GetRadio();
        area = 3.141516*(radio*radio);

        return area;
    }



}
