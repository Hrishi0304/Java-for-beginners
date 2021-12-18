class mymainEmployee{
	private int id;
	private String name;
	public mymainEmployee(){
		id=24;
		name="Hrishikesh";
	}
	public mymainEmployee(String myName){
		id=30;
		name=myName;
	}
	public mymainEmployee(String Name,int myId){
		id=myId;
		name=Name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setId(int num){
		id=num;
	}
	public int getId(){
		return id;
	}
}
public class Test{
	public static void main(String[] args){
		mymainEmployee Ricky=new mymainEmployee();
		System.out.println(Ricky.getId());
		System.out.println(Ricky.getName());

		String myName="Actor";
		mymainEmployee Nani=new mymainEmployee(myName);
		System.out.println(Nani.getId());
		System.out.println(Nani.getName());

		int myId=45;
		String Name="Hitman";
		mymainEmployee Rohit=new mymainEmployee(Name,myId);
		System.out.println(Rohit.getId());
		System.out.println(Rohit.getName());
	}
}