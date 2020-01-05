package ctr;

public class State {

	String status;

	State(String state) {
		status = state;
	}

	public String getStatus() {
		if(status == null) {
			return "Kein Status vorhanden";
		}
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
		
	}

}
