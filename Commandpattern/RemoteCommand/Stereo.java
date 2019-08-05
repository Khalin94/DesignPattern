public class Stereo{

	String insertLocation;
	int volume = 0;

	public Stereo(String insertLocation){
		this.insertLocation = insertLocation;
	}


	public void on(){
		System.out.println(insertLocation+"Streo On");
	}

	public void off(){
		System.out.println(insertLocation+"Streo Off");
	}

	public void setCd(){
		System.out.println(insertLocation + "Inserted CD");
	}

	public void setRadio(){
		System.out.println(insertLocation + "playing Radio");
	}

	public void setVolume(int volume){
		this.volume = volume;
	}
}
