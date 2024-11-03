import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");


        // data types 
        // java has 2 data types primitive and non primitive aslo call reference based

        // primitive types

        int channelAge = 3;
        String channelName = "CSTechTube";

        // for bigger integer values
        long channelSubscribers = 1_00_00_000L;

        // for bigger decimal Values
        float channelWatchTime = 5565465.8F;
        
        double shortWatchTime = 20.4;  

        // note char values denoted in single inverted comma
        char letter = 'C'; 
        boolean isMonetize = true;

        System.out.println("");

        System.out.println("Hello Coders welcome to "+channelName+" we have succesfully completed "+channelAge+ ", We are thrilled to share that we have achieved milestone of "+channelSubscribers+" and our channel watchtime is "+channelWatchTime+" and it is monetize is Approved by Google "+isMonetize );

        // reference it is used to store complex objects
         // we need to allocate memory which is created using keyword 'new'
         System.out.println("");
        Date currentData = new Date();

        // short command to sout (tab)
       System.out.println(currentData);
       System.out.println("");


    }
}
