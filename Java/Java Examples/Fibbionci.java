public class Fibbionci {
    public static void main(String[] args) {
        int n=10;
        int var1=0;
        int var2=1;
        System.out.println(+var1 );
        System.out.println(+var2 );
        for(int i=2;i<n;i++){
    int var3=var1+var2;
    System.out.println(" "+var3);
    var1=var2;
    var2=var3;
        }

    }
}
