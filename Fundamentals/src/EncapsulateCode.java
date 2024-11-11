
 class Humans {
    // private define the encapsualtion or restricted details which is restricted to same class use only
    //  this instance variable data is accessible to same class only.
    private String name;
    private String contactNumber;
  

    public String getName(){
        return name;
    }
    
    public String getContactNumber(){
        return contactNumber;
    }

    public void setName(String nm){
            name = nm;
    }

    public void setContactNumber(String contact){
        contactNumber = contact;
}

    //  but if used same paramter name as instance variable it will require self object reference which lead to introduce new keyword called this
    public void setNameData(String name){
        this.name = name;
        // this will specify instance variable and name will specify parameter values
    }



    public void setContactNumberData(String contactNumber){
        this.contactNumber = contactNumber;
    }
    
}

public class EncapsulateCode {
        public static void main(String[] args) {
            Humans obj = new Humans();
            obj.setNameData("Darshan Gujrati");
            obj.setContactNumberData("9890559574");

            String name = obj.getName();
            String phone = obj.getContactNumber();
            System.out.println(name + " : "+ phone);

            Humans obj2 = new Humans();
            obj2.setNameData("Vaibhav Gujrati");
            obj2.setContactNumberData("9226867641");

            String name2 = obj2.getName();
            String phone2 = obj2.getContactNumber();
            System.out.println(name2 + " : "+ phone2);

        }
}
