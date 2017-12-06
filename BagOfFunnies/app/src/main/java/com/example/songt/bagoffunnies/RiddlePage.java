package com.example.songt.bagoffunnies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.Random;

public class RiddlePage extends AppCompatActivity {

    private RiddleLibrary mRiddleLibrary = new RiddleLibrary();

    private Button mShowRiddleAnswerButton,mMainMenuButton,mNextRiddleButton;

    private int mRiddleNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riddle_page);

        mShowRiddleAnswerButton = (Button) findViewById(R.id.showRiddleButton);
        mMainMenuButton = (Button) findViewById(R.id.riddleMainMenuButton);
        mNextRiddleButton = (Button) findViewById(R.id.newRiddleButton);

    }
    public void updateRiddle(){
        Random r = new Random();
        mRiddleNumber = r.nextInt(mRiddleLibrary.getRiddleLibraryLength()-1)+1;
        

    }
}
