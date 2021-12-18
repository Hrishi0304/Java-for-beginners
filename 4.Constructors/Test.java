class mymainEmployee{
	public int id;
	public String name;
	public mymainEmployee(String myName){
		id=45;
		name=myName;
	}
	public mymainEmployee(){
		id=32;
		name="Coder";
	}
}
public class Test{
	public static void main(String[] args){
		mymainEmployee Hrishi=new mymainEmployee();//object with default constructor
		System.out.println(Hrishi.id);
		System.out.println(Hrishi.name+"\n");
		String myName="RickyCodes";
		mymainEmployee Ricky=new mymainEmployee(myName);//object with parameterised constructor
		System.out.println(Ricky.id);
		System.out.println(Ricky.name);
		
	}
}