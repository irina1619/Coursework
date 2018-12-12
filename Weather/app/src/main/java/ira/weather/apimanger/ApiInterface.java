package hani.weather.apimanger;

import java.util.Map;

import hani.weather.models.api.city.CityResponse;
import hani.weather.models.api.weather.WeatherApiResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;


public interface ApiInterface {

    @GET("weather.ashx/")
    Call<WeatherApiResponse> getWeatherInformationRequest(@QueryMap Map<String, Object> query);

    @GET("search.ashx/")
    Call<CityResponse> searchForCityRequest(@QueryMap Map<String, Object> query);


}
