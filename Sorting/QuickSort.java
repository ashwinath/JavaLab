public class QuickSort {
  private static final int MAX = 10;
  public static void sortArray(int a[], int l, int r) {
    int v, i, j, t;
    if (r > l) {
      v = a[r];
      i = l-1;
      j = r;
      for(;;) {
        while (a[++i] < v) 
          ;
        while (a[--j] > v) 
          ;
        if (i >= j)
          break;
        t = a[i]; a[i] = a[j]; a[j] = t;
      }
      t = a[i]; a[i] = a[r]; a[r] = t;
      System.out.println();
      sortArray(a,l,i-1);
      sortArray(a,i+1,r);
    }
  }

  public static void main (String[] args) {
    int[] array = new int[MAX];
    for (int x = 0; x != MAX; ++x) {
      array[x] = (int)(Math.random() * MAX);
    } 
    System.out.println("initial array");
    sortArray(array,0,MAX-1);
    for (int x : array) {
      System.out.print(x + ", ");
    } 
    System.out.println();
  }
}
