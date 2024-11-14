


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
    MathsOperation obj = (int n1 ,int n2) -> {
            return n1 + n2;
    };

    int sumResult = obj.sum(5,6);
    System.out.println("add result = "+sumResult);
 }   
}
