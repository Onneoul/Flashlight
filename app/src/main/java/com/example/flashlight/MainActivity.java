package com.example.flashlight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int globalColorId = R.color.white;
    private String bgColor = "white";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            bgColor = savedInstanceState.getString("bgColor");
            globalColorId = savedInstanceState.getInt("colorId", globalColorId);
        }
    }

    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("bgColor", bgColor);
        savedInstanceState.putInt("colorId", globalColorId);
    }

    @Override
    protected void onResume() {
        super.onResume();
        changeColor(bgColor, globalColorId);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }


    public void onClickWhite(View view) {
        Button button = findViewById(R.id.whiteButton);
        changeColor((String) button.getContentDescription(), R.color.white);
    }
    public void onClickRed(View view) {
        Button button = findViewById(R.id.redButton);
        changeColor((String) button.getContentDescription(), R.color.red);
    }
    public void onClickBlue(View view) {
        Button button = findViewById(R.id.blueButton);
        changeColor((String) button.getContentDescription(), R.color.blue);
    }
    public void onClickGreen(View view) {
        Button button = findViewById(R.id.greenButton);
        changeColor((String) button.getContentDescription(), R.color.green);
    }
    public void onClickPurple(View view) {
        Button button = findViewById(R.id.purpleButton);
        changeColor((String) button.getContentDescription(), R.color.purple);
    }
    public void onClickYellow(View view) {
        Button button = findViewById(R.id.yellowButton);
        changeColor((String) button.getContentDescription(), R.color.yellow);
    }
    public void onClickPink(View view) {
        Button button = findViewById(R.id.pinkButton);
        changeColor((String) button.getContentDescription(), R.color.pink);
    }
    public void onClickGray(View view) {
        Button button = findViewById(R.id.grayButton);
        changeColor((String) button.getContentDescription(), R.color.gray);
    }
    public void onClickAqua(View view) {
        Button button = findViewById(R.id.aquaButton);
        changeColor((String) button.getContentDescription(), R.color.aqua);
    }

    public void changeColor(String color, int colorId) {
        final LinearLayout ly = findViewById(R.id.mainArea);
        ly.setBackgroundColor(getResources().getColor(colorId));
        bgColor = color;
        globalColorId = colorId;
//        Toast toast = Toast.makeText(this, bgColor, Toast.LENGTH_SHORT);
//        toast.show(); // 테스트용 코드
    }
}