package chap06;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		//Singleton obj1 = new Singleton(); (X)
		
		if(obj1 == obj2) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
	}

}
