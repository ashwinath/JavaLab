public class HeapSort {
  private static int heapSize;
  public static void heapify(int[] arr, int n) {
    int left = 2*n + 1;
    int right = 2*n + 2;
    int largest = n;
    if (left <= heapSize && arr[left] > arr[largest])
      largest = left;
    if (right <= heapSize && arr[right] > arr[largest])
      largest = right;
    if (largest != n) {
      swap(arr, n, largest);
      heapify(arr, largest);
    }
  }

  public static void build_heap(int[] arr) {
    for (int i = (heapSize-1)/2; i >= 0; i--)
      heapify(arr, i);
  }

  public static void heapSort(int[] arr) {
    heapSize = arr.length-1;
    build_heap(arr);
    while (heapSize > 0) {
      swap(arr, 0, heapSize);
      --heapSize;
      heapify(arr, 0);
    }
  }

  public static void swap(int[] arr, int i, int k) {
    int t;
    t = arr[i]; arr[i] = arr[k]; arr[k] = t;
  }

  private static final int MAX = 10;

  public static void main (String[] args) {
    int[] array = new int[MAX];
    for (int x = 0; x != MAX; ++x) {
      array[x] = (int)(Math.random() * MAX);
    } 
    heapSort(array);
    for (int x : array) {
      System.out.print(x + " ");
    } 
    System.out.println();
  }
}
