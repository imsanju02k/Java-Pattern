package patterns;

/*questions:
        1. number pattern :
                1
                1 2
                1 2 3
                1 2 3 4

        2. star patter : n=5
                *
                *  *
                *  *  *
                *  *  *  *
                *  *  *  *  *

         3. identical number patter :
                1
                2 2
                3 3 3
                4 4 4 4

 */

public class pattern_1 {
    public static void main(String[] args) {
        //Logic
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                /* Question 1 */
                //System.out.print(" "+j);

                /*Question 2 */
                System.out.print(" * ");

                /* Question 3 */
                //System.out.print(" "+i);
            }
            System.out.println("");
        }
    }
}
