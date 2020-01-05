package ctr3;

public class TestSingletonPattern {

	public static void main(String[] args) {

		Singleton unique = Singleton.getInstance();
		
		System.out.println(unique.getName());
		
		//unique.setName("neuerNameTest");
		
		Singleton unique1 = Singleton.getInstance();
		
		System.out.println(unique1.getName());

	}

}
