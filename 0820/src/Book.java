
public class Book {
	public Book() {
		this(true);
		System.out.println("별");
	}

	public Book(boolean b) {
		this(3);
		System.out.println("원");
	}

	public Book(int i) {
		this("Book");
		System.out.println("세모");
	}

	public Book(String name) {
		System.out.println("네모");
	}
	public Book(Book b) {
		this(false);
		System.out.println("다이아");
	}

	public static void main(String[] args) {
		Book book = new Book();
		//System.out.println(book);
		System.out.println("------");
		Book book2 = new Book(book);
		//System.out.println(book2);
	}
}
