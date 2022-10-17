package HWLesson6;

import okhttp3.*;

import java.io.IOException;
import java.util.Objects;

public class Main {


    public static void main(String[] args) throws IOException {

        //locationKey
        OkHttpClient okHttp = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/locations/v1/cities/" +
                        "search?q=Moscow Russia&apikey=AZJxwUoAS3KGeeEoQxTo15K1z5HHIVUZ")
//                        "search?q=Saint Petersburg  Russia&apikey=AZJxwUoAS3KGeeEoQxTo15K1z5HHIVUZ")
                .get()
                .build();

        Response response = okHttp.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.body().string());
//"Saint Petersburg"   "Key":"295212"
//        "Moscow"      "Key":"294021"


//        http://dataservice.accuweather.com/forecasts/v1/daily/1day/294021?apikey=AZJxwUoAS3KGeeEoQxTo15K1z5HHIVUZ&language=ru&details=true

        // weather forecast for Moscow  for 1 day
        Request request2 = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/1day/" +
                        "294021?apikey=AZJxwUoAS3KGeeEoQxTo15K1z5HHIVUZ&language=ru&details=true")
                .get()
                .build();

        Response response2 = okHttp.newCall(request2).execute();

        System.out.println(response2.code());
        System.out.println(response2.body().string());
// Result
// 200
// {"Headline":{"EffectiveDate":"2022-10-17T07:00:00+03:00","EffectiveEpochDate":1665979200,"Severity":3,
// "Text":"Понедельник: ожидаются ливни","Category":"rain","EndDate":"2022-10-17T19:00:00+03:00",
// "EndEpochDate":1666022400,
// "MobileLink":"http://www.accuweather.com/ru/ru/moscow/294021/daily-weather-forecast/294021",
// "Link":"http://www.accuweather.com/ru/ru/moscow/294021/daily-weather-forecast/294021"},
// "DailyForecasts":[{"Date":"2022-10-17T07:00:00+03:00","EpochDate":1665979200,
// "Sun":{"Rise":"2022-10-17T07:03:00+03:00","EpochRise":1665979380,"Set":"2022-10-17T17:26:00+03:00","EpochSet":1666016760},
// "Moon":{"Rise":"2022-10-17T21:34:00+03:00","EpochRise":1666031640,"Set":"2022-10-18T15:57:00+03:00","EpochSet":1666097820,
// "Phase":"Last","Age":21},"Temperature":{"Minimum":{"Value":41.0,"Unit":"F","UnitType":18},"Maximum":{"Value":49.0,"Unit":"F","UnitType":18}},
// "RealFeelTemperature":{"Minimum":{"Value":34.0,"Unit":"F","UnitType":18,"Phrase":"Холодно"},
// "Maximum":{"Value":40.0,"Unit":"F","UnitType":18,"Phrase":"Зябко"}},
// "RealFeelTemperatureShade":{"Minimum":{"Value":34.0,"Unit":"F","UnitType":18,"Phrase":"Холодно"},
// "Maximum":{"Value":40.0,"Unit":"F","UnitType":18,"Phrase":"Зябко"}},"HoursOfSun":1.5,
// "DegreeDaySummary":{"Heating":{"Value":20.0,"Unit":"F","UnitType":18},
// "Cooling":{"Value":0.0,"Unit":"F","UnitType":18}},"AirAndPollen":
// [{"Name":"AirQuality","Value":0,"Category":"Хорошая","CategoryValue":1,"Type":"Озон"},
// {"Name":"Grass","Value":0,"Category":"Хорошая","CategoryValue":1},
// {"Name":"Mold","Value":0,"Category":"Хорошая","CategoryValue":1},
// {"Name":"Ragweed","Value":0,"Category":"Хорошая","CategoryValue":1},
// {"Name":"Tree","Value":0,"Category":"Хорошая","CategoryValue":1},
// {"Name":"UVIndex","Value":0,"Category":"Хорошая","CategoryValue":1}],
// "Day":{"Icon":12,"IconPhrase":"Ливни","HasPrecipitation":true,
// "PrecipitationType":"Rain","PrecipitationIntensity":"Light","ShortPhrase":"Небольшой дождь",
// "LongPhrase":"Небольшой дождь","PrecipitationProbability":83,"ThunderstormProbability":4,
// "RainProbability":83,"SnowProbability":4,"IceProbability":0,
// "Wind":{"Speed":{"Value":13.8,"Unit":"mi/h","UnitType":9},
// "Direction":{"Degrees":226,"Localized":"ЮЗ","English":"SW"}},
// "WindGust":{"Speed":{"Value":32.2,"Unit":"mi/h","UnitType":9},
// "Direction":{"Degrees":233,"Localized":"ЮЗ","English":"SW"}},
// "TotalLiquid":{"Value":0.16,"Unit":"in","UnitType":1},
// "Rain":{"Value":0.16,"Unit":"in","UnitType":1},
// "Snow":{"Value":0.0,"Unit":"in","UnitType":1},"Ice":{"Value":0.0,"Unit":"in","UnitType":1},
// "HoursOfPrecipitation":3.0,"HoursOfRain":3.0,"HoursOfSnow":0.0,"HoursOfIce":0.0,"CloudCover":95,"Evapotranspiration":{"Value":0.03,"Unit":"in","UnitType":1},"SolarIrradiance":{"Value":573.6,"Unit":"W/m?","UnitType":33}},"Night":{"Icon":36,"IconPhrase":"Переменная облачность","HasPrecipitation":false,"ShortPhrase":"Проясняется","LongPhrase":"Проясняется","PrecipitationProbability":6,"ThunderstormProbability":0,"RainProbability":6,"SnowProbability":0,"IceProbability":0,"Wind":{"Speed":{"Value":10.4,"Unit":"mi/h","UnitType":9},"Direction":{"Degrees":267,"Localized":"З","English":"W"}},"WindGust":{"Speed":{"Value":26.5,"Unit":"mi/h","UnitType":9},"Direction":{"Degrees":269,"Localized":"З","English":"W"}},"TotalLiquid":{"Value":0.0,"Unit":"in","UnitType":1},"Rain":{"Value":0.0,"Unit":"in","UnitType":1},"Snow":{"Value":0.0,"Unit":"in","UnitType":1},"Ice":{"Value":0.0,"Unit":"in","UnitType":1},"HoursOfPrecipitation":0.0,"HoursOfRain":0.0,"HoursOfSnow":0.0,"HoursOfIce":0.0,"CloudCover":52,"Evapotranspiration":{"Value":0.01,"Unit":"in","UnitType":1},"SolarIrradiance":{"Value":0.0,"Unit":"W/m?","UnitType":33}},"Sources":["AccuWeather"],"MobileLink":"http://www.accuweather.com/ru/ru/moscow/294021/daily-weather-forecast/294021?day=1","Link":"http://www.accuweather.com/ru/ru/moscow/294021/daily-weather-forecast/294021?day=1"}]}
//

