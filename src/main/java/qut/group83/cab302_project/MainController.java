package qut.group83.cab302_project;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

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

    @FXML
    private ComboBox locationBox;

    @FXML
    private Label day1Temp;
    @FXML
    private Label day2Temp;
    @FXML
    private Label day3Temp;
    @FXML
    private Label day4Temp;
    @FXML
    private Label day5Temp;
    @FXML
    private Label day6Temp;
    @FXML
    private Label day7Temp;

    @FXML
    private Label[] test1;

    @FXML
    private Label day1RainChance;
    @FXML
    private Label day2RainChance;
    @FXML
    private Label day3RainChance;
    @FXML
    private Label day4RainChance;
    @FXML
    private Label day5RainChance;
    @FXML
    private Label day6RainChance;
    @FXML
    private Label day7RainChance;

    @FXML
    private Label day1AdvancedDetails;
    @FXML
    private Label day2AdvancedDetails;
    @FXML
    private Label day3AdvancedDetails;
    @FXML
    private Label day4AdvancedDetails;
    @FXML
    private Label day5AdvancedDetails;
    @FXML
    private Label day6AdvancedDetails;
    @FXML
    private Label day7AdvancedDetails;

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

        String currentLocation = locationBox.getValue().toString();
        System.out.println(currentLocation);

        String currentLocationSplit[] =  currentLocation.split("-");

        APIuser = fetcher.fetchCurrentWeatherForecast(currentLocationSplit[1]);
        //System.out.println(APIuser);

        String outputString = APIuser.toString();
        String[] outputStringSplit = outputString.split("\n");
        for(int i = 0; i < outputStringSplit.length; i++)
        {
            //System.out.println(outputStringSplit[i]);
        }
        System.out.println(outputStringSplit.length);
        String metaData = outputStringSplit[0];

        String set1[] = outputStringSplit[1].split("\\$");
        String set1Date = set1[1];
        String set1MinRain = set1[3];
        String set1MaxRain = set1[5];
        String set1MinTemp = set1[7];
        String set1MaxTemp = set1[9];
        String set1RainChance = set1[11];

        String day1TempValue = String.valueOf((int)Math.ceil((double)(Integer.parseInt(set1MinTemp) + Integer.parseInt(set1MaxTemp)) / 2)) + "°";
        day1Temp.setText(day1TempValue);
        day1Temp.setStyle("-fx-font: 72 calibre;");

        day1MinRain.setText(set1MinRain + "mm");
        day1MaxRain.setText(set1MaxRain + "mm");
        day1MinTemp.setText(set1MinTemp + "°");
        day1MaxTemp.setText(set1MaxTemp + "°");

        day1RainChance.setText(set1RainChance + "%");
        day1RainChance.setStyle("-fx-font: 72 calibre;");

        if(outputStringSplit[2].equals("null")){
            day1AdvancedDetails.setText("Unavailable");
        }
        else{
            day1AdvancedDetails.setText(outputStringSplit[2]);
        }

        String set2[] = outputStringSplit[3].split("\\$");
        String set2Date = set2[1];
        String set2MinRain = set2[3];
        String set2MaxRain = set2[5];
        String set2MinTemp = set2[7];
        String set2MaxTemp = set2[9];
        String set2RainChance = set2[11];

        String day2TempValue = String.valueOf((int)Math.ceil((double)(Integer.parseInt(set2MinTemp) + Integer.parseInt(set2MaxTemp)) / 2)) + "°";
        day2Temp.setText(day2TempValue);
        day2Temp.setStyle("-fx-font: 72 calibre;");

        day2MinRain.setText(set2MinRain + "mm");
        day2MaxRain.setText(set2MaxRain + "mm");
        day2MinTemp.setText(set2MinTemp + "°");
        day2MaxTemp.setText(set2MaxTemp + "°");

        day2RainChance.setText(set1RainChance + "%");
        day2RainChance.setStyle("-fx-font: 72 calibre;");

        if(outputStringSplit[4].equals("null")){
            day2AdvancedDetails.setText("Unavailable");
        }
        else{
            day2AdvancedDetails.setText(outputStringSplit[4]);
        }

        String set3[] = outputStringSplit[5].split("\\$");
        String set3Date = set3[1];
        String set3MinRain = set3[3];
        String set3MaxRain = set3[5];
        String set3MinTemp = set3[7];
        String set3MaxTemp = set3[9];
        String set3RainChance = set3[11];

        String day3TempValue = String.valueOf((int)Math.ceil((double)(Integer.parseInt(set3MinTemp) + Integer.parseInt(set3MaxTemp)) / 2)) + "°";
        day3Temp.setText(day3TempValue);
        day3Temp.setStyle("-fx-font: 72 calibre;");

        day3MinRain.setText(set3MinRain + "mm");
        day3MaxRain.setText(set3MaxRain + "mm");
        day3MinTemp.setText(set3MinTemp + "°");
        day3MaxTemp.setText(set3MaxTemp + "°");

        day3RainChance.setText(set1RainChance + "%");
        day3RainChance.setStyle("-fx-font: 72 calibre;");

        if(outputStringSplit[6].equals("null")){
            day3AdvancedDetails.setText("Unavailable");
        }
        else{
            day3AdvancedDetails.setText(outputStringSplit[6]);
        }

        String set4[] = outputStringSplit[7].split("\\$");
        String set4Date = set4[1];
        String set4MinRain = set4[3];
        String set4MaxRain = set4[5];
        String set4MinTemp = set4[7];
        String set4MaxTemp = set4[9];
        String set4RainChance = set4[11];

        String day4TempValue = String.valueOf((int)Math.ceil((double)(Integer.parseInt(set4MinTemp) + Integer.parseInt(set4MaxTemp)) / 2)) + "°";
        day4Temp.setText(day4TempValue);
        day4Temp.setStyle("-fx-font: 72 calibre;");

        day4MinRain.setText(set4MinRain + "mm");
        day4MaxRain.setText(set4MaxRain + "mm");
        day4MinTemp.setText(set4MinTemp + "°");
        day4MaxTemp.setText(set4MaxTemp + "°");

        day4RainChance.setText(set1RainChance + "%");
        day4RainChance.setStyle("-fx-font: 72 calibre;");

        if(outputStringSplit[8].equals("null")){
            day4AdvancedDetails.setText("Unavailable");
        }
        else{
            day4AdvancedDetails.setText(outputStringSplit[8]);
        }

        System.out.println(outputStringSplit[8]);

        String set5[] = outputStringSplit[9].split("\\$");
        String set5Date = set5[1];
        String set5MinRain = set5[3];
        String set5MaxRain = set5[5];
        String set5MinTemp = set5[7];
        String set5MaxTemp = set5[9];
        String set5RainChance = set5[11];

        String day5TempValue = String.valueOf((int)Math.ceil((double)(Integer.parseInt(set5MinTemp) + Integer.parseInt(set5MaxTemp)) / 2)) + "°";
        day5Temp.setText(day5TempValue);
        day5Temp.setStyle("-fx-font: 72 calibre;");

        day5MinRain.setText(set5MinRain + "mm");
        day5MaxRain.setText(set5MaxRain + "mm");
        day5MinTemp.setText(set5MinTemp + "°");
        day5MaxTemp.setText(set5MaxTemp + "°");

        day5RainChance.setText(set1RainChance + "%");
        day5RainChance.setStyle("-fx-font: 72 calibre;");

        if(outputStringSplit[10].equals("null")){
            day5AdvancedDetails.setText("Unavailable");
        }
        else{
            day5AdvancedDetails.setText(outputStringSplit[10]);
        }

        String set6[] = outputStringSplit[11].split("\\$");
        String set6Date = set6[1];
        String set6MinRain = set6[3];
        String set6MaxRain = set6[5];
        String set6MinTemp = set6[7];
        String set6MaxTemp = set6[9];
        String set6RainChance = set6[11];

        String day6TempValue = String.valueOf((int)Math.ceil((double)(Integer.parseInt(set6MinTemp) + Integer.parseInt(set6MaxTemp)) / 2)) + "°";
        day6Temp.setText(day6TempValue);
        day6Temp.setStyle("-fx-font: 72 calibre;");

        day6MinRain.setText(set6MinRain + "mm");
        day6MaxRain.setText(set6MaxRain + "mm");
        day6MinTemp.setText(set6MinTemp + "°");
        day6MaxTemp.setText(set6MaxTemp + "°");

        day6RainChance.setText(set1RainChance + "%");
        day6RainChance.setStyle("-fx-font: 72 calibre;");

        if(outputStringSplit[12].equals("null")){
            day6AdvancedDetails.setText("Unavailable");
        }
        else{
            day6AdvancedDetails.setText(outputStringSplit[12]);
        }

        metaDataText.setText(metaData);

        if(outputStringSplit.length == 14){
            String set7[] = outputStringSplit[13].split("\\$");
            String set7Date = set7[1];
            String set7MinRain = set7[3];
            String set7MaxRain = set7[5];
            String set7MinTemp = set7[7];
            String set7MaxTemp = set7[9];
            String set7RainChance = set7[11];

            String day7TempValue = String.valueOf((int)Math.ceil((double)(Integer.parseInt(set7MinTemp) + Integer.parseInt(set7MaxTemp)) / 2)) + "°";
            day7Temp.setText(day7TempValue);
            day7Temp.setStyle("-fx-font: 72 calibre;");

            day7MinRain.setText(set7MinRain + "mm");
            day7MaxRain.setText(set7MaxRain + "mm");
            day7MinTemp.setText(set7MinTemp + "°");
            day7MaxTemp.setText(set7MaxTemp + "°");

            day7RainChance.setText(set1RainChance + "%");
            day7RainChance.setStyle("-fx-font: 72 calibre;");

            if(outputStringSplit[14].equals("null")){
                day7AdvancedDetails.setText("Unavailable");
            }
            else{
                day7AdvancedDetails.setText(outputStringSplit[14]);
            }
        }


//        String set1Extended = outputStringSplit[2];
//        String set2Extended = outputStringSplit[4];
//        String set3Extended = outputStringSplit[6];
//        String set4Extended = outputStringSplit[8];
//        String set5Extended = outputStringSplit[10];
//        String set6Extended = outputStringSplit[12];
//        if(outputStringSplit.length == 14){
//            String set7Extended = outputStringSplit[14];
//        }






        //welcomeText7.setText(APIuser.toString());

    }
}