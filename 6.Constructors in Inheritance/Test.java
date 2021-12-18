class Base{
	Base(){
		System.out.println("Base Construtor invoked!");	
	}
	Base(int x){
		System.out.println("Overloaded Construtor invoked with value of x= " + x);
	}
}
class Derived extends Base{
	Derived(){
		//super(1);
		System.out.println("Derived class constructor invoked!");
	}	
	Derived(int x, int y){
		super(x);
		System.out.println("Overloaded Construtor of derived class invoked with value of y=" + y);
	}
}
class childOfDerived extends Derived{
	childOfDerived(){
		//super(1);
		System.out.println("I am child of Derived constructor");
	}	
	childOfDerived(int x, int y,int z){
		super(x,y);
		System.out.println("I am child of Derived constructor with value z= " +z);
	}
}
class Test{
	public static void main(String[] args){
		//Derived b=new Derived();
		//Derived b=new Derived(5,7);
		//Base b=new Base();
		childOfDerived b=new childOfDerived(5,7,8);
	}
}