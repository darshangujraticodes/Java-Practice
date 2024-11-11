public class ConstructorCode {

    // what is constructor ?
    // 1] It is a special method which initialize an object when it is created 
    // 2] It should be of same name as class but has parameter and curly brace to store block of code
    // 3] constructor does not hve return value.
    // 4] Constructor will get executed every time when the object is created 
    // 5] constructor is link method.
    // 6] Just like we have method overloading in which method with same name can be created but should have different input parameter or same number of parameter value but different data type is called method overloading similar we can have constructor overloading.
    // 7] customized or parametrized constructor
    
    public ConstructorCode(){   
        System.out.println("In Constructor !!");
    }
    
public static void main(String[] args) {
    ConstructorCode ccObj = new ConstructorCode();

    ConstructorCode ccObj2 = new ConstructorCode();

    // output constructor will be 2 times becz 2 time object is created !
}


}
