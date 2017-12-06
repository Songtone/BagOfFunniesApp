package com.example.songt.bagoffunnies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DadJokePage extends AppCompatActivity {

    private DadJokeLibrary mDadJokeLibrary = new DadJokeLibrary();

    private Button mShowDadJokeAnswerButton,mDadJokeMainMenuButton,mNextDadJokeButton;

    private TextView mDadJokeView,mDadJokeAnswerView;

    private int mDadJokeNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dad_joke_page);

        mShowDadJokeAnswerButton = (Button) findViewById(R.id.showDadJokeButton);
        mDadJokeMainMenuButton = (Button) findViewById(R.id.dadJokeMainMenuButton);
        mNextDadJokeButton = (Button) findViewById(R.id.newDadJokeButton);

        mDadJokeView = (TextView) findViewById(R.id.dadJokeView);
        mDadJokeAnswerView = (TextView)findViewById(R.id.dadJokeAnswerView);

        updateDadJoke();
        mDadJokeAnswerView.setText("");

        mDadJokeMainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dadJokeIntent = new Intent(DadJokePage.this,MainMenu.class);
                startActivity(dadJokeIntent);
            }
        });
        mNextDadJokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateDadJoke();
                mDadJokeAnswerView.setText("");
            }
        });
        mShowDadJokeAnswerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDadJokeAnswer();
            }
        });
    }
    public void updateDadJoke(){

        mDadJokeNumber = mDadJokeLibrary.getRandomDadJokeNumber();
        mDadJokeView.setText(mDadJokeLibrary.getDadJoke(mDadJokeNumber));


    }
    public void showDadJokeAnswer(){
        mDadJokeAnswerView.setText(mDadJokeLibrary.getDadJokeAnswer(mDadJokeNumber));
    }
}
