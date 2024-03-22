import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
          public static void main(String[] args) {
        	 
	ArrayList<String> a = new ArrayList<String>();
	 a.add("swarna");
	 a.add("srija");
	 a.add("ramu");
	 a.add("manu");
	 a.add("sri");
	 a.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	 Long c = a.stream().filter(s->s.length()>2).count();
	 System.out.println(c);
	 System.out.println("********");
	boolean flag =  a.stream().anyMatch(s->s.equalsIgnoreCase("sri"));
	System.out.println(flag);
	 System.out.println("********");
	 a.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	 a.stream().filter(s->s.length()>1).forEach(s->System.out.println(s.startsWith("m")));
	 a.stream().filter(s->s.startsWith("s")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	 System.out.println("********");
	 List<String> l = Arrays.asList("hello","yey","comman","man","hell","human");
	List<String> l1 = l.stream().filter(s->s.startsWith("h")).map(s->s.toUpperCase()).collect(Collectors.toList());
	System.out.println(l1.get(1));
	System.out.println("********");
	List<Integer> in = Arrays.asList(7,3,1,2,6,0,3,2,1,9,3,1,4,7);
	List<Integer> inn = in.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(inn);
	

          }	
}
