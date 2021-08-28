package Tarea6;

/**
 * @author Angel Magdiel Pineda Cruz
 * @version 1.0
 * pruebas
 * prueba: se inicializan 2 instancias y se muestra en pantalla el calculo
 * del area devuelto por la clase
 */

public class Test {

    public static void main(String[] args) {
	// write your code here

        FiguraGeometrica cuadrado1 = new FiguraGeometrica();
        cuadrado1.AsignaMedidas(15,27);

        Circulo circulo1 = new Circulo();
        circulo1.AsignaMedidas(35);

        System.out.println("El Area del Cuadrado es: "+cuadrado1.Area());

        System.out.println("El Area del Circulo es: "+circulo1.Area());

    }
}
