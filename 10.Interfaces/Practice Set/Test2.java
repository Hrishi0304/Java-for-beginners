class Library{
	String[] books;
	int no_of_books;
	Library(){
		this.books=new String[100];
		this.no_of_books=0;	
	}
	void addBook(String book){
		this.books[no_of_books]=book;
		no_of_books++;
		System.out.println(book+" has been added ");
	}
	void showAvailableBooks(){
		System.out.println(" Availabale Books are: ");
		for(String item:this.books){
			System.out.println(item);
		}
	}
}
public class Test2{
	public static void main(String[] args){
		Library collegeLibrary= new Library();
		collegeLibrary.addBook("Java -Balaguruswamy");
		
	}
}



/*javac Test2.java*/