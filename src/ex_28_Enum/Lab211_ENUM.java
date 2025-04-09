package ex_28_Enum;

public class Lab211_ENUM {
    public static void main(String[] args) {
        System.out.println(Locator.page_button.getLocators());
        System.out.println(Locator.page_input.getLocators());

        System.out.println("----------------------------");

        System.out.println(Colors.RED.getHexCode());
        System.out.println(Colors.GREEN.getHexCode());

        System.out.println("----------------------------");

        System.out.println(APIURLS.google.getUrl());
        System.out.println(APIURLS.vwo.getUrl());
        System.out.println(APIURLS.katalon.getUrl());


    }
}
