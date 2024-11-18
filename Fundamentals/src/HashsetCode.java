import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashsetCode {

    public static void main(String[] args) {


        /*
        
        Collection Framwork

       set collection of unique values 
       it does not support index value system

       to get sorted value instead of hashset use treeset it automaticall sort 


       treeset are sorted set by default
       treeset extends -> abstract set extends -> sorted set

         */
        

        Collection<Integer> set = new TreeSet<>();

        set.add(55);
        set.add(85);

        set.add(5);
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(15);
        set.add(20);
        set.add(25);



System.out.println(set +" : size = "+ set.size());

set.remove(15);
System.out.println(set +" : size = "+ set.size());

System.out.println(set.contains(20)+" : "+set.contains(105));

for(int i : set){
    System.out.println(i);
}

// iterator for each loop
System.out.println("Iterator Loop ");
Iterator<Integer> val = set.iterator();

while (val.hasNext()) {
    System.out.println(val.next());
}


    }
    
}
