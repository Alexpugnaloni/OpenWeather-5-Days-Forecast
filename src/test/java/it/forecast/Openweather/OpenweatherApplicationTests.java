package it.forecast.Openweather;

import it.forecast.Openweather.Database.Database;
import it.forecast.Openweather.Exceptions.MissingDataException;
import it.forecast.Openweather.Model.WeatherData;
import it.forecast.Openweather.Service.WeatherForecast_API_Call;
import it.forecast.Openweather.Service.WeatherService;
import it.forecast.Openweather.Service.WeatherServiceImpl;
import it.forecast.Openweather.Stats.Stats;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;


import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class OpenweatherApplicationTests {


	private ArrayList<WeatherData> weather = new ArrayList<WeatherData>();
	private WeatherData w1,w2;
	WeatherService ws = new WeatherServiceImpl();
	static final String url1 = "api.openweathermap.org/data/2.5/forecast?q=Berlino&appid=64ad2ae5de08dc46224c92d7503a2ac2";



	@BeforeEach
	void inizio() throws Exception{
		w1 = new WeatherData("cielo sereno",4.37,4.37,6.29,1.62,Long.valueOf(61),Long.valueOf(1017),String.valueOf(new Date()),"Firenze","IT","Clear");
		w2 = new WeatherData("cielo sereno",2.37,2.37,6.29,1.08,Long.valueOf(40),Long.valueOf(1100),String.valueOf(new Date()),"Torbole","IT","Clear");
	weather.add(w1);
	weather.add(w2);
	}
	@AfterEach
	void dereferenziaValori() throws Exception{

	}
	@Test
	public  void Test1 (){
		assertNotEquals(w1.getTemperature(),w2.getTemperature());
		assertNotEquals(w1.getFeels_like(),w2.getFeels_like());
		assertNotEquals(w1.getTempMin(),w2.getTempMin());
	}
	@Test
	public void Test2()  {

	}

	}
