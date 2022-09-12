package patterns;
/* Question 1
 1
 1 2 3
 1 2 3 4 5
 1 2 3 4 5 6 7

 Question 2
 1
 2 2 2
 3 3 3 3 3
 4 4 4 4 4 4 4

 Question print odd number of time "*"


 */
public class pattern_3 {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            //logic for odd j<=2*i
            for(int j=1;j<=2*i-1;j++){
                // Question 1
                //System.out.printf(" "+j);

                // Question 2
                //System.out.printf(" "+i);

                // Question 3
                System.out.printf(" * ");
            }
            System.out.println(" ");
        }
    }
}
