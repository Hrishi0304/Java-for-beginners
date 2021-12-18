interface parentInterface{
	void meth1();
	void meth2();
}
interface childInterface extends parentInterface{
	void meth3();
	void meth4();
}
class Sample implements childInterface{
	public void meth1(){
		System.out.println("meth 1");//comment this method and see output
	}
	public void meth2(){
		System.out.println("meth 2");//comment this method and see output
	}
	public void meth3(){
		System.out.println("meth 3");
	}
	public void meth4(){
		System.out.println("meth 4");
	}
}
public class Test{
	public static void main(String[] args){
		Sample s=new Sample();
		s.meth1();
		s.meth2();
                s.meth3();
		s.meth4();
	}
}
//interface extends interface//valid
//class extends interface//invalid