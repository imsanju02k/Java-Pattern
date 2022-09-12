package patterns;
/*Question 1 print alphabets in series
 a
 a b
 a b c
 a b c d
 a b c d e

Question 2

 a
 b b
 c c c
 d d d d
 e e e e e


* */
public class pattern_6 {
    public static void main(String[] args) {

        for(int i=0;i<=5;i++){
            for(int j=1;j<=i;j++){
                // Q1
                //System.out.print(" "+(char)(96+j));

                // Q2
                System.out.print(" "+(char)(96+i));
            }
            System.out.println(" ");
        }
    }
}
