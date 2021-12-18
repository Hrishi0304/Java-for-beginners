abstract class Base{
	public Base(){
		System.out.println("This is a base class constructor");
	}
	public void sayHello(){
		System.out.println("Hello sir/ma'am!");
	}
 	abstract public void greet();
}
class Child extends Base{
	public void greet(){
	 	System.out.println("Welcome to the new TOPIC :)");
	}
	public void say(){
	 	System.out.println("Hey Hi!,how are you doing?!!");
	}
}

abstract class Child2 extends Base{
	public void sayhi(){
	 	System.out.println("Welcome:)");
	}
}
public class Test{
	public static void main(String[] args){
		//Base b=new Base();//invalid
		Child c=new Child();//valid
		c.greet();
		c.say();
	}
}