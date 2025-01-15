
/**
 * Generar los procedimientos y/o funciones que impriman los valor pares,
 * impares y el promedio de un arreglo bidimensional. El (los) procedimiento(s)
 * o método(s) deben ser invocados desde el método principal (quien es el único
 * responsable de gestionar las entradas/salidas); además el método debe recibir
 * como parámetro un arreglo bidimensional.
 *
 * @author Usuario juampyz7
 */
import java.util.Scanner;

public class Ejercicio1_ProcesodeArreglo {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limF = 0, limC = 0;
        System.out.print("DAME EL LIMITE DE FILAS Y COLUMNAS: ");
        limF = tcl.nextInt();
        limC = tcl.nextInt();
        int matriz[][] = new int[limF][limC];
        generarMatriz(matriz);
        System.out.println("MATRIZ GENERADA: ");
        presentarMatriz(matriz);
        System.out.println("");
        presentarParImparMatriz(matriz);
        System.out.println("");
        System.out.println("PROMEDIO DE LA MATRIZ");
        presentarPromedioMatriz(matriz);
    }

    public static void generarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void presentarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void presentarParImparMatriz(int matriz[][]) {
        System.out.println("ELEMENTOS PARES DE LA MATRIZ:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2 == 0) ? matriz[i][j] + (" ") : "");
            }
            System.out.println(" ");
        }
        System.out.println("ELEMENTOS IMPARES DE LA MATRIZ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2 != 0) ? matriz[i][j] + (" ") : "");
            }
            System.out.println("");
        }
    }

    public static void presentarPromedioMatriz(int matriz[][]) {
        int sumaMatriz = 0, promedioM = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaMatriz += matriz[i][j];
            }
        }
        promedioM = sumaMatriz / (matriz.length * matriz[0].length);
        System.out.println("EL PROMEDIO DE LA MATRIZ: " + promedioM);
    }
}
/**
 * run:
DAME EL LIMITE DE FILAS Y COLUMNAS: 3 3
MATRIZ GENERADA: 
6 8 4 
5 7 4 
0 5 5 

ELEMENTOS PARES DE LA MATRIZ:
6 8 4  
4  
0  
ELEMENTOS IMPARES DE LA MATRIZ

5 7 
5 5 

PROMEDIO DE LA MATRIZ
EL PROMEDIO DE LA MATRIZ: 4
BUILD SUCCESSFUL (total time: 7 seconds)
 */