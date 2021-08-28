package Tarea6;

/**
 * @author Angel Magdiel Pineda Cruz
 * @version 1.0
 * subclase
 * prueba: se inicializan 2 instancias y se muestra en pantalla el calculo
 * del area devuelto por la clase
 */

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
