import java.util.Scanner;
public class Func{
	public static void main(String[] args){
		System.out.println(sum(2,6));
		System.out.println(sum(3,4,5));
	}
	public static int sum(int a,int b){
		return a+b;
	}
	public static int sum(int a,int b,int c){
		return a+b+c;
	}
}
