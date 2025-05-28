import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Checker implements Comparator<Player>{
    public int compare(Player p1,Player p2){
      if(p1.score != p2.score){
          return p2.score-p1.score;
      }
      return p1.name.compareTo(p2.name);
    }
}

class Player{
  String name;
  int score;
  Player(String name,int score){
       this.name=name;
       this.score=score;
  }
}
public class HackerRank1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numbers Of Players:");
       
        int n=sc.nextInt();
        System.out.println();
         Player[] player=new Player[n];
         Checker checker=new Checker();
         System.out.println("Enter the Name & Score Of Player:");
         for(int i=0;i<n;i++){
           
            player[i]=new Player(sc.next(), sc.nextInt());
         }
         sc.close();
         System.out.println();
         Arrays.sort(player,checker);
         //System.out.println("% s %",player.name,player.score);
        //  for(Player p:player){
        //     System.out.printf("%s %s/n",p.name,p.score);
        //  }
        System.out.println("The Output is:");
        for(int i=0;i<player.length;i++){
            System.out.printf("%s %d\n",player[i].name,player[i].score);
        }
    }
}
