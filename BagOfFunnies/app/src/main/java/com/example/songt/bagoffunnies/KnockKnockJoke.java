package com.example.songt.bagoffunnies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class KnockKnockJoke extends AppCompatActivity {

    private KnockKnockJokeLibrary mKnockKnockJokeLibrary = new KnockKnockJokeLibrary();

    private Button mKnockKnockMenuButton, mNextKnockKnockButton;

    private TextView mKnockKnockView;

    private int mKnockKnockNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knock_knock_joke);

        mKnockKnockMenuButton = (Button) findViewById(R.id.knockKnockMainMenuButton);
        mNextKnockKnockButton = (Button)findViewById(R.id.newKnockKnockButton);

        mKnockKnockView = (TextView) findViewById(R.id.knockKnockView);
        updateKnockKnockJoke();

        mNextKnockKnockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateKnockKnockJoke();
            }
        });
        mKnockKnockMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent knockKnockIntent = new Intent(KnockKnockJoke.this,MainMenu.class);
                startActivity(knockKnockIntent);
            }
        });
    }
    public void updateKnockKnockJoke(){
        Random r = new Random();
        mKnockKnockNumber = r.nextInt(mKnockKnockJokeLibrary.getKnockKnockLibraryLength()-1)+1;
        mKnockKnockView.setText(mKnockKnockJokeLibrary.getKnockKnockJoke(mKnockKnockNumber));
    }
}
