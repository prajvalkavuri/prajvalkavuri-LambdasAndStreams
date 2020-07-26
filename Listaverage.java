import java.util.*; 
import java.util.stream.IntStream; 
  
class Listaverage { 
  
    public static void main(String[] args) 
    { 
        IntStream inside = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9,10);  
        OptionalDouble average` = inside.average(); 
        if (average.isPresent()) { 
            System.out.println(average.getAsDouble()); 
        } 
        else { 
            System.out.println("-1"); 
        } 
    }
}