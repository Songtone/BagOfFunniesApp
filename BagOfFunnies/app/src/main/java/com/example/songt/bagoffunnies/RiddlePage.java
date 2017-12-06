package com.example.songt.bagoffunnies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class RiddlePage extends AppCompatActivity {

    private Button mShowRiddleAnswerButton,mMainMenuButton,mNextRiddleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riddle_page);

        mShowRiddleAnswerButton = (Button) findViewById(R.id.showRiddleAnswer);

    }
}
