public class HomeTheaterFacade{
	
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	PopcornPoper poper;

	public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, PopcornPoper poper){
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.poper = poper;
	}

	public void watchMovie(String movie){
		System.out.println("Ready!");
		poper.on();
		poper.pop();
		amp.on();
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie(){
		System.out.println("End!");
		poper.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
}
