package JavaProbeklausur;

public class InsertionSort {
    public static void main(String[] args) {
        int[] elements = {5, 8, 2, 1, 9, 4};
        
        for (int i = 1; i < elements.length; i++) {
            int currentElement = elements[i];
            int j = i; // sorting first area in while-loop
            
            while (j > 0 && currentElement < elements[j - 1]) {
                // Shift elements to the right to make space for the current element
                elements[j] = elements[j - 1];
                j--;
            }
            
            // Insert the current element in the correct position
            elements[j] = currentElement;
        }
        
        // Print the sorted array
        for (int num : elements) {
            System.out.print(num + " ");
        }
    }
}

