package csc201;
import java.util.Scanner;
public class A5complexnumber {
	public static void main(String[] args) {
		double a1, b1, a2, b2;
		System.out.print("Please enter the real part ");
		System.out.println("of the first complex number");	
		Scanner keyboard = new Scanner(System.in);
		a1=keyboard.nextDouble();
		System.out.print("Please enter the imaginary part ");
		System.out.println("of the first number");
		b1=keyboard.nextDouble();
		System.out.print("Please enter the real part ");
		System.out.println("of the second number");
		a2=keyboard.nextDouble();
		System.out.print("Please enter the imaginary part ");
		System.out.println("of the second number");
		b2=keyboard.nextDouble();		
		System.out.print("The addition of these two number is");
		System.out.println(a1+a2+""+b1+b2+"i");
		System.out.print("The subtraction of these two number is");
		System.out.println((a1-a2)+""+(b1-b2)+"i");
		System.out.print("The multiplication of them is ");
		System.out.println((a1*a2-b1*b2)+""+(a1*b2+a2*b1)+"i");
		System.out.print("The division of them is ");
		System.out.print((a1*a2)+(b1*b2)/(a2*a2+b2*b2)+"");
		System.out.println((b1*a2-a1*b2)/(a2*a2+b2*b2)+"i");	
	}
}

