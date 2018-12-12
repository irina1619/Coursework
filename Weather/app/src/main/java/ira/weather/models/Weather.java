package hani.weather.models;

import hani.weather.models.api.weather.WeatherResponse;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class Weather extends RealmObject {

    @PrimaryKey
    private String id;

    private City city;

    private RealmList<WeatherResponse> weather;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public RealmList<WeatherResponse> getWeather() {
        return weather;
    }

    public void setWeather(RealmList<WeatherResponse> weather) {
        this.weather = weather;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}