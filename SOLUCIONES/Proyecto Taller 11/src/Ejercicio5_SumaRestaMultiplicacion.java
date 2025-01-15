
/**
 * Generar las funciones/métodos que devuelvan las suma, resta y multiplicación
 * de un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 *
 * @author Usuario juampyz7
 */
import java.util.Scanner;

public class Ejercicio5_SumaRestaMultiplicacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de las matrices: ");
        int n = scanner.nextInt();

        int[][] matrizA = generarMatriz(n);
        int[][] matrizB = generarMatriz(n);

        System.out.println("Matriz A:");
        imprimirMatriz(matrizA);
        System.out.println("Matriz B:");
        imprimirMatriz(matrizB);
        System.out.println("Suma de matrices:");
        imprimirMatriz(sumarMatrices(matrizA, matrizB));
        System.out.println("Resta de matrices:");
        imprimirMatriz(restarMatrices(matrizA, matrizB));
        System.out.println("Multiplicacion de matrices:");
        imprimirMatriz(multiplicacionMatrices(matrizA, matrizB));
    }

    public static int[][] generarMatriz(int n) {
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 10); 
            }
        }
        return matriz;

    }

    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        int n = matrizA.length;
        int[][] resultado = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
    }

    public static int[][] restarMatrices(int[][] matrizA, int[][] matrizB) {
        int n = matrizA.length;
        int[][] resultado = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }
        return resultado;
    }

    public static int[][] multiplicacionMatrices(int[][] matrizA, int[][] matrizB) {
        int n = matrizA.length;
        int[][] resultado = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return resultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
}
/**
 * run:
Ingrese el tama�o de las matrices: 3 3
Matriz A:
8	1	0	
1	6	6	
7	2	5	
Matriz B:
4	5	9	
5	7	0	
5	1	0	
Suma de matrices:
12	6	9	
6	13	6	
12	3	5	
Resta de matrices:
4	-4	-9	
-4	-1	6	
2	1	5	
Multiplicacion de matrices:
37	47	72	
64	53	9	
63	54	63	
BUILD SUCCESSFUL (total time: 7 seconds)
 */
