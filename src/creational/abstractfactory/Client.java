package creational.abstractfactory;

public class Client {
	public static void main(String[] args) {
		new PoemBookFactory("PoemAuthor", "123QWE123ASD", "PoemPubisher");
		new ResearchBookFactory("ResearchAuthor", "QWE123QWE123", "ResearchPublisher");
	}
}
