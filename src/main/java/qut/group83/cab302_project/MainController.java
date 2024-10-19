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

        String set1[] = outputStringSplit[1].split("\\$");
        String set1Date = set1[1];
        String set1MinRain = set1[3];
        String set1MaxRain = set1[5];
        String set1MinTemp = set1[7];
        String set1MaxTemp = set1[9];

        day1MinRain.setText(set1MinRain);
        day1MaxRain.setText(set1MaxRain);
        day1MinTemp.setText(set1MinTemp);
        day1MaxTemp.setText(set1MaxTemp);

        String set2[] = outputStringSplit[3].split("\\$");
        String set2Date = set2[1];
        String set2MinRain = set2[3];
        String set2MaxRain = set2[5];
        String set2MinTemp = set2[7];
        String set2MaxTemp = set2[9];

        day2MinRain.setText(set2MinRain);
        day2MaxRain.setText(set2MaxRain);
        day2MinTemp.setText(set2MinTemp);
        day2MaxTemp.setText(set2MaxTemp);

        String set3[] = outputStringSplit[5].split("\\$");
        String set3Date = set3[1];
        String set3MinRain = set3[3];
        String set3MaxRain = set3[5];
        String set3MinTemp = set3[7];
        String set3MaxTemp = set3[9];

        day3MinRain.setText(set3MinRain);
        day3MaxRain.setText(set3MaxRain);
        day3MinTemp.setText(set3MinTemp);
        day3MaxTemp.setText(set3MaxTemp);

        String set4[] = outputStringSplit[7].split("\\$");
        String set4Date = set4[1];
        String set4MinRain = set4[3];
        String set4MaxRain = set4[5];
        String set4MinTemp = set4[7];
        String set4MaxTemp = set4[9];

        day4MinRain.setText(set4MinRain);
        day4MaxRain.setText(set4MaxRain);
        day4MinTemp.setText(set4MinTemp);
        day4MaxTemp.setText(set4MaxTemp);

        String set5[] = outputStringSplit[9].split("\\$");
        String set5Date = set5[1];
        String set5MinRain = set5[3];
        String set5MaxRain = set5[5];
        String set5MinTemp = set5[7];
        String set5MaxTemp = set5[9];

        day5MinRain.setText(set5MinRain);
        day5MaxRain.setText(set5MaxRain);
        day5MinTemp.setText(set5MinTemp);
        day5MaxTemp.setText(set5MaxTemp);

        String set6[] = outputStringSplit[11].split("\\$");
        String set6Date = set6[1];
        String set6MinRain = set6[3];
        String set6MaxRain = set6[5];
        String set6MinTemp = set6[7];
        String set6MaxTemp = set6[9];

        day6MinRain.setText(set6MinRain);
        day6MaxRain.setText(set6MaxRain);
        day6MinTemp.setText(set6MinTemp);
        day6MaxTemp.setText(set6MaxTemp);

        if(outputStringSplit.length == 14){
            String set7[] = outputStringSplit[13].split("\\$");
            String set7Date = set7[1];
            String set7MinRain = set7[3];
            String set7MaxRain = set7[5];
            String set7MinTemp = set7[7];
            String set7MaxTemp = set7[9];

            day7MinRain.setText(set7MinRain);
            day7MaxRain.setText(set7MaxRain);
            day7MinTemp.setText(set7MinTemp);
            day7MaxTemp.setText(set7MaxTemp);
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




        //welcomeText7.setText(APIuser.toString());
        metaDataText.setText(metaData);
    }
}