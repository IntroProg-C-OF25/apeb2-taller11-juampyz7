
/**
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para
 * calcular el valor del predio de un bien inmueble. Cada procedimiento debe tener 2 parámetros
 * (tipo cadena para nombre del cliente, cédula del cliente).
 * En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y
 * el número de kilowatios del mes. Y se genera en pantalla el siguiente reporte: Cliente Ana Contreras
 * con cédula 1100112233 debe cancelar el valor de $10
 * En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del
 * predio se saca el 2% del valor del inmueble. Y se genera el siguiente reporte:
 * Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que
 * pagar de predio $ 600.
 * En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz;
 * 2 se llama al procedimiento calcularPredio. Los datos que se necesita en cada procedimiento
 * se los debe ingresar por teclado.
 *
 * @author Usuario juampyz7
 */
import java.util.Scanner;

public class Ejercicio4_ValordePlanillayPredio {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        String nombre, cedula;
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Calcular el valor de la planilla de luz");
        System.out.println("2. Calcular el valor del predio de un bien inmueble");
        System.out.print("Opcion: ");
        opcion = tcl.nextInt();
        tcl.nextLine();

        System.out.print("Ingrese su Nombre y Apellido: ");
        nombre = tcl.nextLine();
        System.out.print("Ingrese su Cedula de ciudadania: ");
        cedula = tcl.nextLine();
        if (opcion == 1) {
            calcularValorPlanilla(tcl, nombre, cedula);
        } else if (opcion == 2) {
            calcularPredio(tcl, nombre, cedula);
        } else {
            System.out.println("La opcion ingresada es incorrecta, vuelve a intentarlo");
        }
    }

    public static void calcularValorPlanilla(Scanner tcl, String Nombre, String Cedula) {
        System.out.print("Ingrese el valor del kilovatio: ");
        double kilovatio = tcl.nextDouble();
        System.out.print("Ingrese la cantidad de kilovatios consumidos durante el mes: ");
        double kilovatioMes = tcl.nextDouble();
        double pagoTotal = kilovatio * kilovatioMes;
        System.out.printf("Cliente %s con cedula %s debe cancelar el valor de $%.2f%n",
                Nombre, Cedula, pagoTotal);
    }

    public static void calcularPredio(Scanner tcl, String Nombre, String Cedula) {
        System.out.print("Ingrese el valor del bien inmueble: ");
        double valorInmueble = tcl.nextDouble();
        double valorPredio = valorInmueble * 0.02;
        System.out.printf("Cliente %s con cedula %s tiene un bien inmueble valorado en $%.2f y tiene que pagar de predio $%.2f%n",
                Nombre, Cedula, valorInmueble, valorPredio);
    }
}
/**
 * run:
Seleccione una opcion:
1. Calcular el valor de la planilla de luz
2. Calcular el valor del predio de un bien inmueble
Opcion: 1
Ingrese su Nombre y Apellido: Juan Loja
Ingrese su Cedula de ciudadania: 1105826877
Ingrese el valor del kilovatio: 0,09
Ingrese la cantidad de kilovatios consumidos durante el mes: 115
Cliente Juan Loja con cedula 1105826877 debe cancelar el valor de $10,35
BUILD SUCCESSFUL (total time: 19 seconds)
* run:
Seleccione una opcion:
1. Calcular el valor de la planilla de luz
2. Calcular el valor del predio de un bien inmueble
Opcion: 2
Ingrese su Nombre y Apellido: Juan Loja
Ingrese su Cedula de ciudadania: 1105826877
Ingrese el valor del bien inmueble: 75000
Cliente Juan Loja con cedula 1105826877 tiene un bien inmueble valorado en $75000,00 y tiene que pagar de predio $1500,00
BUILD SUCCESSFUL (total time: 26 seconds)
 */
