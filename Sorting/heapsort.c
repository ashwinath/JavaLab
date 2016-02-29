#include <stdio.h>
#include <stdlib.h>
#define MAX 100

void max_heapify(int a[], int n);
void build_max_heap(int a[]);
void swap(int a[], int x, int y);
void heapssort(int a[]);
void print_array(int a[]);
int heap_size;

void max_heapify(int a[], int n) {
  int l = 2*n+1;
  int r = 2*n+2;
  int largest = n;
  if (l <= heap_size-1 && a[l] > a[n])
    largest = l;
  if (r <= heap_size-1 && a[r] > a[largest])
    largest = r;
  if (largest != n) {
    swap(a, n, largest);
    max_heapify(a, largest);
  }
}

void build_max_heap(int a[]) {
  int i;
  for (i = heap_size/2 - 1; i >= 0; i--) {
    max_heapify(a,i);
  }
}

void swap(int a[], int x, int y) {
  int t;
  t = a[x]; a[x] = a[y]; a[y] = t;
}

void heapsort(int a[]) {
  heap_size = MAX;
  build_max_heap(a);
  while (heap_size > 1) {
    swap(a, 0, heap_size -1);
    --heap_size;
    max_heapify(a, 0);
  }
}

void print_array(int a[]) {
  int i;
  for (i = 0; i < MAX; i++) {
    printf("%i ", a[i]);
  }
  printf("\n");
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
  heapsort(a);
  print_array(a);
  return 0;
}
