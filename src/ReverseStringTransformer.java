public class ReverseStringTransformer extends  StringTransformer{

    public ReverseStringTransformer(String str){
        super(str);
    }

    @Override
    public String transform() {
        String string=str;
        String reverse = new StringBuilder(string).reverse().toString();
        return reverse;
    }
}
