public class ConstructorCode {

    // what is constructor ?
    // 1] It is a special method which initialize an object when it is created 
    // 2] It should be of same name as class but has parameter and curly brace to store block of code
    // 3] constructor does not hve return value.
    // 4] Constructor will get executed every time when the object is created 
    // 5] constructor is like method.
    // 6] Just like we have method overloading in which method with same name can be created but should have different input parameter or same number of parameter value but different data type is called method overloading similar we can have constructor overloading.
    // 7] customized or parametrized constructor


    // instance variable
    String studenName;
    String studentStream;
    int studentMarks;
    

    // below example of default constructor
    public ConstructorCode(){   
        System.out.println("In Constructor !!");

        studenName = "Rahul Malhotra";
        studentStream= "Science";
        studentMarks = 95;

    }

    // below example of parametrized constructor
    public ConstructorCode(String studenName, String studentStream, int studentMarks){
        this.studenName = studenName;
        this.studentStream = studentStream;
        this.studentMarks = studentMarks;

    }
    
public static void main(String[] args) {
    ConstructorCode ccObj = new ConstructorCode();
    ConstructorCode ccObj3 = new ConstructorCode();

    ConstructorCode ccObj2 = new ConstructorCode("Shyam", "Arts", 80);

    System.out.println(ccObj.studenName+" "+ccObj.studentStream+""+ccObj.studentMarks);
    System.out.println();
    System.out.println(ccObj2.studenName+" "+ccObj2.studentStream+""+ccObj2.studentMarks);


    // output constructor will be 2 times becz 2 time object is created !
}


}
