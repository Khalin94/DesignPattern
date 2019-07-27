import java.util.ArrayList;

public class WeatherStation{
	public static void main(String[] args){
		WeatherData weatherData = new WeatherData();

		CurrentConditionDisplay display = new CurrentConditionDisplay(weatherData);
		HeatIndex heatIndex = new HeatIndex(weatherData);
		StatisticsDisplay statistic = new StatisticsDisplay(weatherData);
		ForecastDisplay forecast = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);

	}
}

class WeatherData implements Subject{
	private ArrayList observers;
	private float temp;
	private float humidity;
	private float pressure;

	public WeatherData(){
		observers = new ArrayList();
	}

	public void registerObserver(Observer o){
		observers.add(o);
	}

	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
	}

	public void notifyObserver(){
		for(int i=0; i < observers.size(); i++){
			Observer observer = (Observer) observers.get(i);
			observer.update(temp, humidity, pressure);
		}
	}

	public void measurementsChanged(){
		notifyObserver();
	}

	public void setMeasurements(float temp, float humidity, float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}

interface Subject{
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}

interface Observer{
	public void update(float temp, float humidity, float pressure);
}

interface DisplayElement{
	public void display();
}

class CurrentConditionDisplay implements Observer, DisplayElement{
	private float temp;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure){
		this.temp = temp;
		this.humidity = humidity;
		display();
	}

	public void display(){
		System.out.println("CurrentCondition : \n temp : " + temp + "F degrees \n  humidity : " + humidity + "%");
	}
}

class StatisticsDisplay implements Observer, DisplayElement{

	private Subject weatherData;
	private int numCount;
	private float sumTemp = 0.0f;
	private float maxTemp = 0.0f;
	private float minTemp = 200.0f;

	public StatisticsDisplay(Subject weatherData){
		this.weatherData =  weatherData;
		weatherData.registerObserver(this);
	}


	public void update(float temp, float humidity, float pressure){
		sumTemp  += temp;
		numCount++;

		if(temp >maxTemp){
			maxTemp = temp;
		}
		if(temp < minTemp){
			minTemp = temp;
		}

		display();


	}

	public void display(){
		System.out.println("Statistic(avg/max/min) : " + (sumTemp/numCount) + "/" + maxTemp + "/" + minTemp);
	}
}

class ForecastDisplay implements Observer, DisplayElement{
	private Subject weatherData;
	private float currentPressure = 29.0f;
	private float lastPressure;

	public ForecastDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure){
		lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	public void display(){

		if(currentPressure > lastPressure){
			System.out.println("Good Day");
		}else if(currentPressure == lastPressure){
			System.out.println("Same Day");
		}else if(currentPressure < lastPressure){
			System.out.println("rainy Weather!");
		}	
	}
}


class HeatIndex implements Observer, DisplayElement{

	private float heatIndex = 0.0f;
	private Subject weatherData;

	public HeatIndex(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float t, float rh, float pressure){
		heatIndex = computeHeatIndex(t, rh);
		display();
	}

	public void display(){
		System.out.println("HeatIndex : " + heatIndex);
	}


	
	private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
            (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
            (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
            (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
            (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
            (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
            0.000000000843296 * (t * t * rh * rh * rh)) -
            (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }
}

