/*Q.Create an abstract class Pen with methods write() and refill() as abstract methods.
Now create fountain pen with additional method changeNib*/
/*abstract methods have the same visibility rules as normal methods, except that they cannot be private .*/
abstract class Pen{
	abstract void write();
	abstract void refill();
}
class FountainPen extends Pen{
	public void changeNib(){
		System.out.println("Setting Nib of 5mm");
	}
	public void write(){
		System.out.println("Writes so smoothly...");
	}
	public void refill(){
		System.out.println("Refilling blue ink..");
	}
}
public class Test{
	public static void main(String [] args){
		FountainPen p= new FountainPen();
		p.changeNib();
		p.refill();
		p.write();
	}
}