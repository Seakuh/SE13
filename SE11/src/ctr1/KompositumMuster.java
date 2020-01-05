package ctr1;

import java.util.ArrayList;

public class KompositumMuster {

	public interface Component {
		public void operatrion();
	}

	public class Leaf implements Component {

		@Override
		public void operatrion() {
			// TODO Auto-generated method stub
			
		}

	}

	public class Composite implements Component {
		
		ArrayList<Component> liste = new ArrayList<Component>();

		@Override
		public void operatrion() {
			// TODO Auto-generated method stub
			
		}
		
		public void add(Component a) {
			liste.add(a);
			
		}
		
		public void remove(Component a) {
			liste.remove(a);		
		}
		
		public Component getPart(int a){
				return 	liste.get(a);	
		}

	}
	
	

}
