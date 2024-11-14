



    enum WebsiteStatus {
        informational,
        successful,
        redirected,
        clientError,
        ServerError,
        
    }



    enum HttpResponse{
        Informational(100),
        Successful(200),
        Redirectional(300),
        Clienterror(400),
        Servererror(500);

    private int code;

    private HttpResponse(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }



        
    }



public class EnumsCode {
 public static void main(String[] args) {
    

    WebsiteStatus ws = WebsiteStatus.successful;

    for (WebsiteStatus myVar : WebsiteStatus.values()) {
        System.out.println(myVar+" : "+myVar.ordinal());
      }


      WebsiteStatus newStatus = WebsiteStatus.clientError;

        if(newStatus == WebsiteStatus.informational)
            System.out.println("All Good");
        else if(newStatus == WebsiteStatus.successful)
            System.out.println("Running Good !");
        else if(newStatus == WebsiteStatus.redirected)
            System.out.println("website is redirected to new !");
        else if(newStatus == WebsiteStatus.clientError)
            System.out.println("website issue on client side !");
        else if(newStatus == WebsiteStatus.ServerError)
            System.out.println("server issue !");
        else
            System.out.println("Error in Code");

        
            switch (ws) {
                case informational:
                        System.out.println("Info");
                    break;
                
                case successful:
                    System.out.println("Success");
                    break;

                case redirected:
                    System.out.println("redirect");
                    break;
            
                default:
                    break;
            }
    
    
            // System.out.println(ws+": "+ ws.ordinal());



            // new enum code

            HttpResponse httpObj = HttpResponse.Successful;

            System.out.println("old status code = "+ httpObj.getCode());

            httpObj.setCode(201);

            System.out.println("new status code = "+httpObj.getCode());

            for (HttpResponse hr : HttpResponse.values()){
                System.out.println(hr + " : "+hr.getCode() );
            }
          
 }   
}
