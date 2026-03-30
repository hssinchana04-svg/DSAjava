public class SortingProblem {
  public static void printArray(int arr[]){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  //mergsort
  public static void mergeSort(int arr[], int si, int ei){
    //base case
    if(si >= ei){
      return;
    }
    //kaam
    int mid = si+(ei-si)/2;
    mergeSort(arr, si, mid);
    mergeSort(arr, mid+1, ei);
    merge(arr, si, mid, ei);
  }
  public static void merge(int arr[], int si, int mid, int ei){
    int temp[] = new int[ei-si+1];
    int i = si; //left
    int j = mid+1; //right
    int k = 0; //temp

    while(i<=mid && j<=ei){
      if(arr[i] < arr[j]){
        temp[k] = arr[i];
        i++;
      }else{
        temp[k] = arr[j];
        j++;
      }
      k++;
    }

    //left part
    while(i<=mid){
      temp[k++] = arr[i++];
    }

    //right part
    while(j<=ei){
      temp[k++] = arr[j++];
    }

    //copy temp to original
    for(k=0, i=si; k<temp.length; k++, i++){
      arr[i] = temp[k];
    }
  }

  public static void quickSort(int arr[], int si, int ei){
    //base case
    if(si >= ei){
      return;
    }

    //last element as pivot
    int pivotIndex = partition(arr, si, ei);
    quickSort(arr, si, pivotIndex-1); //left part
    quickSort(arr, pivotIndex+1, ei); //right part

  }

  public static int partition(int arr[], int si, int ei){
    int pivot = arr[ei];
    int i = si-1; //to find index of smaller element

    for(int j=si; j<ei; j++){
      if(arr[j] <= pivot){
        i++;
        //swap
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
    i++;
    //swap pivot to correct position
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;

    return i; //returning pivot index
  }

  public static void RotatedSortedArray(int arr[], int target){
    int si = 0;
    int ei = arr.length-1;

    while(si <= ei){
      int mid = si+(ei-si)/2;

      if(arr[mid] == target){
        System.out.println("Element found at index: "+mid);
        return;
      }

      //left part is sorted
      if(arr[si] <= arr[mid]){
        if(target >= arr[si] && target < arr[mid]){
          ei = mid-1;
        }else{
          si = mid+1;
        }
      }
      //right part is sorted
      else{
        if(target > arr[mid] && target <= arr[ei]){
          si = mid+1;
        }else{
          ei = mid-1;
        }
      }
    }
    System.out.println("Element not found in the array.");
  }
  public static void main(String[] args) {
    int arr[] = {6, 3, 9, 5, 2, 8};
    mergeSort(arr, 0, arr.length-1);
    printArray(arr);
  }
}
