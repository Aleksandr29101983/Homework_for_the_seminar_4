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

    private static void heapify(int[] arr, int i, int n) { // Ранжирование "родителей" и "детей"
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int largest = i;

        if(l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        if(r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if(i != largest) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, n);
        }
    }
}