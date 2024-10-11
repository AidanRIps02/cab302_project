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
                "geoHash=" + metadata.forecast_region +
                ", data=" + data[0].rain.amount.units +
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

