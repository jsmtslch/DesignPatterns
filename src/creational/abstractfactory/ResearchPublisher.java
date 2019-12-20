package creational.abstractfactory;

public class ResearchPublisher extends Publisher{
	
	public ResearchPublisher(String name) {
		this.name = name;
	}

	@Override
	public void getPublishType() {
		System.out.println("This is Research Publisher");
	}

}
