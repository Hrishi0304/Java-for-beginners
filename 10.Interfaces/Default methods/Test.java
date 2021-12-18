interface Camera{
	void takeSnap();
	void recordVideo();
	//private void greet(){
	//	System.out.println("Good morning");	
	//}
	default void record4kVideo(){
		//greet();
		System.out.println("Recording in 4k....");
	}
}
interface Wifi{
	String[] getNetworks();
	void connectToNetwork(String network);
}
class cellPhone{
	void callNumber(int phoneNumber){
		System.out.println("Calling"+phoneNumber);
	}
	void pickCall(){
		System.out.println("Connecting....");
	}
}
class Smartphone extends cellPhone implements Camera,Wifi{
	public void takeSnap(){
		System.out.println("Taking snap.....");
	}
	public void recordVideo(){
		System.out.println("Taking snap.....");
	}
	//public void record4kVideo(){
	//	System.out.println("Taking snap and recording");
	//}
	public String[] getNetworks(){
		System.out.println("Getting List of Networks");
		String[] networkList={"Searching...","TP-Link","SUN NET"};
		return networkList;
	}
	public void connectToNetwork(String network){
		System.out.println("Connecting to " + network);
	}	
}
public class Test{
	public static void main(String[] args){
		Smartphone ph = new Smartphone();
		String[] ar = ph.getNetworks();
		ph.record4kVideo();
		for(String item:ar){
			System.out.println(item);
		}
	}
}