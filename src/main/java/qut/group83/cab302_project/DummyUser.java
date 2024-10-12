package qut.group83.cab302_project;

import com.google.gson.Gson;

public class DummyUser {
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
        return "Weather{" +
                "forcast region=" + metadata.forecast_region +
                ", units=" + data[0].rain.amount.units +
                ", minimum rain=" + data[0].rain.amount.min +
                ", maximum rain=" + data[0].rain.amount.max +
                "}";
    }


    /**
     * Converts a JSON string to a DummyUser object using GSon.
     *
     * @param json the JSON string to convert
     * @return the DummyUser object
     */
    public static DummyUser fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, DummyUser.class);
    }
}

