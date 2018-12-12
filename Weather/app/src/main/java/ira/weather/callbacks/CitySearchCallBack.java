package hani.weather.callbacks;

import java.util.ArrayList;
import java.util.List;

import hani.weather.models.City;
import hani.weather.models.Weather;
import hani.weather.models.api.city.ResultResponse;
import hani.weather.models.api.weather.CurrentConditionResponse;


public interface CitySearchCallBack {

    void onWeatherForecastLoadedSusses(List<City> searchResult) ;

}
