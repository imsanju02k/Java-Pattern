package patterns;

/*Question

          *
        *    *
      *        *
    *            *
   *               *

 */

public class pattern_13 {
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            for(int j=0;j<=8;j++){
                if(i+j==4 || j-i==4){
                    System.out.printf("*");
                }
                else {
                    System.out.printf(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
