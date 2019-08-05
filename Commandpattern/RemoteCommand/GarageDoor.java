public class GarageDoor{

	String insertLocation;

	public GarageDoor(String insertLocation){
		this.insertLocation = insertLocation;
	}

	public void up(){
		System.out.println(insertLocation + "GarageDoor On");
	}
	public void down(){
		System.out.println(insertLocation + "GarageDoor Down");
	}	
	public void stop(){
		System.out.println(insertLocation + "GarageDoor stop");
	}
	public void lightOn(){
		System.out.println(insertLocation + "GarageDoor Light On");
	}
	public void lightOff(){
		System.out.println(insertLocation + "GarageDoor Light Off");
	}
}
