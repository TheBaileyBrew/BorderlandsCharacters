package com.example.borderlandscharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText characterInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        characterInput = findViewById(R.id.main_character_entry);
    }

    public void VerifyCharacterClick(View view) {

        // Do something to validate the name entered into the EditText characterInput
        // For Example:
        // if characterInput text == Fl4k
        // {
        //    DO STUFF HERE TO SHOW HIDE VISIBILITY and update TextViews with text and matching colors
        //      **HINT HINT CHECK OUT colors.xml and use it as a R. (google how to use colors.xml in MainActivity)
        // }


    }

    public void ResetToCharacterSelection(View view) {

        // Do something to change the visibilities for all views
        // Hide/Gone the views for characters
        // show the main title, edittext and button
    }
}
