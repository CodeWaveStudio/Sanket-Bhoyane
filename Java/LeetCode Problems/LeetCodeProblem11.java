import java.util.Arrays;
import java.util.Scanner;

public class LeetCodeProblem11 {

   
  public static int calMaxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;
          while(left<=right){
          int width=right-left;  //8 7 6 4 3 1
          int height1=Math.min(height[left],height[right]); //1 //7 //8 //5 //2 //6
          int area=width*height1;    //0 49  42  40 16 42 0
             maxArea=Math.max(area,maxArea);
          if(height[left]<height[right]){
            left++;
          }
          else{
            right--;
          }
        }
        return maxArea;
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] height=new int[n];
        for(int i=0;i<height.length;i++){
    height[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(height));

        int maxArea=calMaxArea(height);
        System.out.println("Maximum Area that can store the max water -> "+maxArea);
    }
}
