#include <stdio.h>
#include <stdlib.h>
#define MAX 100 

int b[MAX];

void merge(int arr[], int l, int m, int r) {
  int i, j, k;
  for (i = m+1; i > l; i--)
    b[i-1] = arr[i-1];
  for (j = m; j < r; j++)
    b[r+m-j] = arr[j+1];
  for (k = l; k <= r; k++)
    arr[k] = (b[i]<b[j]) ? b[i++] : b[j--];
}

void mergesort(int arr[], int l, int r) {
  if (l < r) {
    int m = l+(r-l)/2;
    mergesort(arr, l, m);
    mergesort(arr, m+1, r);
    merge(arr, l, m, r);
  }
}

int main(int argc, const char *argv[])
{
  int a[MAX];
  int i;
  for (i = 0; i < MAX; i++) {
    a[i] = rand()%100;
    printf("%i ", a[i]);
  }
  printf("\n");

  mergesort(a,0,MAX-1);
  for (i = 0; i < MAX; i++) {
    printf("%i ", a[i]);
  }
  printf("\n");
  return 0;
}
