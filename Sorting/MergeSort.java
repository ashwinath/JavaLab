public class MergeSort {
  private static final int MAX = 200;
  private static int[] tempMergArr = new int[MAX];

  public static void merge(int arr[], int l, int m, int r) {
    for (int i = l; i <= r; i++)
      tempMergArr[i] = arr[i];
    int i = l;
    int k = l;
    int j = m+1;
    while (i <= m && j <= r)
      arr[k++] = (tempMergArr[i] <= tempMergArr[j]) ? tempMergArr[i++] : tempMergArr[j++];
    while (i <= m)
      arr[k++] = tempMergArr[i++];
  }

  public static void mergesort(int arr[], int l, int r) {
    if (l < r) {
      int m = l+(r-l)/2;
      mergesort(arr, l, m);
      mergesort(arr, m+1, r);
      merge(arr, l, m, r);
    }
  }

  public static void main (String[] args) {
    int[] array = new int[MAX];
    for (int x = 0; x != MAX; ++x) {
      array[x] = (int)(Math.random() * 100);
      System.out.print(array[x] + " ");
    } 
    System.out.println();
    mergesort(array,0,MAX-1);
    for (int x : array) {
      System.out.print(x + " ");
    } 
    System.out.println();
  }
}
