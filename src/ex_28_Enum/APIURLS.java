package ex_28_Enum;

public enum APIURLS {
     vwo ("https://app.vwo.com"),

    katalon("https://katalon.com"),

    google ("https://google.com");

    private String url;
     APIURLS(String url){
         this.url = url;
     }

     String getUrl(){
         return this.url;
     }





}


