import java.util.HashMap;
import java.util.Scanner;

public class FavouriteSinger{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Songs=sc.nextInt();
        HashMap<Integer,Integer> frequencySong=new HashMap<>();
        for(int i=0;i<Songs;i++){
            int Singers=sc.nextInt();
            frequencySong.put(Singers,frequencySong.getOrDefault(Singers, 0)+1);//count the singer and their songs
        }
        int maxFreq=0;
        for(int frequency:frequencySong.values()){
            maxFreq=Math.max(maxFreq, frequency);
        }
        int favouriteSinger=0;
        for(int frequency:frequencySong.values()){
            if(maxFreq==frequency){
                favouriteSinger++;
            }
        }
        System.out.println(favouriteSinger);
}
}