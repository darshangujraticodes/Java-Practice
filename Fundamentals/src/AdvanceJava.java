

class Circle{
    int num = 45;

    public double area(int r) {
        return 3.14 * r * r;
    }

    public double circumference(int d){
        return 3.14 * d;
    }

    // method overloading example 
    // inspite of having same name it will not show error due to different parameter intake value but it is not recommmend in coding practice it lead to ambiguous code formate and confusion
    public double area(int r, int d){
        return 3.14 * r *r;
    }

    public double area(double r){
        return 3.14 * r * r;
    } 



}


public class AdvanceJava {
    int num1;
    int num2;


    // methods
    public int add(int num1 , int num2){
        System.out.println("Testing");
        return num1 + num2;
    }


    public static void main(String[] args) {

        Circle obj1 = new Circle();
        double area1 = obj1.area(15);
        double area2 = obj1.area(15.5);
        double area3 = obj1.area(20,40);
        double cf = obj1.circumference(25);


        System.out.println(obj1.num);
        System.out.println(area1 + " "+ area2 +" "+ area3 +" "+ cf);

        AdvanceJava obj2 = new AdvanceJava();
        int sum = obj2.add(15, 20);
        

        System.out.println(sum);

        // single array

        int[] num = { 5,8,5,4,8,65,878};

        System.out.println(num.length);

        // for(int i = 0 ; i < num.length ; i++){
        //     System.out.println(num[i]);
        // }


        // loop for array elements

        for(int i : num){
            System.out.println(i);
        }

        String[] studentName = {"Darsh", "rahul", "vinod"};

        // enahnce for loop of array

        for(String i : studentName){
            System.out.println(i);
        }


        // Multi Dimensional Array

        int matrix[][] = new int[4][4];

        // 

        for(int i=0; i < 4; i++){
            for(int j=0 ; j< 4;j++){
                System.out.print(matrix[i][j] = (int)(Math.random() * 10) );
               
            } 
            System.out.println();
        }

        // enahnce for loop of 2 dimensional array

        for (int[] i : matrix){
            for(int j : i){
                    System.out.println(j);
            }
            System.out.println();
        }


        // new table

        System.out.println("-----------------");
        int sqTable[][] = new int[2][4];

        for (int i=0; i < 2; i++){
            for (int j =0; j<4;j++){
                System.out.println( sqTable[i][j] = (int) (Math.random() * 10)    );
            }
            System.out.println();
        }

        for(int[] i : sqTable){
            for(int j : i){
                System.out.print(j);
            }
            System.out.println();
        }


    }
    
    
}


