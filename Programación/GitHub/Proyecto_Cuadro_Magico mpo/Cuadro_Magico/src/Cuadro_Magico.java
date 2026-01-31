import java.util.*;
public class Cuadro_Magico {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
System.out.print("Introduce el tamaño de la matriz (n): ");
int n = sc.nextInt();
int [][] matriz;
long intentos = 0;

do{
    matriz= generarMatrizAletoria(n,random);
    intentos++;
} while(!esCuadradoMagico(matriz));
int constanteMagica = calcularSumaFila(matriz, 0);

System.out.println("\n=== CUADRADO MÁGICO ENCONTRADO ===");
mostrarMatriz(matriz);

System.out.println("\nConstante mágica: " + constanteMagica);
System.out.println("Intentos realizados: " + intentos);
    }
    // Genera una matriz n x n con números aleatorios sin repetición
    private static int[][] generarMatrizAleatoria(int n, Random random) {
        int[][] matriz = new int[n][n];
        List<Integer> numeros = new ArrayList<>();

        // Rango de números (1 a n*n)
        for (int i = 1; i <= n * n; i++) {
            numeros.add(i);
        }

        Collections.shuffle(numeros, random);

        int indice = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = numeros.get(indice++);
            }
        }

        return matriz;
    }

    // Comprueba si una matriz es un cuadrado mágico
    private static boolean esCuadradoMagico(int[][] matriz) {
        int n = matriz.length;
        int sumaObjetivo = calcularSumaFila(matriz, 0);

        // Filas
        for (int i = 0; i < n; i++) {
            if (calcularSumaFila(matriz, i) != sumaObjetivo) {
                return false;
            }
        }

        // Columnas
        for (int j = 0; j < n; j++) {
            if (calcularSumaColumna(matriz, j) != sumaObjetivo) {
                return false;
            }

            // Diagonal principal
            int sumaDiagonalPrincipal = 0;
            for (int i = 0; i < n; i++) {
                sumaDiagonalPrincipal += matriz[i][i];
            }
            if (sumaDiagonalPrincipal != sumaObjetivo) {
                return false;
            }

            // Diagonal secundaria
            int sumaDiagonalSecundaria = 0;
            for (int i = 0; i < n; i++) {
                sumaDiagonalSecundaria += matriz[i][n - 1 - i];
            }
            if (sumaDiagonalSecundaria != sumaObjetivo) {
                return false;
            }

            return true;
        }
        private static int calcularSumaFila(int[][] matriz, int fila) {
            int suma = 0;
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[fila][j];
            }
            return suma;
        }

        private static int calcularSumaColumna(int[][] matriz, int columna) {
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][columna];
            }
            return suma;
        }
        // Muestra la matriz con formato alineado
        private static void mostrarMatriz(int[][] matriz) {
            for (int[] fila : matriz) {
                for (int valor : fila) {
                    System.out.printf("%4d", valor);
                }
                System.out.println();
    }
