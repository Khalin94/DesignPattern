public class Light{

	String insertLocation;

	public Light(String insertLocation){
		this.insertLocation = insertLocation;
	}

	public void on(){
		System.out.println(insertLocation + "Light On");
	}

	public void off(){
		System.out.println(insertLocation  + "Light Off");
	}
}
