import java.util.Scanner;

public class LeftTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();  //getting input from user
        for(int i=1;i<=n;i++){       // outer Loop
            for(int j=1;j<=i;j++){     // Inner Loop
                    System.out.print("* ");   // Print the pattern
            }
            System.out.println();   // NextLine
        }
    }
}
