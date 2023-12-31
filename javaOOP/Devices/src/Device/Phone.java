package Device;
public class Phone extends Devices {
	

public void makeCall() {
		battery-=5;
		status();
	}

public void  playGame() {
		battery-=20;
		status();
	}
	
public void charge() {
		battery+=50;
		status();
	
}


	
}