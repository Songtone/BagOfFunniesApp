package com.example.songt.bagoffunnies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    private Button mJokeButton,mRiddleButton,mKnockButton,mDadJokeButton,mPunButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        mJokeButton = (Button) findViewById(R.id.jokeButton);
        mRiddleButton = (Button)findViewById(R.id.riddleButton);
        mKnockButton = (Button) findViewById(R.id.knockButton);
        mDadJokeButton = (Button) findViewById(R.id.dadJokeButton);
        mPunButton = (Button) findViewById(R.id.punButton);


    }
}
