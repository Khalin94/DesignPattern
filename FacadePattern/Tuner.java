public class Tuner{

	Amplifier amp;
	double frequency;
	
	public Tuner(Amplifier amp){
		this.amp = amp;
	}

	public void on(){
		System.out.println("Tuner On");
	}

	public void off(){
		System.out.println("Tuner Off");
	}

	public void setFrequency(double frequency){
		this.frequency = frequency;
	}

	public void setAm(){
		System.out.println("set Am");
	}

	public void setFm(){
		System.out.println("set Fm");
	}
}
