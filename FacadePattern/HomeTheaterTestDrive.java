public class HomeTheaterTestDrive{
	public static void main(String[] args){
		Amplifier amp = new Amplifier("ampfier");
		Tuner tuner = new Tuner(amp);
		DvdPlayer dvd = new DvdPlayer(amp);
		PopcornPoper poper = new PopcornPoper();

		HomeTheaterFacade facade = new HomeTheaterFacade(amp, tuner, dvd, poper);

		facade.watchMovie("Lion King");
		facade.endMovie();
	}
}
