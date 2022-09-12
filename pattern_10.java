package patterns;

public class pattern_10 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int k=1;k<=4-i;k++){
                System.out.println(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");

            }

             if(i==2){
                for(int j=2;j<=i;j++){
                    System.out.print(j+" ");
                }
                 System.out.println(" ");

            }
        }
    }
}
