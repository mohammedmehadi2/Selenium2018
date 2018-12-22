public class SelectionSort {

    void sort(int arr[]) {
        int n = arr.length;

// One by one move boundary of unsorted subarray
        for (int i = 0; i < n ; i++) {
// Find the minimum element in unsorted array
            int min_idx = i;
            System.out.println("");
            for (int j = i ; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

// Swap the found minimum element with the first
// element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        int arr[] = {9, 7, 8, 6, 4, 1, 5, 12, 33, 45, 76, 787,575,43543,44478,8787,656,112,9888787};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}