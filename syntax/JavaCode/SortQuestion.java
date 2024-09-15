/**
 * The SortQuestion class provides methods for sorting integer arrays.
 */
public class SortQuestion {

    /**
     * Finds the index of the smallest element in the array starting from K (the given index).
     * @param inputArray The input array of integers.
     * @param k          The starting index for finding the minimum element.
     * @return           The index of the smallest element in the array.
     */
    public static int findIndexOfSmallest(int[] inputArray, int k) {
        int x = inputArray[k];
        int answer = k;
        int index = k + 1;
        while (index < inputArray.length) {
            if (inputArray[index] < x) {
                x = inputArray[index];
                answer = index;
            }
            index = index + 1;
        }
        return answer;
    }

    /**
     * Sorts the input array in ascending order using the mystery method.
     * 
     * @param inputArray The input array of integers to be sorted.
     */
    public static void selectionSort(int[] inputArray) {
        int index = 0;
        while (index < inputArray.length) {
            int targetIndex = findIndexOfSmallest(inputArray, index);
            int temp = inputArray[targetIndex];
            inputArray[targetIndex] = inputArray[index];
            inputArray[index] = temp;
            index = index + 1;
        }
    }

    /**
     * Prints the elements of the input array.
     * 
     * @param inputArray The input array of integers to be printed.
     */
    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
            System.out.print(' ');
        }
        System.out.print('\n');
    }

    public static void main(String[] args) {
        int[] inputArray = {3, 0, 4, 6, 3};

        System.out.println("Print inputArray after calling mystery");
        printArray(inputArray);
        

        selectionSort(inputArray);
        System.out.println("Print inputArray after calling mystery2");
        printArray(inputArray);
    }
}
