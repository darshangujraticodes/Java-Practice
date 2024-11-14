import java.util.Scanner;

public class ExceptionCode {

    public static void main(String[] args) {
     

        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter your First Value  =");
        int num1 = obj.nextInt();

        System.out.println("Enter your Second Value  =");
        int num2 = obj.nextInt();

        int result = 0;
        try {
            result = num1 / num2;

        } catch (Exception e) {
            // TODO: handle exception
        
            System.out.println("Invalid Input from user Exception = "+e);
        }
        // finally{
        //     System.out.println("Code execution is completed !");
        // }


        System.out.println(result);

        
    }
    

}

