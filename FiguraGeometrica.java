package Tarea6;

/**
 * @author Angel Magdiel Pineda Cruz
 * @version 1.0
 * superclase
 * prueba: se inicializan 2 instancias y se muestra en pantalla el calculo
 * del area devuelto por la clase
 */

public class FiguraGeometrica {
    private double area;
    private double base;
    private double altura;
    private double radio;

    public FiguraGeometrica(){
        this.area = 0.0;
        this.base = 0.0;
        this.altura = 0.0;
        this.radio = 0.0;
    }

    public FiguraGeometrica(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double Area(){

        this.area = this.base * this.altura;

        return area;
    }

    public void AsignaMedidas(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void AsignaMedidas(double radio){
        this.radio = radio;
    }

    public double GetRadio(){
        return this.radio;
    }

}
