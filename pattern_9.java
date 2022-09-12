package patterns;
/*Question 1
   1
  123
 12345
1234567

Question 2 same but in reverse

1234567
 12345
  123
   1

*/

public class pattern_9 {
    public static void main(String[] args) {
        //Q1 loop of i
        //for(int i=1;i<=4;i++)
        //Q2 loop of i
        for(int i=4;i>=1;i--){
            for(int k=1;k<=4-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

}
