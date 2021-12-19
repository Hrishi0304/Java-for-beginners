//import java.util.Scanner;
//https://www.geeksforgeeks.org/java-program-to-use-finally-block-for-catching-exceptions/
class Test {
	static int div(){
		try{
		int a = 10;
		int b = 0;
		int c = a/b;
		return c;
            	}
                catch (Exception e){
               	System.out.println(e);
            	}
		finally{
		System.out.println("clearing sources....End of code");
		}
		return 0;
	}
    	public static void main(String[] args) {
		System.out.println(div());
		int a = 5000;
		int b = 50;
		while(true){
			try{
			System.out.println(a/b);
			}
			catch(Exception e){
			System.out.println(e);
			break;
			}
			finally{
			System.out.println("finally my denominator value is " +b);
			}
			b=b-5;
		}
    	}
}
