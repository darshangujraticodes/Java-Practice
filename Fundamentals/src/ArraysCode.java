public class ArraysCode {

    public static void main(String[] args) {
        

        // type 1;
        int studentArray[] = new int[7];

        // type 2 
        String[] studentName = { "Darshan", "Vaibhav", "Rohit", "Shyam", "Mukesh"};

        studentArray[0]= 45;
        studentArray[1]= 63;
        studentArray[2]= 42;
        studentArray[3]= 9;
        studentArray[4]= 4;
        studentArray[5]= 86;
        studentArray[6]= 6;


        int temp = studentArray[0];
        int minValue = studentArray[0];


        for(int i : studentArray){
            if (minValue > i){
                minValue = i;
            }
        }

        System.out.println("minimum value in array = "+minValue);


        for(String i : studentName){
            System.out.println(i);
        }


    }
}
