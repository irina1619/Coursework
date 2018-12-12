package hani.weather.callbacks;

import java.util.List;

import hani.weather.models.api.weather.CurrentConditionResponse;
import hani.weather.models.Weather;


public interface WeatherForecastCallback {
    void onWeatherForecastLoadedSusses(CurrentConditionResponse currentCondition, Weather weather);

    void onWeatherForecastLoadedFailed(String errorCode);
}
