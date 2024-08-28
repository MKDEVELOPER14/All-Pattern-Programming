import java.util.Scanner;

public class HallowSquarePattern {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();  //getting input from user
            for(int i=1;i<=n;i++){       // outer Loop
                for(int j=1;j<=n;j++){     // Inner Loop
                    if(i==1||j==1||i==n||j==n){
                    System.out.print("* ");   // Print the pattern
                    }
                    else{
                        System.out.print("  "); // print space
                    }
                }
                System.out.println();   // NextLine
            }
        }
}
