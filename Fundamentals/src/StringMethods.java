public class StringMethods {

    public static void main(String[] args) {
        String userName = "Hardik Pandya";
        String extraText = " With Jersy Number 15";
        String compareText = "Harik Pandya";


        // userName.compareTo(compareText) return 0 on equality or -5 on non equal
        System.out.println(userName.charAt(5)+" : "+userName.concat(extraText)+" : "+userName.compareTo(compareText)+" : "+userName.contains("andya")+" : "+userName.length()+" : "+userName.replace("Hardik", "Kung Fu")+": "+userName.toUpperCase().trim());


        String name = "darshan";
        String reverseStringVal = "";

        for(int i=name.length() -1; i>=0; i--){
            System.out.println(name.charAt(i));
            reverseStringVal = reverseStringVal+ name.charAt(i);
        }

        System.out.println("reverse = "+reverseStringVal);

        // Maths Methods 


        double marks = -4545.44;

        double score = 7895.565;

    // Math.abs() => converte negation value to positive
    // 
    System.out.println(Math.abs(marks)+" : "+Math.ceil(score)+" : "+Math.floor(score)+" : "+Math.max(555, 4755));
    }
    
}
