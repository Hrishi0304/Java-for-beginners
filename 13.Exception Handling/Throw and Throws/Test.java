class NegativeRadiusException extends Exception{
	public String toString(){
		return "Radius cannot be negative";
	}
	public String getMessage(){
		return "Radius cannot be negative";
	}
}
class Test {
	static double area(int r) throws NegativeRadiusException{
		if(r<0){
			throw new NegativeRadiusException();
		}
		double a = Math.PI*r*r;
		return a;
	}
	static int divide(int a,int b) throws ArithmeticException{
		int c = a/b;
		return c;
	}
    	public static void main(String[] args) {
        	try{
			//int r = divide(7,0);
			//System.out.println(r);
			double ar = area(-7);
			System.out.println(ar);
		}
		catch(Exception e){
			System.out.println(e);
		};
	}
}
