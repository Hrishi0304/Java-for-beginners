class Point{
	int x,y;
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class Circle{
	Point center;
	double radius;
	static int numberOfcircles;
	Circle(Point center,double radius){
		numberOfcircles++;
		this.center=center;
		this.radius=radius;
	}
	double getPerimeter(){
		return 2*Math.PI*this.radius;
	}
	double getArea(){
		return Math.PI*this.radius*this.radius;
	}
	static int getNumberOfCircles(){
		return numberOfcircles;
	}
}

class Test{
	public static void main(String[] args){
		Circle c1=new Circle(new Point(1,2),3);
		System.out.println("Area of 1st circle is " + c1.getArea());
		System.out.println("Perimeter of 1st circle is " + c1.getPerimeter());

		Circle c2=new Circle(new Point(4,5),6);
		System.out.println("Area of 2nd circle is " + c2.getArea());
		System.out.println("Perimeter of 2nd circle is " + c2.getPerimeter());
		System.out.println("No.of circles calculated: "+Circle.numberOfcircles);
	}
}