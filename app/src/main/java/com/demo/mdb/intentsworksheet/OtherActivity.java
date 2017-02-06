package com.demo.mdb.intentsworksheet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        //Part 2: Add an EditText and Button to this activity's layout file. When the button is
        // clicked, it should go back to the MainActivity and change the TextView to the text from
        // the EditText.
        // Hint: Every time a screen is reopened, its onResume method is called. Override this
        // method to update the text.
        //Question 6: Add an EditText and Button in the layout files, and add the EditText and
        // Button objects below.

        final EditText editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button2);

        //Question 7: Add the listener to the Button you instantiated.
        //Question 8: Every time the button is clicked, create the intent, get the text from the
        // edit text, put it in the intent, and execute the intent.

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("textinput", editText.getText().toString());
                startActivity(intent);
            }
        });

        //Question 9 is in MainActivity
    }
}
