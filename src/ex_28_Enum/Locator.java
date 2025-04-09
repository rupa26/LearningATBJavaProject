package ex_28_Enum;

public enum Locator {
    page_button("#btn"),
    page_input("#input1");

    private String locators;

    Locator(String locators){
        this.locators = locators;
    }
     String getLocators(){
        return this.locators;
     }

}
