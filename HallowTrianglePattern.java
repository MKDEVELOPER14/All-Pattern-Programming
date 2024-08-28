import java.util.Scanner;

public class HallowTrianglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();  //getting input from user
        for(int i=1;i<=n;i++){       // outer Loop   1
            for(int j=1;j<=i;j++){     // Inner Loop  1
                if(i==1 || i==n|| j==1 || i==j) {
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
