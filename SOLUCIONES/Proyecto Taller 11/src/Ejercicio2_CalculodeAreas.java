
/**
 * Generar una solución que implemente 3 procedimientos. Que permitan calcular el área de un cuadrado,
 * área de un triángulo y área de un rectángulo. Cada procedimiento/función debe recibir los datos necesarios
 * y generar el valor correspondiente. Se debe invocar a los procedimientos desde un método principal;
 * Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 2 se llama al procedimiento
 * obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado.
 * El área del cuadrado es igual a lado x lado x lado x lado
 * El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 *
 * @author Usuario juampyz7
 */
import java.util.Scanner;

public class Ejercicio2_CalculodeAreas {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int lado, areaCuadrado = 0, b, h, areaTriangulo = 0, B, H, areaRectangulo = 0;
        System.out.print("DAME EL VALOR DEL LADO DEL CUADRADO: ");
        lado = tcl.nextInt();
        System.out.print("DAME LA BASE Y LA ALTURA DEL TRIANGULO: ");
        b = tcl.nextInt();
        h = tcl.nextInt();
        System.out.print("DAME LA BASE Y LA ALTURA DEL RECTANGULO: ");
        B = tcl.nextInt();
        H = tcl.nextInt();
        System.out.println("EL AREA DEL CUADRADO ES IGUAL A: ");
        System.out.println(areaCuadrado(lado));
        System.out.println("EL AREA DEL TRIANGULO ES IGUAL A: ");
        System.out.println(areaTriangulo(b, h));
        System.out.println("EL AREA DEL RECTANGULO ES IGUAL A: ");
        System.out.println(areaRectangulo(B, H));
    }

    public static int areaCuadrado(int lado) {
        return lado + lado + lado + lado;
    }

    public static int areaTriangulo(int b, int h) {
        return ((b * h) / 2);
    }

    public static int areaRectangulo(int B, int H) {
        return B * H;
    }
}
/**
 * run:
DAME EL VALOR DEL LADO DEL CUADRADO: 5
DAME LA BASE Y LA ALTURA DEL TRIANGULO: 5 4
DAME LA BASE Y LA ALTURA DEL RECTANGULO: 5 3
EL AREA DEL CUADRADO ES IGUAL A: 
20
EL AREA DEL TRIANGULO ES IGUAL A: 
10
EL AREA DEL RECTANGULO ES IGUAL A: 
15
BUILD SUCCESSFUL (total time: 5 seconds)
 */