import java.util.Scanner;

public class diamond{
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter any number:");
    int n = scn.nextInt();
    int nsp=n/2;
    int nst=1;
      
    for (int i=1; i<=n; i++){
        for (int j=1; j<=nsp;j++){
            System.out.print(" ");
        }
        
        for (int k=1; k<=nst;k++){
            System.out.print("*");
        }
        System.out.println("");
        
        if(i<=n/2){
            nst+=2;
            nsp-=1;
        } else{
            nst-=2;
            nsp+=1;
        }
      }
      scn.close();
  }
}

