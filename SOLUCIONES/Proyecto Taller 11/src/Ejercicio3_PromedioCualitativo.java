
/**
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio cualitativo
 * de los parámetros. Si el promedio es: De 0 a 5 el promedio cualitativo es Regular De 5.1 a 8 el
 * promedio es Bueno De 8.1 a 9 el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente.
 * A la función se la debe llamar desde un método principal. Los parámetros necesarios para llamar
 * a la función, deben ser ingresados solicitados al usuario.
 *
 * @author Usuario juampyz7
 */
import java.util.Scanner;

public class Ejercicio3_PromedioCualitativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double calificacion1, calificacion2, calificacion3, calificacion4, promedio;
        System.out.print("Ingrese la primera calificacion: ");
        calificacion1 = scanner.nextDouble();
        System.out.print("Ingrese la segunda calificacion: ");
        calificacion2 = scanner.nextDouble();
        System.out.print("Ingrese la tercera calificacion: ");
        calificacion3 = scanner.nextDouble();
        System.out.print("Ingrese la cuarta calificacion: ");
        calificacion4 = scanner.nextDouble();
        promedio = (calificacion1 + calificacion2 + calificacion3 + calificacion4) / 4;
        String promedioCualitativo = calcularPromedioCualitativo(calificacion1, calificacion2, calificacion3, calificacion4);
        System.out.println("El promedio final es igual a: " + promedio);
        System.out.println("El promedio cualitativo obtenido es igual a: " + promedioCualitativo);
    }

    public static String calcularPromedioCualitativo(double a, double b, double c, double d) {
        double promedio = (a + b + c + d) / 4;

        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio > 9 && promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "El promedio ingresado es incorrecto";
        }
    }
}
/**
 * run:
Ingrese la primera calificacion: 7,5
Ingrese la segunda calificacion: 9
Ingrese la tercera calificacion: 8,5
Ingrese la cuarta calificacion: 8
El promedio final es igual a: 8.25
El promedio cualitativo obtenido es igual a: Muy Bueno
BUILD SUCCESSFUL (total time: 22 seconds)
 */

