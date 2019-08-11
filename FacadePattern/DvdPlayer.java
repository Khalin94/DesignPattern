public class DvdPlayer{

	Amplifier amp;
	String movie;

	public DvdPlayer(Amplifier amp){
		this.amp = amp;
	}

	public void on(){
		System.out.println("DvdPlayer On");
	}

	public void off(){
		System.out.println("dvdPlayer Off");
	}

	public void eject(){
		System.out.println("dvdplayer Eject");
	}
	
	public void pause(){
		System.out.println("pause");
	}

	public void play(String movie){
		this.movie = movie;
		System.out.println(movie + " play!");
	}

	public void stop(){
		System.out.println("dvdPlayer Stop");
	}
}

