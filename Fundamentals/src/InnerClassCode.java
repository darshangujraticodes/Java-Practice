
// main class


class GameZone{

    String gameName = "Mario";
    String gamePlayer = "Darshan";
    String gameType = "Console Gaming";

    public void gameData( String gameName, String gamePlayer ){
        System.out.println("Outer Class Method output = "+gamePlayer+" : "+gameName);
    }

    // inner class
    class GameSubtypes{
        // String gamePlayer = "Vaibav";
        // String gameName = "God Of War";
        // int gameScore = 45545;
        // String gameType = "PS4";

        public void outerClassGameDetails(){
            System.out.println("Inner class inherit outer class property values = "+gamePlayer+" : "+gameName+" "+gameType);
        }


        public void gameDetails(String gameName, String gamePlayer){
            System.out.println("Inner Class Method Output = "+gamePlayer+" : "+gameName);
        }


    }

    

}

public class InnerClassCode {

    public static void main(String[] args) {
        
        GameZone outerGameObj = new GameZone();
        System.out.println(outerGameObj.gamePlayer+" : "+outerGameObj.gameName);

        outerGameObj.gameData("Snow Brothers", "Hemant");

        GameZone.GameSubtypes innerGameObj = outerGameObj.new GameSubtypes();
        // System.out.println(innerGameObj.gamePlayer+" : "+innerGameObj.gameName);


        innerGameObj.outerClassGameDetails();
      innerGameObj.gameDetails("NFS (Need For Speed)", "Rohan");
    }
    
}
