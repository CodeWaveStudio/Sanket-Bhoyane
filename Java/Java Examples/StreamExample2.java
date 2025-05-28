import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
 public static void main(String[] args) {
    
    List<String> list=Arrays.asList("sanket","tare","sunny","rohan","nagesh");
  
    list.stream().map(String::toUpperCase).forEach(System.out::println);
    
 }   
}
