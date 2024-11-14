

interface Car {

    public void carFeature();
    
} 

// class LuxuryCar implements Car{
//     public void carFeature(){
//         System.out.println("\nPremium Look, Unparalleled Artistry, Well-Crafted Interiors, Top-notch performance.\n ");
//     }
// }


public class FunctionalInterface {
    public static void main(String[] args) {
        

        // normal Way of executing Functional Interface 
        // Car obj = new LuxuryCar();
        // obj.carFeature();


        // new method of executing interface 
        // suppose if luxury doesn't exist then u can't implement interface in any class and u can't create object of interface like abstract so it should be instantiate using new way. 
        // in this new way you can directly declare new methos while declareing objects
        Car obj2 = new Car() {
            
            // Interface code block
            //  define interface methods
            public void carFeature(){
                System.out.println("\nPremium, Performance & Pride  \n");
            }

        };

        obj2.carFeature();

        // but here above there is too much boiler plate code which need to be removed 

        // so to remove this verbose java 8 introduce lambda function (arrow functions in js term)



    }
}


/*
 

Functional interface are the interface which has only one methods in it also called (SAM) Single Abstract Methods




  
 */
