package creational.abstractfactory;

public class PoemPublisher extends Publisher{
	
	public PoemPublisher(String name) {
		this.name = name;
	}

	@Override
	public void getPublishType() {
		System.out.println("This is Poem Publisher");
	}

}
