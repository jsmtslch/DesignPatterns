package creational.prototype;

public class Client {
	public static void main(String[] args) {
		Accord a1 = new Accord(2, "blue", 190);
		Accord a2 = (Accord) a1.clone();
		System.out.println("A2 Color:"+a2.color);
		Civic c1 = new Civic(4, "black", 150);
		Civic c2 = (Civic) c1.clone();
		System.out.println("C2 hp:"+c2.hp);
		
		
		//Using Registry of car
		CarRegistry cr = new CarRegistry();
		Accord ac = (Accord) cr.getNewCar("Accord Coupe");
		System.out.println("Accord Coupe HP: "+ac.hp);
	}
}
