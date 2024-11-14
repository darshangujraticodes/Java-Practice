

abstract class Car {


    // method declaration when do not use {} block of code
    public abstract void drive();
    public abstract void carAccelerator();


    // method defining when we write in block {}
    public void playMusic(){
        System.out.println("Play Music While Driving !");
    }
    
}

 class ToyotaCar extends Car{


    // class which extends abstract class must have all abstract methods of parent abstract class which need to be override by child class methods. 
    public void drive(){
        System.out.println("Car Drive");
    }

    public void carAccelerator(){
        System.out.println("Abstract class of ar accerlerator !!");
    }

}

public class AbstractCode {
    

    public static void main(String[] args) {
       Car obj = new ToyotaCar() ;


        obj.drive();

        obj.carAccelerator();

        obj.playMusic();

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


1] before Java version 8 in Abstract class we can only declare abstract methods but cannot define it but after java version 8 abstract methods can also be declare and define in abstract class


 */
/* */