import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapCode {
 public static void main(String[] args) {
    
    Map<String, Integer> students = new HashMap<>();
    students.put("Vaibhav", 55);
    students.put("Darsh", 75);
    students.put("Rahul", 95);
    students.put("Neha", 85);
    students.put("Sumit", 45);


    System.out.println(students);

    System.out.println( students.get("Rahul") +" : "+ students.size());

    students.put("Sumit", 75);
    
    System.out.println(students);

    System.out.println( students.keySet());
    System.out.println();

    for(String name : students.keySet() ){
        System.out.println(  name+ " : "+students.get(name));
    }

    System.out.println(students.values());

    students.remove("Vaibhav");

    System.out.println( students +" : "+ students.size());


 }   
}
