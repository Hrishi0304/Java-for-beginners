import java.util.Scanner;
class Test {
    	public static void main(String[] args) {
	int [] ar = new int [3];
	ar[0] = 7;
	ar[1] = 14;
	ar[2] = 15;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array index");
	int i = sc.nextInt();
	System.out.println("Enter the number you want to divide the value with");
	int num = sc.nextInt();
	try{
		System.out.println("Value of array index is:" +ar[i]);
		System.out.println("Result:"+ ar[i]/num );
	}
	catch(ArithmeticException e){
		System.out.println("ArithmeticException ocuured!");
	        System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("ArrayIndexOutOfBoundsException ocuured!");
	        System.out.println(e);
	}
	catch(Exception e){
		System.out.println("Some exception ocuured!");
	        System.out.println(e);
	}
    }
}
