package com.example.songt.bagoffunnies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DadJokePage extends AppCompatActivity {

    private DadJokeLibrary mDadJokeLibrary = new DadJokeLibrary();

    private Button mDadJokeMainMenuButton,mNextDadJokeButton;

    private TextView mDadJokeView;

    private int mDadJokeNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dad_joke_page);


        mDadJokeMainMenuButton = (Button) findViewById(R.id.dadJokeMainMenuButton);
        mNextDadJokeButton = (Button) findViewById(R.id.newDadJokeButton);

        mDadJokeView = (TextView) findViewById(R.id.dadJokeView);

        updateDadJoke();


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
                mDadJokeNumber++;
                if(mDadJokeNumber == mDadJokeLibrary.getDadJokeLibraryLength()){
                    mDadJokeView.setText("You reached the end!");
                    mNextDadJokeButton.setVisibility(view.INVISIBLE);
                }
                else {
                    updateDadJoke();

                }
            }
        });

    }
    public void updateDadJoke(){

        mDadJokeView.setText(mDadJokeLibrary.getDadJoke(mDadJokeNumber));


    }

}
