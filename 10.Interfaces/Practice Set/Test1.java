/*Create a class Monkey with jump() and bite() methods.
Create a class Human which inherits this monkey class implements BasicAnimal interface
with eat() and sleep() methods*/
/*Demonstrate polymorphism using this question*/
interface BasicAnimal{
	void eat();
	void sleep();
}
class Monkey{
	void jump(){
		System.out.println("Jumped 10ms..");
	}
	void bite(){
		System.out.println("Gonna a bite you! BEWARE....");
	}
}
class Human extends Monkey implements BasicAnimal{
	public void speak(){
		System.out.println("Hi!..");
	}
	public void eat(){
		System.out.println("Eats Rice..");
	}
	public void sleep(){
		System.out.println("Sleeping..");
	}
}
public class Test1{
	public static void main(String [] args){
		Human Hrishi=new Human();
		Hrishi.sleep();
		Monkey m = new Human(); 
		m.jump();
		//m..speak//Error
		BasicAnimal a = new Human();
		//a.speak;
		a.eat();
		a.sleep();
	}
}