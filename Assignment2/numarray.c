#include<stdio.h> 
#include <string.h>
#include <stdlib.h>

int findMax(int arr[], int n) {
  
      // Assume the first element is the largest
    int max = arr[0];
    for (int i = 1; i < n; i++) {
      
          // Update max if arr[i] is greater
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}


float getAvg(int arr[], int n) {
    int sum = 0;

    // Find the sum of all elements
    for (int i = 0; i < n; i++) {
        sum += arr[i];
    }
      
      // Return the average
    return (float)sum / n;
}


int* mergeArrays(int arr1[], int n1, int arr2[], int n2) {
  
    // Resultant array to store merged array
    int *res = (int*)malloc(sizeof(int) * n1 * n2);
  
    // Copy elements of the first array
    memcpy(res, arr1, n1 * sizeof(int));

    // Copy elements of the second array
    memcpy(res + n1, arr2, n2 * sizeof(int));
  
    return res;
}


void printArr(int arr[], int n)
{
    int i, j;
    for (i = 0; i < n; i++)
      printf("%d ", arr[i]);
    printf("\n");
}


int main() {
    int arr[] = {5, 2, 7, 6};     
    int arr2[] = {2, 4, 6};
    int n = sizeof(arr) / sizeof(arr[0]);
    int n2 = sizeof(arr2) / sizeof(arr2[0]);
    
      // Merge arr1 and arr2
    int* marr = mergeArrays(arr, n, arr2, n2);
    printArr(marr, n+n2);

    printf("%d\n", findMax(arr, n));  

    // Calculate the average of array arr
    float avg = getAvg(arr, n);      
    printf("%.2f\n", avg);

    return 0;
}