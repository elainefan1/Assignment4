package com.example.extstudent.assignment4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button firstButton = null;
LinearLayout ScrollView = null;
private int buttonCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScrollView = findViewById(R.id.ScrollView);
        firstButton = (Button)findViewById(R.id.buttonSubmit);
        firstButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateNewButton();
            }
        }));
    }

    private void generateNewButton() {
        // TO-DO:
        // 1. Create a new Button widget (HINT: Pass in MainActivity.this);
        // 2. Create a layout prams for the new button. Layout params takes in the height and the width.
        // 3. Set the text and text color (use getRandomColor()) for the button. You can also set the background, but it might look weird.
        // 4. Create the callback for the new Button.
        // 5. Add the Button to the current view.

        Button newButton = new Button(MainActivity.this);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        newButton.setLayoutParams(layoutParams);
        buttonCount++;
        newButton.setText("Press Me:]"+ Integer.toString(++buttonCount));
        ScrollView.addView(newButton);
    }

    private int getRandomColor() {
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
}
}
