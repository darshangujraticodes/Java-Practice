import java.util.Scanner;
import java.lang.FunctionalInterface;


// note declaring annotation without import lead to error
@FunctionalInterface
interface MathsOperation{
     int sum(int num1, int num2);

}


// in this there will no chill which implement interface


public class LambdaFunctionCode {
 public static void main(String[] args) {

    // MathsOperation obj = new MathsOperation(){    
    //     public int sum(int n1 ,int n2){
    //         return n1 + n2;
    //     }
    // };

    // now this above multiple line of code will be converted into single ine of code using lambda

    // similar to javascrip arrow functions in java it is called lambda functions

    Scanner inputObj = new Scanner(System.in);
    System.out.println("Enter First Value");

    int n1 =  Integer.parseInt(inputObj.nextLine());
    int n2 = Integer.parseInt(inputObj.nextLine());


    // note here parameter num1 and num2 should be of same name which is declare above in interface method
    MathsOperation obj = ( num1 , num2) ->   num1 + num2;

    int sumResult = obj.sum(n1,n2);
    System.out.println("add result = "+sumResult);
 }   
}
