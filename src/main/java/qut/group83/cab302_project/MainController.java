package qut.group83.cab302_project;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class MainController {
    @FXML
    private TextField minimumTemp;
    @FXML
    private TextField maximumTemp;
    @FXML
    private TextField minimumRain;
    @FXML
    private TextField maximumRain;
    @FXML
    private VBox contactContainer;

    @FXML
    private Label welcomeText1;

    //day1
    @FXML
    private Label day1MinTemp;
    @FXML
    private Label day1MaxTemp;
    @FXML
    private Label day1MinRain;
    @FXML
    private Label day1MaxRain;

    //day2
    @FXML
    private Label day2MinTemp;
    @FXML
    private Label day2MaxTemp;
    @FXML
    private Label day2MinRain;
    @FXML
    private Label day2MaxRain;

    //day3
    @FXML
    private Label day3MinTemp;
    @FXML
    private Label day3MaxTemp;
    @FXML
    private Label day3MinRain;
    @FXML
    private Label day3MaxRain;

    //day4
    @FXML
    private Label day4MinTemp;
    @FXML
    private Label day4MaxTemp;
    @FXML
    private Label day4MinRain;
    @FXML
    private Label day4MaxRain;

    //day5
    @FXML
    private Label day5MinTemp;
    @FXML
    private Label day5MaxTemp;
    @FXML
    private Label day5MinRain;
    @FXML
    private Label day5MaxRain;

    //day6
    @FXML
    private Label day6MinTemp;
    @FXML
    private Label day6MaxTemp;
    @FXML
    private Label day6MinRain;
    @FXML
    private Label day6MaxRain;

    //day7
    @FXML
    private Label day7MinTemp;
    @FXML
    private Label day7MaxTemp;
    @FXML
    private Label day7MinRain;
    @FXML
    private Label day7MaxRain;

    @FXML
    private Label welcomeText2;
    @FXML
    private Label welcomeText3;
    @FXML
    private Label welcomeText4;
    @FXML
    private Label welcomeText5;
    @FXML
    private Label welcomeText6;
    @FXML
    private Label welcomeText7;

    @FXML
    private Label metaDataText;

    public static Weather APIuser;

    GridPane gridpane = new GridPane();

    public void start() throws IOException {

    }

    public void onWorkingButtonClick(){



    }

    public void onRefreshButtonClick(){
        //API TEST SPACE
        WeatherFetcher fetcher = new WeatherFetcher();
        //BRISBANE r7hs1z
        //ALICE SPRINGS qgz1nj
        //SIMPSON DESERT r50z9g

        APIuser = fetcher.fetchCurrentWeatherForecast("r50z9g");
        //System.out.println(APIuser);

        String outputString = APIuser.toString();
        String[] outputStringSplit = outputString.split("\n");
        for(int i = 0; i < outputStringSplit.length; i++)
        {
            System.out.println(outputStringSplit[i]);
        }
        String metaData = outputStringSplit[0];

        String set1 = outputStringSplit[1];
        String set2 = outputStringSplit[3];
        String set3 = outputStringSplit[5];
        String set4 = outputStringSplit[7];
        String set5 = outputStringSplit[9];
        String set6 = outputStringSplit[11];
        if(outputStringSplit.length == 14){
            String set7 = outputStringSplit[13];
        }

        String set1Extended = outputStringSplit[2];
        String set2Extended = outputStringSplit[4];
        String set3Extended = outputStringSplit[6];
        String set4Extended = outputStringSplit[8];
        String set5Extended = outputStringSplit[10];
        String set6Extended = outputStringSplit[12];
        if(outputStringSplit.length == 14){
            String set7Extended = outputStringSplit[14];
        }


        day1MinTemp.setText("4");
        day1MaxTemp.setText("4");
        day1MinRain.setText("4");
        day1MaxRain.setText("4");

        //welcomeText7.setText(APIuser.toString());
        metaDataText.setText(metaData);
    }
}