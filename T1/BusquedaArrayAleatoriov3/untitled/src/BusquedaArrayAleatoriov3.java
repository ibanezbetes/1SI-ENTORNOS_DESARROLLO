import java.util.Random;
import java.util.Scanner;

public class BusquedaArrayAleatoriov3 {
    public static void main(String[] args) {
        // Inicializar variables
        boolean encontrado = false;
        int [] array = new int[100];
        int x, i = 0;

        // Leer el número que se va a buscar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número para buscar en el array: ");
        x = scanner.nextInt();

        // Llenar el array con números aleatorios entre 1 y 1000
        Random random = new Random();
        for (int j = 0; j < 100; j++) {
            array[j] = random.nextInt(1000) + 1;
        }

        // Buscar el número en el array
        while (i < 100 && !encontrado) {
            if (array[i] == x) {
                System.out.println("El número " + x + " está en la posición " + i + ".");
                encontrado = true;
            }
            i++;
        }
        // Si no se encontró el número
        if (!encontrado) {
            System.out.println("No existe el número " + x + " en el array.");
        }
    }
}
