import java.util.Arrays;

public class BinarySearch {
 public static void main(String[] args) {
    int [] arr={11,12,5,25,1};
    int target=25;
    Arrays.sort(arr);
    for(int num:arr){
        System.out.print(num+" ");
    }
    System.out.println();
     System.out.println(binarySearch(arr, target));
 }  
 public static int binarySearch(int[] arr,int target) {
    int left=0,right=arr.length-1;
     while(left<=right){
        int mid=left+(right-left)/2;
        if(arr[mid]==target)return mid;
        else if(arr[mid]<target) left=mid+1;
  else{
    right=mid-1;
  }
     }
  return -1;
 }
}
