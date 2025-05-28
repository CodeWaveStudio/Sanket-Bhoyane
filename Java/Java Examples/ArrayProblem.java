public class ArrayProblem{
    public static void main(String[] args) {
        int[] arr={10,5,3,6,2};
        int[] result=new int[5];
        for(int i=0;i<=arr.length-1;i++){
            int mult=1;
            for(int j=0;j<=arr.length-1;j++){
                if(i!=j){
                    mult=mult*arr[j];  //5 15 90 180   // 10 30 180 360 // 10 50 300 600 // 10 50 150 300 // 10 50 150 900
                }
               
            }
            result[i]=mult;
        }
        for(int n:result){
            System.out.println(n);
        }
    }
}