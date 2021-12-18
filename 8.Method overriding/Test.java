class Base{
	public int a;
	public int meth1(){return 6;}
 	//public void meth2(){System.out.println("Method from Base class");}
}
class Derived extends Base{
	public void meth2(){System.out.println("Method from Derived class");}
	//public void meth3(){System.out.println("Method 3 from derived class");}
}
class Derived1 extends Base{
	public void meth2(){System.out.println("Method from Derived class");}
	//public void meth3(){System.out.println("Method 3 from derived class");}
}
public class Test{
	public static void main(String[] args){
		Base obj1=new Base();
		obj1.meth1();
		Derived obj2=new Derived();
		obj2.meth2();
		Derived1 obj3=new Derived1();
		obj3.meth2();
	}
}
/*oveloading means method having same names in same class
over riding means method having same names in different class*/
/*Also note that in overloading parameters must be different and viceversa must be same 
in overriding according to definition*/ 
/*Method Overriding:If the child class implements the some method present 
in the parent class again,it is
known as overriding or we can can say "REDEFINING THE METHOD OF SUPER CLASS with exactly same arguments with same return type" */
/*Note:
1.You can't override static methods.
2.*/