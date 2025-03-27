import java.util.Scanner;

public class u_triangle {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter any number:");

    int n = scn.nextInt();
    
    //Upright triangle
    for (int i = 1 ; i <= n; i++) {
        for (int j = 1; j <= n-i; j++){
        System.out.print(" ");
        }
        for (int k = 1; k <= (2*i-1); k++){
        System.out.print("*");
        }
        System.out.println();
    }
    scn.close();
}
}
