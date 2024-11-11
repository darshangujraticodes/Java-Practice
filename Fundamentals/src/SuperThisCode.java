
class ParentClass{

    // default constructor
    public ParentClass(){
        super();
        System.out.println("Parent Class A");
    }

    // Parametrized constructor
    public ParentClass(int num){
        super();
        System.out.println("Parametrized Parent Class A = "+num);
    }
}

class ChildClass extends ParentClass{
    // default constructor
    public ChildClass(){
        super(5);
        System.out.println("Child Class B");
    }

    // Parametrized constructor
    public ChildClass(int num){
        super();

        System.out.println("Parametrized Child Class B = "+num);
    }
}


public class SuperThisCode {
    public static void main(String[] args) {
        

        ChildClass obj = new ChildClass(5);

      
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


 */