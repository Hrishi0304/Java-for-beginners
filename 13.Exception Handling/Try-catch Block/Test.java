/*
    Two types of exception
A.Checked Exception(Compile time)
B.Unchecked Exception(Run time)

Commonly occuring exeptions
1.Null Pointer Exception
2.Arithmetic Exception
3.ArrayIndexOutofBound Exception
4.IllegalArgument Exception
5.NumberFormat Exception
*/
class Test {
    	public static void main(String[] args) {
	int a = 6000;
	int b = 0;
	try{
	   int c =a/b;
	   System.out.println("The result is " +c);
	}
	catch(Exception e){
	System.out.println("Failed to divide by zero.Reason:");
	System.out.println(e);
	}
    }
}
