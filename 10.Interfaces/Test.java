//difference is in abstract class non-abstract methods also there but in interfaces all methods are abstract  
//variables declared in interface are final  
import java.util.Scanner;
interface Bike{
	void applyBrake();
 	void accelerate();
}
interface Turn{
	void right();
	void left();
}
class KTM implements Bike,Turn{
	int speed=7;
	//Note:methods from interface must be public
	public void applyBrake(){
		System.out.println("Brake applied!");
	}
	public void accelerate(){
		System.out.println("Try to maintain Moderate speed");
	}
	public void right(){
		System.out.println("Taking right");
	}
	public void left(){
		System.out.println("Taking left");
	}
	void horn(){
		System.out.println("Pee Pee......");
	}
}
public class Test{
	public static void main(String[] args){
		KTM k=new KTM();
		int choice;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter\n1-Brake\n2-Accelerate\n");
		System.out.println("Enter\n3-Right\n4-Left\n");
		System.out.println("Enter\n5-Horn\nRandom no-exit\n");
        	choice= scan.nextInt();
		switch(choice){
            		case 1:  k.applyBrake();
            		         break;
            		case 2:  k.accelerate();
            		         break;
            		case 3:  k.right();
            		         break;
            		case 4:  k.left();
            	         	 break;
            		case 5:  k.horn();
                     		 break;
            		default: System.out.println("Exited!");
                                 break;
        	}
	}
}