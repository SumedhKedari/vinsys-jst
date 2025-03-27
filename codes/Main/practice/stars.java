import java.util.Scanner;
public static void main(String [] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter any number:");

    int n = scn.nextInt();
    
    
    //Incrementing stars
    for (int i = 1 ; i <= n ; i++) {
        for (int j = 1; j <= i; j++){
        System.out.print("*");
        }
        System.out.println("");
    }
    
    //Decrementing stars
    for(int i = n; i >= 1; i--){
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println("");
    } 

}