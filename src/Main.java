import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        System.out.println("Исходный массив:");
        printArray(arr);

        HeapSort.heapSort(arr);

        System.out.println("\nОтсортированный массив:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}