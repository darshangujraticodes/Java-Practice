
interface  Car {


    // interface property are static and final
    String carRTONumber = "MH04174681";

    void carModel();
    void carFeature();
}


 class TataCar implements Car  {

 
    public void carModel() {
       System.out.println("Tata Nexon");
    }

 
    public void carFeature() {
        System.out.println("Electric Car !!");
    }
    
    
}
public class InterfaceCode {
    public static void main(String[] args) {
        Car Obj = new TataCar();
        Obj.carModel();
        Obj.carFeature();


        System.out.println(Car.carRTONumber);

    }
}


/*



interface is the new version of showing abstract class which means instead of showing abstract class we can write interface and inside we can declare abstract methods

all variable inside interface are final and static


final  : denotes as a constant which cannot be change
Static : it mean it is common variable to all class and directly be access by class


as we know in abstract class cannot be declare using objects it will require child class which inherit parent class data and and help to declare objects;

but here in interface instead of "extends" (to inherit parent class property and methods ) here we write "implements" (to inherit interface methods and property)
so TataCar implements Car(Interface Name)



 */