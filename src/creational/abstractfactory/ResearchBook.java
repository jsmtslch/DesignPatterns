package creational.abstractfactory;

public class ResearchBook extends Book{
	
	public ResearchBook(String author, String isbn) {
		this.author = author;
		this.isbn = isbn;
	}

	@Override
	public void bookType() {
		System.out.println("This is a Research Journal");
	}

}
