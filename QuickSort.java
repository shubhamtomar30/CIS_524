// QuickSort implementation in Java
// Imperative paradigm, using loops and mutable arrays
public class QuickSort {

    // Partition method
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // QuickSort recursive function
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 3, 7, 4, 9, 2};

        System.out.println("Unsorted List: ");
        for (int num : numbers) System.out.print(num + " ");
        System.out.println();

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted List: ");
        for (int num : numbers) System.out.print(num + " ");
        System.out.println();
    }
}
