#include <stdio.h>
#include <stdlib.h>
#define MAX 20

void quicksort(int a[], int l, int r);
int partition(int a[], int l, int r);

void quicksort(int a[], int l, int r) {
  if (r > l) {
    int i = partition(a, l, r);
    quicksort(a, l, i-1);
    quicksort(a, i+1, r);
  }
}

int partition(int a[], int l, int r) {
  int v, i, j, t;
  v = a[r];
  i = l-1;
  j = r;
  for (;;) {
    while (a[++i] < v)
      ;
    while (a[--j] > v)
      ;
    if (i >= j)
      break;
    t = a[i]; a[i] = a[j]; a[j] = t;
  }
  t = a[i]; a[i] = a[r]; a[r] = t;
  return i;
}

int main(int argc, const char *argv[])
{
  int a[MAX];
  int i;
  for (i = 0; i < MAX; i++) {
    a[i] = rand()%100;
    printf("%i, ", a[i]);
  }
  printf("\n");
  quicksort(a,0,MAX-1);
  for (i = 0; i < MAX; i++) {
    printf("%i, ", a[i]);
  }
  printf("\n");
  return 0;
}
