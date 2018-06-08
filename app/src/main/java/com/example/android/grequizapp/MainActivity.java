package com.example.android.grequizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //initial score count to 0
    int count = 0;

    //declare answer variables for the question 1
    public RadioButton answerOneInitiations;
    public RadioButton answerOneImplementations;
    public RadioButton answerOneAptitudes;
    public RadioButton answerOneRationalizations;
    public RadioButton answerOneTemperaments;

    //declare answer variables for the question 2
    public RadioButton answerTwoInfamous;
    public RadioButton answerTwoRenowned;
    public RadioButton answerTwoContingent;
    public RadioButton answerTwoCogent;
    public RadioButton answerTwoInsistent;

    //declare answer variables for the question 3
    public CheckBox answerThreeOrthodox;
    public CheckBox answerThreeEccentric;
    public CheckBox answerThreeOriginal;
    public CheckBox answerThreeTrifling;
    public CheckBox answerThreeConventional;
    public CheckBox answerThreeInnovative;

    //declare answer variables for the question 4
    public CheckBox answerFourLimited;
    public CheckBox answerFourPartial;
    public CheckBox answerFourUndiscovered;
    public CheckBox answerFourCircumscribed;
    public CheckBox answerFourProsaic;
    public CheckBox answerFourHidden;

    //declare answer variable for the question 5
    public EditText answerFiveField;
    public float answerFive;

    //declare answer variable for the question 6
    public EditText answerSixField;
    public float answerSix;

    //declare the toast message variables for question 5 and 6
    public String questionFive;
    public String questionSix;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get answers for question 1
        answerOneInitiations = (RadioButton) findViewById(R.id.answer1_1);
        answerOneImplementations = (RadioButton) findViewById(R.id.answer1_2);
        answerOneAptitudes = (RadioButton) findViewById(R.id.answer1_3);
        answerOneRationalizations = (RadioButton) findViewById(R.id.answer1_4);
        answerOneTemperaments = (RadioButton) findViewById(R.id.answer1_5);

        ///get answers for question 2
        answerTwoInfamous = (RadioButton) findViewById(R.id.answer2_1);
        answerTwoRenowned = (RadioButton) findViewById(R.id.answer2_2);
        answerTwoContingent = (RadioButton) findViewById(R.id.answer2_3);
        answerTwoCogent = (RadioButton) findViewById(R.id.answer2_4);
        answerTwoInsistent = (RadioButton) findViewById(R.id.answer2_5);

        ///get answers for question 3
        answerThreeOrthodox = (CheckBox) findViewById(R.id.answer3_1);
        answerThreeEccentric = (CheckBox) findViewById(R.id.answer3_2);
        answerThreeOriginal = (CheckBox) findViewById(R.id.answer3_3);
        answerThreeTrifling = (CheckBox) findViewById(R.id.answer3_4);
        answerThreeConventional = (CheckBox) findViewById(R.id.answer3_5);
        answerThreeInnovative = (CheckBox) findViewById(R.id.answer3_6);

        ///get answers from question 4
        answerFourLimited = (CheckBox) findViewById(R.id.answer4_1);
        answerFourPartial = (CheckBox) findViewById(R.id.answer4_2);
        answerFourUndiscovered = (CheckBox) findViewById(R.id.answer4_3);
        answerFourCircumscribed = (CheckBox) findViewById(R.id.answer4_4);
        answerFourProsaic = (CheckBox) findViewById(R.id.answer4_5);
        answerFourHidden = (CheckBox) findViewById(R.id.answer4_6);

        ///Get answers from question 5
        answerFiveField = (EditText) findViewById(R.id.answer5);

        ///Get answer from question 6
        answerSixField = (EditText) findViewById(R.id.answer6);
    }



    /**
     * This method is called when the submit button is clicked.
     */
    public void submitResult(View view) {
        String questionOne;
        String questionTwo;
        String questionThree;
        String questionFour;

        //check answer for question 1: temperaments
        Boolean isClickAnswerOneInitiations = answerOneInitiations.isChecked();
        Boolean isClickAnswerOneImplementations = answerOneImplementations.isChecked();
        Boolean isClickAnswerOneAptitudes = answerOneAptitudes.isChecked();
        Boolean isClickAnswerOneRationalizations = answerOneRationalizations.isChecked();
        Boolean isClickAnswerOneTemperaments = answerOneTemperaments.isChecked();

        if (isClickAnswerOneTemperaments) {
            questionOne = "Correct!";
            count += 1;
        } else {
            questionOne = "Try again!";
        }

        if (!isClickAnswerOneInitiations && !isClickAnswerOneImplementations && !isClickAnswerOneAptitudes && !isClickAnswerOneRationalizations && isClickAnswerOneTemperaments) {
            questionOne = "Try again!";
        }


        //check answer for question 2: renowned
        Boolean isClickAnswerTwoInfamous = answerTwoInfamous.isChecked();
        Boolean isClickAnswerTwoRenowned = answerTwoRenowned.isChecked();
        Boolean isClickAnswerTwoContingent = answerTwoContingent.isChecked();
        Boolean isClickAnswerTwoCogent = answerTwoCogent.isChecked();
        Boolean isClickAnswerTwoInsistent = answerTwoInsistent.isChecked();

        if (isClickAnswerTwoRenowned) {
            questionTwo = "Correct!";
            count += 1;
        } else {
            questionTwo = "Try again!";
        }

        if (!isClickAnswerTwoInfamous && !isClickAnswerTwoRenowned && isClickAnswerTwoContingent && !isClickAnswerTwoCogent && isClickAnswerTwoInsistent) {
            questionTwo = "Try again!";
        }


        //Check answers for question 3: original and innovative
        Boolean isClickAnswerThreeOrthodox = answerThreeOrthodox.isChecked();
        Boolean isClickAnswerThreeEccentric = answerThreeEccentric.isChecked();
        Boolean isClickAnswerThreeOriginal = answerThreeOriginal.isChecked();
        Boolean isClickAnswerThreeTrifling = answerThreeTrifling.isChecked();
        Boolean isClickAnswerThreeConventional = answerThreeConventional.isChecked();
        Boolean isClickAnswerThreeInnovative = answerThreeInnovative.isChecked();

        if (isClickAnswerThreeOriginal && isClickAnswerThreeInnovative && !isClickAnswerThreeOrthodox && !isClickAnswerThreeEccentric && !isClickAnswerThreeTrifling && !isClickAnswerThreeConventional) {
            questionThree = "Correct!";
            count += 1;
        } else {
            questionThree = "Try again!";
        }

        if (!isClickAnswerThreeOriginal && !isClickAnswerThreeInnovative && !isClickAnswerThreeOrthodox && !isClickAnswerThreeEccentric && !isClickAnswerThreeTrifling && !isClickAnswerThreeConventional) {
            questionThree = "Try again!";
        }



        //Check answers for question 4: limited and circumscribed
        Boolean isClickAnswerFourLimited = answerFourLimited.isChecked();
        Boolean isClickAnswerFourPartial = answerFourPartial.isChecked();
        Boolean isClickAnswerFourUndiscovered = answerFourUndiscovered.isChecked();
        Boolean isClickAnswerFourCircumscribed = answerFourCircumscribed.isChecked();
        Boolean isClickAnswerFourProsaic = answerFourProsaic.isChecked();
        Boolean isClickAnswerFourHidden = answerFourHidden.isChecked();

        if (isClickAnswerFourLimited && isClickAnswerFourCircumscribed && !isClickAnswerFourPartial && !isClickAnswerFourUndiscovered && !isClickAnswerFourProsaic && !isClickAnswerFourHidden) {
            questionFour = "Correct!";
            count += 1;
        } else {
            questionFour = "Try again!";
        }

        if (!isClickAnswerFourLimited && !isClickAnswerFourCircumscribed && !isClickAnswerFourPartial && !isClickAnswerFourUndiscovered && !isClickAnswerFourProsaic && !isClickAnswerFourHidden) {
            questionFour = "Try again!";
        }


        //Check answer for question 5: 126
        try {
            answerFive = Float.valueOf(answerFiveField.getText().toString());
            if (answerFive == 126) {
                questionFive = "Correct!";
                count += 1;
            } else {
                questionFive = "Try again!";
            }
        } catch(Exception e){
            questionFive = "Try again!";
        }


         //Check answer for question 6: 6000
         try {
            answerSix = Float.valueOf(answerSixField.getText().toString());
            if (answerSix == 6000) {
                 questionSix = "Correct!";
                 count += 1;
            } else {
                 questionSix = "Try again!";
            }
         } catch(Exception e){
            questionSix = "Try again!";
        }


        createResultSummary(count, questionOne, questionTwo, questionThree, questionFour, questionFive, questionSix);
    }

    /**
     * Show the result by toast message
     *
     * @param scoreCount         is the user final score
     * @param checkQuestionOne   is the result of question 1
     * @param checkQuestionTwo   is the result of question 2
     * @param checkQuestionThree is the result of question 3
     * @param checkQuestionFour  is the result of question 4
     * @param checkQuestionFive  is the result of question 5
     * @param checkQuestionSix   is the result of question 6
     */
    private void createResultSummary(int scoreCount, String checkQuestionOne, String checkQuestionTwo, String checkQuestionThree, String checkQuestionFour, String checkQuestionFive, String checkQuestionSix) {
        String resultMessage = "Your result is: " + scoreCount + "/6.";
        resultMessage += "\nQ1: " + checkQuestionOne;
        resultMessage += "\nQ2: " + checkQuestionTwo;
        resultMessage += "\nQ3: " + checkQuestionThree;
        resultMessage += "\nQ4: " + checkQuestionFour;
        resultMessage += "\nQ5: " + checkQuestionFive;
        resultMessage += "\nQ6: " + checkQuestionSix;
        Toast.makeText(this, resultMessage, Toast.LENGTH_LONG).show();
    }

    public void resetAll(View v) {
        //zero the score
        count = 0;

        //make radio buttons for the question 1 unselected
        answerOneInitiations.setChecked(false);
        answerOneImplementations.setChecked(false);
        answerOneAptitudes.setChecked(false);
        answerOneRationalizations.setChecked(false);
        answerOneTemperaments.setChecked(false);

        //make radio buttons for the question 2 unselected
        answerTwoInfamous.setChecked(false);
        answerTwoRenowned.setChecked(false);
        answerTwoContingent.setChecked(false);
        answerTwoCogent.setChecked(false);
        answerTwoInsistent.setChecked(false);

        //make checkboxes for the question 3 unchecked
        if (answerThreeOrthodox.isChecked()) {
            answerThreeOrthodox.toggle();
        }

        if (answerThreeEccentric.isChecked()) {
            answerThreeEccentric.toggle();
        }

        if (answerThreeOriginal.isChecked()) {
            answerThreeOriginal.toggle();
        }

        if (answerThreeTrifling.isChecked()) {
            answerThreeTrifling.toggle();
        }

        if (answerThreeConventional.isChecked()) {
            answerThreeConventional.toggle();
        }

        if (answerThreeInnovative.isChecked()) {
            answerThreeInnovative.toggle();
        }

        //make checkboxes for the question 4 unchecked
        if (answerFourLimited.isChecked()) {
            answerFourLimited.toggle();
        }

        if (answerFourPartial.isChecked()) {
            answerFourPartial.toggle();
        }

        if (answerFourUndiscovered.isChecked()) {
            answerFourUndiscovered.toggle();
        }

        if (answerFourCircumscribed.isChecked()) {
            answerFourCircumscribed.toggle();
        }

        if (answerFourProsaic.isChecked()) {
            answerFourProsaic.toggle();
        }

        if (answerFourHidden.isChecked()) {
            answerFourHidden.toggle();
        }

        //empty edittext for the question 5
        answerFiveField.setText("");

        //empty edittext for the question 6
        answerSixField.setText("");
    }
}
