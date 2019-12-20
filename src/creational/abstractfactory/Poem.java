package creational.abstractfactory;

public class Poem extends Book {
	
	public Poem(String author, String isbn) {
		this.author = author;
		this.isbn = isbn;
	}

	@Override
	public void bookType() {
		System.out.println("This is a Poem");
	}

}
