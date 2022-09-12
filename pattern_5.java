package patterns;
/*Question 1 print odd series
 1 2 3 4 5 6 7
 1 2 3 4 5
 1 2 3
 1


 Question 2:

 4 4 4 4 4 4 4
 3 3 3 3 3
 2 2 2
 1

Question 3:
 1 2 3 4 5 6 7 8
 1 2 3 4 5 6
 1 2 3 4
 1 2

 */
public class pattern_5 {
    public static void main(String[] args) {
        //logic for revers odd
        for (int i=4;i>=1;i--){
            // odd loop
            //for(int j=1;j<=2*i-1;j++)

            // even loop
            for (int j=1;j<=2*i;j++){
                // Q1
                System.out.printf(" "+j);

                // Q2 odd loop
                //System.out.printf(" "+i);
            }
            System.out.println(" ");
        }
    }
}
