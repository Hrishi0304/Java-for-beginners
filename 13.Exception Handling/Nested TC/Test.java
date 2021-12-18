import java.util.Scanner;
class Test {
    	public static void main(String[] args) {
	int [] marks = new int[3];
	marks[0] = 36;
	marks[1] = 52;
	marks[2] = 90;
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	while(flag){
	System.out.print("Enter Array index:");
	int i = sc.nextInt();
	try{
		System.out.println("Welcome");
		try{
			System.out.println(marks[i]);
		}
		catch(Exception e){
			flag=false;
			System.out.println(e);
		}
	}
	catch(Exception e){
		flag=false;
		System.out.println(e);
	}
	}
    }
}
