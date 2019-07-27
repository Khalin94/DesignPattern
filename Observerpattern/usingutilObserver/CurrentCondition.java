import java.util.Observer;
import java.util.Observable;

public class CurrentCondition implements Observer, DisplayElements{

	Observable observable;
	private float temp;
	private float humidity;

	public CurrentCondition(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}

	public void update(Observable obs, Object arg){
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData) obs;
			this.temp = weatherData.getTemp();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	public void display(){
		System.out.println("Current Condition : " + temp + "degree " + humidity + "%");
	}
}
