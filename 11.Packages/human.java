import childs.*;
import accessModifiers.*;
package sample;
class person{
	void say(){
		System.out.println("hello!");
	}
}
class human{
	public static void main(String[] args){
		person p=new person();
		p.say();
		System.out.println(p.x);
                System.out.println(p.y);
		System.out.println(p.z);
                System.out.println(p.a);
	}
}