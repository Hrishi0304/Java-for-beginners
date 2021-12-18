import java.util.Scanner;
public class Func{
	public static void main(String[] args){
		System.out.println("Enter your name and age:");
		System.out.println("Your name is "+getName()+" and you're "+getAge()+" years old ");
	}
	public static String getName(){
		Scanner input=new Scanner(System.in);
		String name=input.nextLine();
		return name;
	}
	public static int getAge(){
		int age;
		Scanner input=new Scanner(System.in);
		age=input.nextInt();
		return age;
	}
}
