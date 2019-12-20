package creational.abstractfactory;

public interface BookFactory {
	Book makeBook(String author, String isbn);
	Publisher engagePublisher(String publisher);
}
