import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int a;
        int b;
        int c;
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        System.out.println("Enter third number: ");
        c = sc.nextInt();
        sc.close();
        
         
        if (a>b && a>c){
            System.out.println("Greatest number among three is= "+ a);
        } else if (b>a && b>c){
            System.out.println("Greatest number among three is= "+ b);
        } else if (c>a && c>b) {
            System.out.println("Greatest number among three is= "+ c);
        }
	}
}