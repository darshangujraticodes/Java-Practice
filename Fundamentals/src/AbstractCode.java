

abstract class Car {

    public abstract void drive();

    public abstract void carAccelerator();


    public void playMusic(){
        System.out.println("Play Music While Driving !");
    }
    
}

 class ToyotaCar extends Car{

    public void drive(){
        System.out.println();
    }

    public void carAccelerator(){

    }

}

public class AbstractCode {
    

    public static void main(String[] args) {
       Car obj = new ToyotaCar() ;
    }

}

/*


Abstract method can only be created inside abstract class 
but abstract class may or may not contain abstract methods

(1 important point) child class which extends parent abstract class must containt all abstract methods otherwie lead to error

you cannot create object of abstract class


it is compulsory to create abstract method require abstract class

abstract can have both abstract and non abstract methods



class in which we use keyowrd abstract are called abstract class and 
class in which we extends abstract class are called concrete class.



 */
