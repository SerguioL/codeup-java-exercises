public class StringTransformerTest {

    public static void main(String[] args) {
        //instances of both subclasses of the parent type with test strings
        StringTransformer string1 = new UpperCaseStringTransformer("hello");
        StringTransformer string2 = new ReverseStringTransformer("hello");
        StringTransformer[] string = {string1,string2};
        for (StringTransformer st : string){
            System.out.println(st.transform());
        }

    }

}
