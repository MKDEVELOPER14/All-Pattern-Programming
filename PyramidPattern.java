import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();  //getting input from user
        for(int i=1;i<=n;i++){       // outer Loop
            for(int j=1;j<=n*2-1;j++){     // Inner Loop
                if(j>=n-(i-1) && j<=n+(i-1)) {
                    System.out.print("* ");   // Print the pattern
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();   // NextLine
        }
    }
}
