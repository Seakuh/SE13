package ctr2;

public class TestSingletonPattern {

	public static void main(String[] args) {

		Singleton unique = Singleton.getInstance().get(0);
		
		System.out.println(unique.getName());
		
		//unique.setName("neuerNameTest");
		
		//Singleton unique1 = Singleton.getInstance().get(2);
	

	}

}
