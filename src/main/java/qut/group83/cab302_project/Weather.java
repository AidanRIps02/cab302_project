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
        return  "Forecast Region =" + metadata.forecast_region +
                "Forecast Issue Time = " + metadata.issue_time +
                "Next Expected Forecast Issue Time = " + metadata.next_issue_time +
                "\nSet1{" +
                ", forecast date=" + data[1].date +
                ", minimum rain=" + data[1].rain.amount.min +
                ", maximum rain=" + data[1].rain.amount.max +
                ", minimum temperature=" + data[1].temp_min +
                ", maximum temperature=" + data[1].temp_max +
                "}\n" +
                data[1].extended_text +
                "\nSet2{" +
                ", forecast date=" + data[2].date +
                ", minimum rain=" + data[2].rain.amount.min +
                ", maximum rain=" + data[2].rain.amount.max +
                ", minimum temperature=" + data[2].temp_min +
                ", maximum temperature=" + data[2].temp_max +
                "}\n" +
                data[2].extended_text +
                "\nSet3{" +
                ", forecast date=" + data[3].date +
                ", minimum rain=" + data[3].rain.amount.min +
                ", maximum rain=" + data[3].rain.amount.max +
                ", minimum temperature=" + data[3].temp_min +
                ", maximum temperature=" + data[3].temp_max +
                "}\n" +
                data[3].extended_text +
                "\nSet4{" +
                ", forecast date=" + data[4].date +
                ", minimum rain=" + data[4].rain.amount.min +
                ", maximum rain=" + data[4].rain.amount.max +
                ", minimum temperature=" + data[4].temp_min +
                ", maximum temperature=" + data[4].temp_max +
                "}\n" +
                data[4].extended_text +
                "\nSet5{" +
                ", forecast date=" + data[5].date +
                ", minimum rain=" + data[5].rain.amount.min +
                ", maximum rain=" + data[5].rain.amount.max +
                ", minimum temperature=" + data[5].temp_min +
                ", maximum temperature=" + data[5].temp_max +
                "}\n" +
                data[5].extended_text +
                "\nSet6{" +
                ", forecast date=" + data[6].date +
                ", minimum rain=" + data[6].rain.amount.min +
                ", maximum rain=" + data[6].rain.amount.max +
                ", minimum temperature=" + data[6].temp_min +
                ", maximum temperature=" + data[6].temp_max +
                "}\n" +
                data[6].extended_text +
                "\nSet7{" +
                ", forecast date=" + data[7].date +
                ", minimum rain=" + data[7].rain.amount.min +
                ", maximum rain=" + data[7].rain.amount.max +
                ", minimum temperature=" + data[7].temp_min +
                ", maximum temperature=" + data[7].temp_max +
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

