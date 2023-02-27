import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * homework4
 */
public class homework4 {
    public static void main(String[] args) {
       
    }

    private static int[] readFile() throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        String[] stringArray = scanner.nextLine().split(",");
        int[] intArray = new int[stringArray.length];

        for(int i = 0; i < stringArray.length; i++){
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        scanner.close();
        return intArray;
    }

    private static void heapSort(int[] arr) { // Построение дерева
        int n = arr.length;
        for(int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }


    }
}