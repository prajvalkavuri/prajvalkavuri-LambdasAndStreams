import java.util.stream.Stream; 
  
class filterstrings { 
  
    public static void main(String[] args) 
    { 
        Stream<String> list = Stream.of("one", "and", "two", "are","all","numbers"); 
        list.filter(s -> s.startsWith("a") && s.length()==3)
        .forEach(System.out::println); 
    } 
} 

    