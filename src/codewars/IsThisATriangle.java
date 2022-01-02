package codewars;

public class IsThisATriangle {

    public static boolean isTriangle(int a, int b, int c){

        if( a + b > c){

            if( a + c > b){

                if( c + b > a){

                    return true;

                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(1, 2, 2));//true
        System.out.println(isTriangle(7, 2, 2));//false
    }

}
