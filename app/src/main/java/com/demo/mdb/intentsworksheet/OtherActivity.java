package com.demo.mdb.intentsworksheet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

        /* your code here */

        //Question 7: Add the listener to the Button you instantiated.
        //Question 8: Every time the button is clicked, create the intent, get the text from the
        // edit text, put it in the intent, and execute the intent.

        /* your code below */

        //Question 9 is in MainActivity
    }
}
