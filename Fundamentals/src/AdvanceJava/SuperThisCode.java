
package AdvanceJava;


class ParentClass extends Object{

     // method

    public void userData(String name, String ip, String location){
        String userName = name;
        String userIpAddress = ip;
        String userLocation = location;

        // note : here ther are only 3 parameter and display 
        System.out.println(userName+" : "+userIpAddress+" : "+userLocation);
    }


    // default constructor
    public ParentClass(){
        super();
        System.out.println("Parent Class A");
    }


    // Parametrized constructor
    public ParentClass(int num){

        // have you notice to whom this super is calling it does not have any parent classs
        // so it is calling invisible Object which is predeclare in parent Class which inherit Object property.
        // Object Class is extends Parentclass but it is not visible.
        // Every Class in Java extends Object Class.
        // this super is calling Object class constructor 
        super();
        System.out.println("Parametrized Parent Class A = "+num);
    }
}


class ChildClass extends ParentClass{



    public void userData(String name, String ip, String location){
        String userName = name;
        String userIpAddress = ip;
        String userLocation = location;
        String userDevice = "Nokia 1105";
        System.out.println(userName+" : "+userIpAddress+" : "+userLocation+" : "+userDevice);
    }



    // default constructor
    public ChildClass(){

        // note this super class is calling parent A constructor
        super();
        System.out.println("Child Class B");
    }

    // Parametrized constructor
    public ChildClass(int num){


        // 

        // super();

        // note : Both super() and this cannot be call in same constructor only one at a time
        // this() will help you to call the same class other constructor 

        // so here this() will call class default constructor -> super() which will call -> parent class default constructor
        // output : Parent Class A -> Child Class B ->  Parametrized Child Class B

        this();
        System.out.println("Parametrized Child Class B = "+num);
    }
}


public class SuperThisCode {
    public static void main(String[] args) {
        
        // ChildClass obj1 = new ChildClass();
        ChildClass obj2 = new ChildClass(5);

        obj2.userData("Vaibhav", "192.168.854.665", "Mumbai");

    }
}

/*


what is super and what is the use of it ?
it is predefine method in Java , which is used to execute or call the constructor of parent class.



Output 

case 1
Parent Class A
Child Class B


case 2
Parametrized Parent Class A
Child Class B


case 2
Parametrized Parent Class A
Child Class B

case 3
Parametrized Parent Class A
Parametrized Parent Class B

case 4
Parent Class A
Parametrized Parent Class B



scenario 2

you want to execute both the constructor of same class with one object only



// method overrding is done in inheritance by 

1] In this we override the method code of parent class with our extra function and override the parent methods data to get our desired result 
2] example above userData() parent class method is override by adding new content of userDevice in child class due to which it call override parent class data




 */