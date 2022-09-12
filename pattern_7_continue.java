package patterns;
/*Question
   1
  21
 321
4321
*/
public class pattern_7_continue {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int k=1;k<=4-i;k++){
                System.out.printf(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
