package com.example.quizzie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int userScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScore(View view) {
        //reset the score to 0
        userScore = 0;
        //reset the activity once the reset button is pressed
        Intent mIntent = getIntent();
        finish();
        startActivity(mIntent);
        //display the score
        displayScore(userScore);
    }

    public void processScore(View view) {
        //Identify which radio group
        RadioGroup selectedRadioGroupOne = findViewById(R.id.radioGroupQuestionOne);
        // Get the Radio Button which is set
        // If no Radio Button is set, -1 will be returned
        int selectedIdOne = selectedRadioGroupOne.getCheckedRadioButtonId();
        if (selectedIdOne == -1) {
            Toast.makeText(MainActivity.this,
                    "No answer has been selected for question 1",
                    Toast.LENGTH_SHORT).show();
        } else {
            //Identify which radio button from the radio group was selected
            RadioButton selectedRadioButtonOne = findViewById(selectedRadioGroupOne.getCheckedRadioButtonId());
            //get RadioButton text
            String selectedAnswerOne = selectedRadioButtonOne.getText().toString();
            //compare to string resource that is the right answer and set color to green to indicate user has answered correctly
            if (selectedAnswerOne.equals(getString(R.string.first_question_d))) {
                userScore = userScore + 1;
                selectedRadioButtonOne.setBackgroundColor(getResources().getColor(R.color.opaqueGreen));
            }
            //otherwise set background to red to indicate user answered incorrectly
            else {
                selectedRadioButtonOne.setBackgroundColor(getResources().getColor(R.color.opaqueRed));
            }
        }

        //Identify which radio group
        RadioGroup selectedRadioGroupTwo = findViewById(R.id.radioGroupQuestionTwo);
        // Get the Radio Button which is set
        // If no Radio Button is set, -1 will be returned
        int selectedIdTwo = selectedRadioGroupTwo.getCheckedRadioButtonId();
        if (selectedIdTwo == -1) {
            Toast.makeText(MainActivity.this,
                    "No answer has been selected for question 2",
                    Toast.LENGTH_SHORT).show();
        } else {
            //Identify which radio button from the radio group was selected
            RadioButton selectedRadioButtonTwo = findViewById(selectedRadioGroupTwo.getCheckedRadioButtonId());
            //get RadioButton text
            String selectedAnswerTwo = selectedRadioButtonTwo.getText().toString();
            //compare to string resource that is the right answer and set color to green to indicate user has answered correctly
            if (selectedAnswerTwo.equals(getString(R.string.second_question_d))) {
                userScore = userScore + 1;
                selectedRadioButtonTwo.setBackgroundColor(getResources().getColor(R.color.opaqueGreen));
            }
            //otherwise set background to red to indicate user answered incorrectly
            else {
                selectedRadioButtonTwo.setBackgroundColor(getResources().getColor(R.color.opaqueRed));
            }
        }

        RadioGroup selectedRadioGroupThree = findViewById(R.id.radioGroupQuestionThree);
        int selectedIdThree = selectedRadioGroupThree.getCheckedRadioButtonId();
        if (selectedIdThree == -1) {
            Toast.makeText(MainActivity.this,
                    "No answer has been selected for question 3",
                    Toast.LENGTH_SHORT).show();
        } else {
            RadioButton selectedRadioButtonThree = findViewById(selectedRadioGroupThree.getCheckedRadioButtonId());
            String selectedAnswerThree = selectedRadioButtonThree.getText().toString();
            //refer to line 51
            if (selectedAnswerThree.equals(getString(R.string.third_question_b))) {
                userScore = userScore + 1;
                selectedRadioButtonThree.setBackgroundColor(getResources().getColor(R.color.opaqueGreen));
            }
            //refer to line 56
            else {
                selectedRadioButtonThree.setBackgroundColor(getResources().getColor(R.color.opaqueRed));
            }
        }

        RadioGroup selectedRadioGroupFour = findViewById(R.id.radioGroupQuestionFour);
        int selectedIdFour = selectedRadioGroupFour.getCheckedRadioButtonId();
        if (selectedIdFour == -1) {
            Toast.makeText(MainActivity.this,
                    "No answer has been selected for question 4",
                    Toast.LENGTH_SHORT).show();
        } else {
            RadioButton selectedRadioButtonFour = findViewById(selectedRadioGroupFour.getCheckedRadioButtonId());
            String selectedAnswerFour = selectedRadioButtonFour.getText().toString();
            //refer to line 51
            if (selectedAnswerFour.equals(getString(R.string.true_or))) {
                userScore = userScore + 1;
                selectedRadioButtonFour.setBackgroundColor(getResources().getColor(R.color.opaqueGreen));
            }
            //refer to line 56
            else {
                selectedRadioButtonFour.setBackgroundColor(getResources().getColor(R.color.opaqueRed));
            }
        }

        RadioGroup selectedRadioGroupFive = findViewById(R.id.radioGroupQuestionFive);
        int selectedIdFive = selectedRadioGroupFive.getCheckedRadioButtonId();
        if (selectedIdFive == -1) {
            Toast.makeText(MainActivity.this,
                    "No answer has been selected for question 5",
                    Toast.LENGTH_SHORT).show();
        } else {
            RadioButton selectedRadioButtonFive = findViewById(selectedRadioGroupFive.getCheckedRadioButtonId());
            String selectedAnswerFive = selectedRadioButtonFive.getText().toString();
            //refer to line 51
            if (selectedAnswerFive.equals(getString(R.string.or_false))) {
                userScore = userScore + 1;
                selectedRadioButtonFive.setBackgroundColor(getResources().getColor(R.color.opaqueGreen));
            }
            //refer to line 56
            else {
                selectedRadioButtonFive.setBackgroundColor(getResources().getColor(R.color.opaqueRed));
            }
        }

        EditText questionSix = findViewById(R.id.editTextQuestionSix);
        //Extract the user input for EditText question and store it into a string variable
        String answerSix = questionSix.getText().toString();
        //If user did not enter anything, then display toast message
        if (answerSix.isEmpty()) {
            questionSix.setBackgroundColor(getResources().getColor(R.color.opaqueRed));
            Toast.makeText(MainActivity.this,
                    "Please enter your answer for question 6",
                    Toast.LENGTH_SHORT).show();
        } else {
            //refer to line 51
            if (answerSix.equals(getString(R.string.sixth_question_answer))) {
                userScore = userScore + 1;
                questionSix.setBackgroundColor(getResources().getColor(R.color.opaqueGreen));
            }
            //refer to line 56
            else {
                questionSix.setBackgroundColor(getResources().getColor(R.color.opaqueRed));
            }
        }


        EditText questionSeven = findViewById(R.id.editTextQuestionSeven);
        String answerSeven = questionSeven.getText().toString();
        if (answerSeven.isEmpty()) {
            questionSeven.setBackgroundColor(getResources().getColor(R.color.opaqueRed));
            Toast.makeText(MainActivity.this,
                    "Please enter your answer for question 7",
                    Toast.LENGTH_SHORT).show();
        } else {
            //refer to line 51
            if (answerSeven.equals(getString(R.string.seventh_question_answer))) {
                userScore = userScore + 1;
                questionSeven.setBackgroundColor(getResources().getColor(R.color.opaqueGreen));
            }
            //refer to line 56
            else {
                questionSeven.setBackgroundColor(getResources().getColor(R.color.opaqueRed));
            }
        }

        //check boxes that contain correct answers
        CheckBox questionEightA = findViewById(R.id.check_eight_a);
        boolean answerEightA = questionEightA.isChecked();
        CheckBox questionEightB = findViewById(R.id.check_eight_b);
        boolean answerEightB = questionEightB.isChecked();
        CheckBox questionEightC = findViewById(R.id.check_eight_c);
        boolean answerEightC = questionEightC.isChecked();
        CheckBox questionEightD = findViewById(R.id.check_eight_d);
        boolean answerEightD = questionEightD.isChecked();

        if (!answerEightB && !answerEightC && !answerEightA && !answerEightD) {
            Toast.makeText(MainActivity.this,
                    "Please check two of the boxes for question 8",
                    Toast.LENGTH_SHORT).show();
        } else {
            //figure out if both check boxes are checked and add 1 to score
            if ((answerEightB && answerEightC) && (!answerEightA && !answerEightD)) {
                userScore = userScore + 1;
                questionEightB.setBackgroundColor(getResources().getColor(R.color.opaqueGreen));
                questionEightC.setBackgroundColor(getResources().getColor(R.color.opaqueGreen));

            }
            //indicate correct answers with a green background color
            else {
                questionEightB.setBackgroundColor(getResources().getColor(R.color.opaqueGreen));
                questionEightC.setBackgroundColor(getResources().getColor(R.color.opaqueGreen));
            }
        }


        RadioGroup selectedRadioGroupNine = findViewById(R.id.radioGroupQuestionNine);
        int selectedIdNine = selectedRadioGroupNine.getCheckedRadioButtonId();
        if (selectedIdNine == -1) {
            Toast.makeText(MainActivity.this,
                    "No answer has been selected for question 9",
                    Toast.LENGTH_SHORT).show();
        } else {
            RadioButton selectedRadioButtonNine = findViewById(selectedRadioGroupNine.getCheckedRadioButtonId());
            String selectedAnswerNine = selectedRadioButtonNine.getText().toString();
            //refer to line 51
            if (selectedAnswerNine.equals(getString(R.string.ninth_question_a))) {
                userScore = userScore + 1;
                selectedRadioButtonNine.setBackgroundColor(getResources().getColor(R.color.opaqueGreen));
            }
            //refer to line 56
            else {
                selectedRadioButtonNine.setBackgroundColor(getResources().getColor(R.color.opaqueRed));
            }
        }


        displayScore(userScore);
    }

    private void displayScore(int score) {
        TextView quantityTextView = findViewById(R.id.quizScore);
        quantityTextView.setText(score + "/9");
    }
}