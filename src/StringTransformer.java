abstract public class StringTransformer {
    // protected string variable
    protected String str;

    //constructor
    public StringTransformer(){}

    public StringTransformer(String str){
        this.str = str;
    }

    //getters and setters


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    //abstract method
    abstract public String transform();

}
