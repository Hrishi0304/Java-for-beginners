package calculator;
class calc{
	public void calculate(int a,int b){
		System.out.println("Result: "+ a+b);
	}
}
class Sccalc{
	public void calculate(int a,int b){
		System.out.println("Result: "+ Math.sin(a+b));
	}
}
class Hycalc{
	public void calculate(int a,int b){
		System.out.println("Result: "+ Math.sin(a+b));
		System.out.println("Result: "+ a+b);
	}
}
class q1{
	public static void main(String [] args){
		System.out.println("I am main method");
	}
}