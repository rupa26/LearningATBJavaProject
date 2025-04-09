package ex_28_Enum;

public enum Colors {

    RED("#FF0000"),
    GREEN("#61FF3"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexCode;
    Colors(String hexCode){
        this.hexCode =hexCode;
    }

    String getHexCode(){
        return this.hexCode;
    }

}
