package codewars;

public class ComplementaryDNA {

    public static String makeComplement(String dna) {

//        In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

        StringBuilder newDNA = new StringBuilder(dna);

       for(int i=0; i<dna.length(); i++){
           if (dna.charAt(i) == 'A'){
               newDNA.setCharAt(i,'T');
           } else if (dna.charAt(i) == 'T'){
               newDNA.setCharAt(i,'A');
           } else if (dna.charAt(i) == 'C'){
               newDNA.setCharAt(i,'G');
           } else if (dna.charAt(i) == 'G'){
               newDNA.setCharAt(i,'C');
           }

       }
       return newDNA.toString();
    }

    //different solutions
//    public static String makeComplement(String dna) {
//        return dna.replace("A","B")
//                .replace("C","D")
//                .replace("T","A")
//                .replace("G","C")
//                .replace("B","T")
//                .replace("D","G");
//    }

    //I didn't know you could stack .replace like that

    public static void main(String[] args) {

        System.out.println(makeComplement("AAAA"));//"TTTT"
        System.out.println(makeComplement("ATTGC"));//"TAACG"
        System.out.println(makeComplement("GTAT"));//"CATA"

    }

}
