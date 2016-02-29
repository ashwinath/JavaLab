#include <stdio.h>
#include <stdlib.h>
#define MAX 100

int helper[MAX];

void merge(int a[], int l, int m, int r) {
  int i,j,k;
  for (i = l; i <= r; ++i)
    helper[i] = a[i];
  i = l;
  j = m +1;
  k = l;

  while (i <= m && j <= r) {
    a[k++] = helper[i] <= helper[j] ? helper[i++] : helper[j++];
  }

  // copy the rest of the left side array
  while (i <= m) {
    a[k++] = helper[i++];
  }
}

void mergesort(int a[], int l, int r) {
  if (l < r) {
    int m = l + (r - l)/2;
    mergesort(a,l,m);
    mergesort(a,m+1,r);
    merge(a,l,m,r);
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
