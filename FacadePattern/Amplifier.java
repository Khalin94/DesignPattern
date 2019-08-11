public class Amplifier{

	Tuner tuner;
	DvdPlayer dvdPlayer;
//	CdPlayer cdPlayer;
	String desc;

	public Amplifier(String desc){
		this.desc = desc;
	}

	public void on(){
		System.out.println(desc + " on");
	}

	public void off(){
		System.out.println(desc + " off");
	}

//	public void setCd(CdPlayer cdPlayer){
//		this.cdPlayer = cdPlayer;
//		System.out.println(desc + " : " + cdPlayer);
//	}

	public void setDvd(DvdPlayer dvdPlayer){
		this.dvdPlayer = dvdPlayer;
		System.out.println(desc + " : " + dvdPlayer);
	}

	public void setTuner(Tuner tuner){
		this.tuner = tuner;
		System.out.println(desc + " : " + tuner);
	}
}


	
