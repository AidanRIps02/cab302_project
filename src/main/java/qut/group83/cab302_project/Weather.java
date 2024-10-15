package qut.group83.cab302_project;

import com.google.gson.Gson;

public class Weather {
    public Data[] data;

    public Metadata metadata;



    public String getGeoHash() {
        return metadata.forecast_region;
    }

    public String getData() {
        return metadata.forecast_region;
    }

    @Override
    public String toString() {
        return  "metaData{" +
                "forecastRegion=" + metadata.forecast_region +
                ",forecastIssueTime=" + metadata.issue_time +
                ",nextExpectedForecastIssueTime=" + metadata.next_issue_time +
                "}" +
                "\nSet1{" +
                "forecastDate=" + data[1].date +
                ",minimumRain=" + data[1].rain.amount.min +
                ",maximumRain=" + data[1].rain.amount.max +
                ",minimumTemperature=" + data[1].temp_min +
                ",maximumTemperature=" + data[1].temp_max +
                "}\n" +
                data[1].extended_text +
                "\nSet2{" +
                "forecastDate=" + data[2].date +
                ",minimumRain=" + data[2].rain.amount.min +
                ",maximumRain=" + data[2].rain.amount.max +
                ",minimumTemperature=" + data[2].temp_min +
                ",maximumTemperature=" + data[2].temp_max +
                "}\n" +
                data[2].extended_text +
                "\nSet3{" +
                "forecastDate=" + data[3].date +
                ",minimumRain=" + data[3].rain.amount.min +
                ",maximumRain=" + data[3].rain.amount.max +
                ",minimumTemperature=" + data[3].temp_min +
                ",maximumTemperature=" + data[3].temp_max +
                "}\n" +
                data[3].extended_text +
                "\nSet4{" +
                "forecastDate=" + data[4].date +
                ",minimumRain=" + data[4].rain.amount.min +
                ",maximumRain=" + data[4].rain.amount.max +
                ",minimumTemperature=" + data[4].temp_min +
                ",maximumTemperature=" + data[4].temp_max +
                "}\n" +
                data[4].extended_text +
                "\nSet5{" +
                "forecastDate=" + data[5].date +
                ",minimumRain=" + data[5].rain.amount.min +
                ",maximumRain=" + data[5].rain.amount.max +
                ",minimumTemperature=" + data[5].temp_min +
                ",maximumTemperature=" + data[5].temp_max +
                "}\n" +
                data[5].extended_text +
                "\nSet6{" +
                "forecastDate=" + data[6].date +
                ",minimumRain=" + data[6].rain.amount.min +
                ",maximumRain=" + data[6].rain.amount.max +
                ",minimumTemperature=" + data[6].temp_min +
                ",maximumTemperature=" + data[6].temp_max +
                "}\n" +
                data[6].extended_text +
                "\nSet7{" +
                "forecastDate=" + data[7].date +
                ",minimumRain=" + data[7].rain.amount.min +
                ",maximumRain=" + data[7].rain.amount.max +
                ",minimumTemperature=" + data[7].temp_min +
                ",maximumTemperature=" + data[7].temp_max +
                "}\n" +
                data[7].extended_text;
    }


    /**
     * Converts a JSON string to a DummyUser object using GSon.
     *
     * @param json the JSON string to convert
     * @return the DummyUser object
     */
    public static Weather fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Weather.class);
    }
}

