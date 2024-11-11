
class Calculator{
 
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int subtract(int n1, int n2){
        return n1 - n2;
    }
    

}

// in Java Multiple inheritance is not allowed (interview question)
// but single and multi-level inheritance is Allowed


class AdvanceCalc extends Calculator{


    public int multiply(int n1, int n2){
        return n1 * n2;
    }

    public int division(int n1, int n2){
        return n1 / n2;
    }

    public int remainder(int n1, int n2){
        return n1 % n2;
    }

}


public class InheritanceCode {

    public static void main(String[] args) {
        
        AdvanceCalc obj = new AdvanceCalc();

        int addResult = obj.add(15, 5);
        int subtractResult =  obj.subtract(15, 5);
        int multiplyResult = obj.multiply(15, 5);
        int divisionResult = obj.division(15, 5);
        int remainderResult = obj.remainder(15, 5);

        System.out.println(addResult+" "+subtractResult+" "+multiplyResult+" "+divisionResult+" "+remainderResult);


    }

    
}
