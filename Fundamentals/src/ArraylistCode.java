import java.util.ArrayList;
import java.util.Collections;

public class ArraylistCode {

    public static void main(String[] args) {
        

        /*
        
        Array List is orderlist , index based, dynamically increased list
    

         */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(35);

        System.out.println(list+" : "+list.size());

        list.remove(2);

        System.out.println(list);

        list.add(2,75);

        list.set(4,85);

        System.out.println(list.indexOf(30)+" : "+list);

        System.out.println("\nDoes it contain 55 = "+list.contains(55));


        System.out.println("\nNormal for loop ");

        // normal loop based traverse
        for(int i =0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        // foreach loop traverse
System.out.println("\nEnhance for loop ");
        for(int i : list){
            System.out.println(i);
        }

        // arraylist sorting

        Collections.sort(list);

        System.out.println(list);

    }
}
