package patterns;

/* Question 1
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1

   Question 2
            5 5 5 5 5
            4 4 4 4
            3 3 3
            2 2
            1

   Question 3
            * * * * *
            * * * *
            * * *
            * *
            *
*/
public class pattern_2 {
    public static void main(String[] args) {
        // logic for above questions
        for(int i=8;i>=1;i--){
            for(int j=1;j<=i;j++){

                /*Question 1*/
               // System.out.print(" "+j);

                /*Question 2*/
                //System.out.print(" "+i);

                /*Question 3*/
                System.out.printf(" * ");


            }
            System.out.println("");
        }
    }

}
