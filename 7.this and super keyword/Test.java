class Sample{
	int a;
	public int getA(){
		return a;
	}
	Sample(int n){
		a=n;
	}
	public int returnone(){
	return 1;
	}
}
class Test{
	public static void main(String[] args){
		Sample obj=new Sample(45);
		System.out.println(obj.getA());
	}
}