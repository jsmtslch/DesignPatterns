package creational.abstractfactory;

public class PoemBookFactory implements BookFactory {
	
	public PoemBookFactory(String author, String isbn, String publisher) {
		makeBook(author, isbn);
		engagePublisher(publisher);
		System.out.println("Made Book by author "+author+" with ISBN: "+isbn+" from Publisher:"+publisher);
	}

	@Override
	public Book makeBook(String author, String isbn) {
		return new Poem(author, isbn);
	}

	@Override
	public Publisher engagePublisher(String publisher) {
		return new PoemPublisher(publisher);
	}

}
