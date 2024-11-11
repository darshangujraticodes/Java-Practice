

 class Mobile{
    String companyName ;
    String model ;
    static String phoneType;

    public void show(){

        // phone type can be directly declare in non static methods but static methods doest not instance variable
        System.out.println("Mobile class Non Static Methods");
        System.out.println(companyName + " : "+ model + " : "+ phoneType);
    }

    public static void showMore(Mobile obj){
        System.out.println("\nMobile class Static Methods");

        System.out.println(obj.companyName + " : "+ obj.model + " : "+ phoneType);

    }

}


public class StaticProperty {


    public static void main(String[] args) {
        
        Mobile Obj = new Mobile();
        Obj.companyName = "Apple";
        Obj.model = "iPhone16";

        // now here comes static variable it is not allowed in industry format as it is static means accessbile to all should not decalare to object rather direct declare with class name
        Mobile.phoneType = "SmartPhone";
            
        Obj.show();

        // this is syntax is allowed would not lead to error but as it is static so it should be directly access by class
        // Obj.showMore(Obj);
        Mobile.showMore(Obj);

    }

}
