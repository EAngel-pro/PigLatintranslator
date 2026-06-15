package com.eangelpro.piglatintranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    private EditText inputTranslation;
    private TextView outputTranslation;
    private Button translateBtn;
    String pyg = "ay";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //new
        translateBtn = (Button)  findViewById(R.id.translatebtn);
        translateBtn.setOnClickListener(this);
        inputTranslation = (EditText)  findViewById(R.id.inputTranslation);
        outputTranslation = (TextView)  findViewById(R.id.outputTranslation);
    }

    @Override
    public void onClick(View view) {
        String original = String.valueOf(inputTranslation.getText());
        final MediaPlayer ding = MediaPlayer.create(this, R.raw.ding);
        ding.start();
        if (original.length() > 0) {
            String word = original.toLowerCase();
            char first = word.toCharArray()[0];
            String new_word = word+first+pyg;
            new_word = word.substring(1) +first+pyg;
            char Cap = new_word.toCharArray()[0];
            Cap = Character.toUpperCase(Cap);
            new_word = word.substring(2) +"-"+first+pyg;
            outputTranslation.setText(Cap+new_word);//through to the end length

        }
        else {
            outputTranslation.setText("Try Again!");
        }

    }
}