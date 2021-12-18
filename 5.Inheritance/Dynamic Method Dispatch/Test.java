class Phone{
    public void showTime(){
        System.out.println("Time is 7:30pm IST");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    @Override
    public void on(){
        System.out.println("Subclass method is executed\n Turning on SmartPhone...");
    }
}
public class Test{
    public static void main(String[] args){
        Phone obj  = new SmartPhone(); // Yes it is allowed//statement like obj SmartPhone is a Phone
	//Phone obj=new Phone();//Allowed
	//SmartPhone obj=new SmartPhone();//Allowed//you can't say obj Phone is a a smartphones
        // SmartPhone obj2 = new Phone(); // Not allowed
        obj.showTime();
        obj.on();
        // obj.music(); Not Allowed
    }
}
//if you create objects like this you can access only super class methods
//note:Superclass reference subclass k object k barabar ho sakta lekin vice versa nhi
//Animal ob=new dog()
//Super ob=new Sub();