// weather forecast for Saint Petersburg for 5 day
        Request request3 = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/" +
//                        "295212?apikey=AZJxwUoAS3KGeeEoQxTo15K1z5HHIVUZ&language=ru&details=true")
                        "295212?apikey=AZJxwUoAS3KGeeEoQxTo15K1z5HHIVUZ&language=ru")
                .get()
                .build();

        Response response3 = okHttp.newCall(request3).execute();
        System.out.println(response3.code());
        System.out.println(response3.body().string());

        //results
// {"Headline":{"EffectiveDate":"2022-10-17T07:00:00+03:00","EffectiveEpochDate":1665979200,
// "Severity":3,"Text":"Дождь Понедельник, утро","Category":"rain","EndDate":"2022-10-17T13:00:00+03:00",
// "EndEpochDate":1666000800,"MobileLink":"http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212",
// "Link":"http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212"},
// "DailyForecasts":[{"Date":"2022-10-17T07:00:00+03:00","EpochDate":1665979200,
// "Temperature":{"Minimum":{"Value":43.0,"Unit":"F","UnitType":18},
// "Maximum":{"Value":50.0,"Unit":"F","UnitType":18}},
// "Day":{"Icon":14,"IconPhrase":"Небольшая облачность с дождями","HasPrecipitation":true,"PrecipitationType":"Rain",
// "PrecipitationIntensity":"Moderate"},"Night":{"Icon":35,"IconPhrase":"Облачно с прояснениями","HasPrecipitation":false},
// "Sources":["AccuWeather"],"MobileLink":"http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=1",
// "Link":"http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=1"},
// {"Date":"2022-10-18T07:00:00+03:00","EpochDate":1666065600,"Temperature":{"Minimum":{"Value":38.0,"Unit":"F","UnitType":18},"Maximum":{"Value":47.0,"Unit":"F","UnitType":18}},
// "Day":{"Icon":1,"IconPhrase":"Солнечно","HasPrecipitation":false},"Night":{"Icon":38,"IconPhrase":"Преимущественно облачно","HasPrecipitation":false},"Sources":["AccuWeather"],"MobileLink":"http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=2","Link":"http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=2"},{"Date":"2022-10-19T07:00:00+03:00","EpochDate":1666152000,"Temperature":{"Minimum":{"Value":31.0,"Unit":"F","UnitType":18},"Maximum":{"Value":40.0,"Unit":"F","UnitType":18}},"Day":{"Icon":4,"IconPhrase":"Переменная облачность","HasPrecipitation":false},"Night":{"Icon":38,"IconPhrase":"Преимущественно облачно","HasPrecipitation":false},"Sources":["AccuWeather"],"MobileLink":"http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=3","Link":"http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=3"},{"Date":"2022-10-20T07:00:00+03:00","EpochDate":1666238400,"Temperature":{"Minimum":{"Value":35.0,"Unit":"F","UnitType":18},"Maximum":{"Value":43.0,"Unit":"F","UnitType":18}},"Day":{"Icon":6,"IconPhrase":"Преимущественно облачно","HasPrecipitation":false},"Night":{"Icon":34,"IconPhrase":"Преимущественно ясно","HasPrecipitation":false},"Sources":["AccuWeather"],"MobileLink":"http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=4","Link":"http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=4"},{"Date":"2022-10-21T07:00:00+03:00","EpochDate":1666324800,"Temperature":{"Minimum":{"Value":34.0,"Unit":"F","UnitType":18},"Maximum":{"Value":42.0,"Unit":"F","UnitType":18}},"Day":{"Icon":12,"IconPhrase":"Ливни","HasPrecipitation":true,"PrecipitationType":"Rain","PrecipitationIntensity":"Light"},"Night":{"Icon":8,"IconPhrase":"Пасмурно","HasPrecipitation":true,"PrecipitationType":"Rain","PrecipitationIntensity":"Light"},
// "Sources":["AccuWeather"],"MobileLink":"http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=5",
// "Link":"http://www.accuweather.com/ru/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=5"}]}

    }
}
