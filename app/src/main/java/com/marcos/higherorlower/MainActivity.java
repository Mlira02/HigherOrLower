package com.marcos.higherorlower;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    Random randomClass = new Random();
    int randomNumber = randomClass.nextInt(21);


    public void generateRandomNumber()
    {
        Random rand = new Random();
        randomNumber = rand.nextInt(21);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void guess(View view)
    {
        EditText editText = (EditText) findViewById(R.id.editTextGuessNumber);
        int guessValue = Integer.parseInt(editText.getText().toString());
        String message;

        if(guessValue > randomNumber)
        {
            message = "Lower!!";
        }
        else if(guessValue < randomNumber)
        {
            message = "Higher...";
        }
        else
        {
            message = "You got it!! Try Again now";
            generateRandomNumber();
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        Log.i("Entered Value", editText.getText().toString());
        Log.i("Random number", "number is: " + randomNumber);
    }
}