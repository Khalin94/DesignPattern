import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable{
	
	private float temp;
	private float humidity;
	private float pressure;

	public WeatherData(){
	}

	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temp, float humidity, float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemp(){
		return temp;
	}
	public float getHumidity(){
		return humidity;
	}

	public float getPressure(){
		return pressure;
	}
}
