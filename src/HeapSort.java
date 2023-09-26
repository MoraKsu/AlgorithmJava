public class HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Построение кучи (перегруппировка массива)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Один за другим извлекаем элементы из кучи
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец массива
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызываем heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }

    // Преобразование поддерева с корнем в позиции i в максимальную кучу
    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Инициализация наибольшего элемента как корня
        int leftChild = 2 * i + 1; // Левый потомок
        int rightChild = 2 * i + 2; // Правый потомок

        // Если левый потомок больше корня
        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        // Если правый потомок больше, чем самый большой элемент на данный момент
        if (rightChild < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        // Если наибольший элемент не корень
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно применяем heapify к поддереву
            heapify(arr, n, largest);
        }
    }
}
