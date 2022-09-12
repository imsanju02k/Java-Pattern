package patterns;

public class pattern_15 {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 6; j++) {
                if ((i + j == 2) || (i - j == 2) || (j - i == 2) || (i == 3 && j == 3)) {
                    System.out.printf(" * ");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println(" ");
        }
    }
}

