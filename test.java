public class test {
    public static void main(String[] args) {
        SingetonClass s1=SingetonClass.getSingetonClass();
        SingetonClass s2=SingetonClass.getSingetonClass();
        SingetonClass s3=SingetonClass.getSingetonClass();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
