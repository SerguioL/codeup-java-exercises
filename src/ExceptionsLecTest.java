public class ExceptionsLecTest {
    public static void main(String[] args) throws IllegalAccessException {

//        ExceptionsLec el = new ExceptionsLec();

//        try {
//            ExceptionsLec el = new ExceptionsLec();
//            System.out.println(Integer.parseInt(el.certainlyNotAnInteger));
//        } catch (NumberFormatException nfx) {
////            System.out.println("got an exception: " + nfx);
////            System.out.println(nfx.getMessage());
//            nfx.printStackTrace();
//        }

        //    Investigate the substring method for String objects in the Java API. Find out what kind of exception it throws. Create a test class with a main method. Set up a try-catch block that defines a string and finds its length. Once you have the length of your string, modify your program so it creates a substring from your original string, but give it an index that doesn't exist so you get the error message.

//        try{
//            String testString = "This is a string";
//            System.out.println(testString.length());
//            System.out.println(testString.substring(17));
//        } catch (IndexOutOfBoundsException ioobe){
//            System.out.println("Whoa dude, out of bounds");
//        }

//        el.askForAnInteger();

//        el.aMoreComplexAskForInteger();

//        el.subListMaker("hello world");
//    }

//        try {
//            el.echoWord();
//        } catch (IllegalArgumentException iax) {
//            System.out.println("how rude");
//        }

//        try {
//            el.echoWord();
//        } catch (CusswordException cx){
//            System.out.println(cx.getMessage());
//        }

//        Lizard lizard = new Lizard("Lizard");
//        System.out.println(lizard.name);

        Lizard lizard = new Lizard(null);

    }
}
