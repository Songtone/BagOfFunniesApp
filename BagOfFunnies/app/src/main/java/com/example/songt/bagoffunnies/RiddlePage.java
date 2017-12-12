package com.example.songt.bagoffunnies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class RiddlePage extends AppCompatActivity {

    private RiddleLibrary mRiddleLibrary = new RiddleLibrary();

    private Button mShowRiddleAnswerButton,mRiddleMainMenuButton,mNextRiddleButton;

    private TextView mRiddleView,mRiddleAnswerView;

    private int mRiddleNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riddle_page);

        mShowRiddleAnswerButton = (Button) findViewById(R.id.showRiddleButton);
        mRiddleMainMenuButton = (Button) findViewById(R.id.riddleMainMenuButton);
        mNextRiddleButton = (Button) findViewById(R.id.newRiddleButton);

        mRiddleView = (TextView) findViewById(R.id.riddleView);
        mRiddleAnswerView = (TextView)findViewById(R.id.riddleAnswerView);

        updateRiddle();

        mRiddleAnswerView.setText("");
        mRiddleMainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent riddleIntent = new Intent(RiddlePage.this,MainMenu.class);
                startActivity(riddleIntent);
            }
        });
        mNextRiddleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRiddleNumber++;
                if(mRiddleNumber == mRiddleLibrary.getRiddleLibraryLength()) {
                    mRiddleView.setText("This is the end!");
                    mNextRiddleButton.setVisibility(view.INVISIBLE);
                }
                else {
                    updateRiddle();
                    mRiddleAnswerView.setText("");
                }
            }
        });
        mShowRiddleAnswerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            showRiddleAnswer();
            }
        });

    }
    public void updateRiddle(){
        mRiddleView.setText(mRiddleLibrary.getRiddle(mRiddleNumber));


    }
    public void showRiddleAnswer(){
        mRiddleAnswerView.setText(mRiddleLibrary.getRiddleAnswer(mRiddleNumber));
    }
}
