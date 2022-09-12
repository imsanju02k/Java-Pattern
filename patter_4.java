package patterns;
/*Question 1 print only even numbers of star or digits
 1 2
 1 2 3 4
 1 2 3 4 5 6
 1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9 10

Question 2
 1 1
 2 2 2 2
 3 3 3 3 3 3
 4 4 4 4 4 4 4 4

Question 3

 *  *
 *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  *  *  *  *

*/
public class patter_4 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            // logic for even j<=2*i
            for(int j=1;j<=2*i;j++){
                // Q1
                //System.out.printf(" "+j);

                // Q2
                //System.out.printf(" "+i);

                // Q3
                System.out.printf(" * ");
            }
            System.out.println(" ");
        }
    }

}
