package creational.abstractfactory;

public class ResearchBookFactory implements BookFactory {
	
	public ResearchBookFactory(String author, String isbn, String publisher) {
		makeBook(author, isbn);
		engagePublisher(publisher);
		System.out.println("Made Book by author "+author+" with ISBN: "+isbn+" from Publisher:"+publisher);
	}

	@Override
	public Book makeBook(String author, String isbn) {
		return new ResearchBook(author, isbn);
	}

	@Override
	public Publisher engagePublisher(String publisher) {
		return new ResearchPublisher(publisher);
	}

}
