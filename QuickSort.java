

// The main class for the QuickSort implementation
public class QuickSort= {

    // Partition method: Divides the array into two parts around a pivot
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // The pivot element is the last element of the array
        int i = low - 1; // Pointer for elements smaller than the pivot

        // Loop through the array from 'low' to 'high - 1'
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) { // Check if the current element is smaller or equal to pivot
                i++; // Increment the pointer for smaller elements
                
                // Swap arr[i] and arr[j]
                int temp = arr[i]; // Temporary variable for swapping
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (placing the pivot in the correct position)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the index of the pivot
    }

    // QuickSort method: Recursively sorts the array
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) { // Base condition: Stop when 'low' is not less than 'high'
            int pi = partition(arr, low, high); // Partition the array and get pivot index

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1); // Sort the left sub-array
            quickSort(arr, pi + 1, high); // Sort the right sub-array
        }
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Sample array to sort
        int[] numbers = {10, 3, 7, 4, 9, 2};

        // Print the unsorted array
        System.out.println("Unsorted List: ");
        for (int num : numbers) System.out.print(num + " ");
        System.out.println();

        // Call the quickSort method to sort the array
        quickSort(numbers, 0, numbers.length - 1);

        // Print the sorted array
        System.out.println("Sorted List: ");
        for (int num : numbers) System.out.print(num + " ");
        System.out.println();
    }
}

