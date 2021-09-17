import java.util.Locale;

public class UpperCaseStringTransformer extends StringTransformer{

    //constructor
    public UpperCaseStringTransformer(String str){
        super(str);
    }

    @Override
    public String transform() {
        return str.toUpperCase(Locale.ROOT);
    }


}
