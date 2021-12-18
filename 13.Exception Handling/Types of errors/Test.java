//Write a program to print all prime numbers between 1 to 100
import java.util.Scanner;
class Test {
    	public static void main(String[] args) {
	/******SYNTAX ERROR ******/
	/* int a=0 
		b=8;
	*/
	/******LOGICAL ERROR ******/
	System.out.println(2);
	for(int i=1;i<5;i++){
		System.out.println(2*i+1);
	}
	/******RUNTIME ERROR******/
	int k;
	Scanner sc = new Scanner(System.in);
	k =sc.nextInt();
	System.out.println("Integer part of 1000 divide by k is " + 1000/k);
    }
}
