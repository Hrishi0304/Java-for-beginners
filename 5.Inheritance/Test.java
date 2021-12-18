class Test{
	public static void main(String[] args){
		Derived b=new Derived();
		//Base b=new Base();
		b.setX(7);
		System.out.println(b.getX());
	}
}