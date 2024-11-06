import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");


        // data types 
        // java has 2 data types primitive and non primitive aslo call reference based

        // primitive types

        // Data Type and Variables

        int channelAge = 3;
        String channelName = "CSTechTube";

        // for bigger integer values
        long channelSubscribers = 1_00_00_000L;

        // for bigger decimal Values
        float channelWatchTime = 5565465.8F;
        
        double shortWatchTime = 20.4;  

        // note char values denoted in single inverted comma
        char letter = 'C'; 
        boolean isMonetize = true;

        System.out.println("");

        System.out.println("Hello Coders welcome to "+channelName+" we have succesfully completed "+channelAge+ ", We are thrilled to share that we have achieved milestone of "+channelSubscribers+" and our channel watchtime is "+channelWatchTime+" and it is monetize is Approved by Google "+isMonetize );

        // reference it is used to store complex objects
         // we need to allocate memory which is created using keyword 'new'
         System.out.println("");
        Date currentData = new Date();

        // short command to sout (tab)
       System.out.println(currentData);
       System.out.println("");


    //    Arithmatic operator (+, -, *, /, %,**)
       int num1 = 64;
       int num2 = 8;
       int addResult = num1 + num2;
       int subtractResult = num1 - num2;
       int multiplyResult = num1 * num2;
       int divisionResult = num1 / num2;
       int remainderRsult = num1 % num2;


       System.out.println("num1 = "+num1+" num2 = "+num2+" Add = "+addResult+" Subtract = "+subtractResult+" Multiply = "+multiplyResult+" Division = "+divisionResult +" "+ remainderRsult) ;


    //   relational operator (> , < , >= , <= , == , !=)

       int n1 = 98;
       int n2 = 30;
       int n3 = 78;
       int n4 = 56;


       if (n1 > n2){
        if(n1 > n3){
            System.out.println("\n Greatest Number = "+n1);
        }
        else{
            System.out.println("\n Greatest Number = "+n3);

        }
       }
       else{
        if(n2 > n3){
            System.out.println("\n Greatest Number = "+n2);

        }
        else{
            System.out.println("\n Greatest Number = "+n3);

        }
       }
       

    //    Logical Operator ( and = && , or = || , not = !)
     
    boolean logicalResult = n2 > n4 || n4 > n3;

    System.out.println(!logicalResult);


    // conditional test

    if(n1 > n2){
        System.out.println(n1);
    }
    else if( n2 > n3 ){
        System.out.println(n2);
    }
    else{
        System.out.println(n3);
    }

    //    

    // ternary operator 
    
    int ternaryResult = n1 > n2 ? n1 : n2;

    System.out.println("ternary opertor = "+ternaryResult);



    // switch statement

    int weekNumber = 8;
    switch (weekNumber) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
                
            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;
            
        default:
            System.out.println("Enter valid Week Number !");
            break;
    }



    // foor loop
// table priniting



    Scanner userInputData = new Scanner(System.in);
    System.out.println("Enter Data of which table required = ");

    String tableInput = userInputData.next();

    int inputVal  = Integer.parseInt(tableInput);


    for(int i=1 ; i <= 10 ; i++){
            // System.out.println( tableRequest +" * "+i+" = ",tableRequest*i);
            System.out.println(inputVal+" * "+i+" = "+inputVal*i);
    }


    // print sum and reverse of entered digit;


    Scanner userInputDigit = new Scanner(System.in);
    System.out.println("Enter user Input to get Sum of Digit = ");

    String inputValString = userInputDigit.nextLine();

    int num = Integer.parseInt(inputValString);

    int sum = 0;
    int rev = 0;
    
    // while ( num > 0){
    //     int rem = num % 10;
    //     sum = sum + rem;
    //     num = num / 10;
        
    // }

    while (num > 1){
        int rem = num % 10;
        rev = rev *10 + rem;
        System.out.println(rev);
        num = num /10;
        System.out.println(num);

    }

    System.out.println(sum);
    System.out.println(rev);


int val1 = 3;
int val2 = 6;


int bitval1 = (~val1 & val1);

int bitval2 = (val2 & ~val2);

int bitResult = (~val1 & val2) | (val1 & ~val2);

System.out.println(val1 +" "+~val1);
System.out.println(val2 +" "+~val2);


System.out.println(bitval1);

System.out.println(bitval2);



System.out.println(bitResult);


    }
}

