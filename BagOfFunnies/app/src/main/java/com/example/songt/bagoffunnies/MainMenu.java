package com.example.songt.bagoffunnies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    private Button mRiddleButton,mKnockButton,mDadJokeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        mRiddleButton = (Button)findViewById(R.id.riddleButton);
        mKnockButton = (Button) findViewById(R.id.knockButton);
        mDadJokeButton = (Button) findViewById(R.id.dadJokeButton);

        

        mRiddleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent riddleIntent = new Intent(MainMenu.this,RiddlePage.class);
                startActivity(riddleIntent);
            }
        });
        mKnockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent knockIntent = new Intent(MainMenu.this, KnockKnockJoke.class);
                startActivity(knockIntent);
            }
        });
        mDadJokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dadJokeIntent = new Intent(MainMenu.this,DadJokePage.class);
                startActivity(dadJokeIntent);
            }
        });

    }
//    public void onClick(View v){
//        if(v.getId() == R.id.jokeButton){
//
//        }
//        else if(v.getId() == R.id.riddleButton){
//            Intent riddleIntent = new Intent(MainMenu.this,RiddlePage.class);
//            startActivity(riddleIntent);
//        }
//    }
}
