package com.demo.mdb.intentsworksheet;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // way to find a view by its ID...

        Button button = (Button) findViewById(R.id.button);

        //Question 3: find a way for the Button to LISTEN ON the CLICKs. Use Google for guidance.
        //Question 4: every time the button is clicked, create and execute an Intent to go to the
        // OtherClass.

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OtherActivity.class);
                startActivity(intent);
            }
        });

        //Part 3: create an Intent that has a button that opens the camera app, takes a picture, and
        // displays the picture. Note: this requires a line in the manifest, but that comes later,
        // so I hooked yall up nbd

        //Question 10: Create the button in the layout and add the listener with the Intent. What
        // does the Intent look like? If you're not opening a class, then what do you pass in?
        // Google it bb
        ((Button) findViewById(R.id.button3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(takePictureIntent, 1);
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Question 9: Every time this Activity is resumed, set the text of the TextView to the extra
        // value from the intent you got from OtherActivity.
        String newString = getIntent().getStringExtra("textinput");
        if (newString != null) {
            ((TextView) findViewById(R.id.textView)).setText(newString);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK) {

            //Question 11: retrieve the result from the intent. Do not use get Intent, use the parameter
            // data.

            Bundle extras = data.getExtras();

            //Question 12: Create a Bitmap object and set it to the data from the Intent. Use the key
            // "data" to retrieve the Bitmap.

            Bitmap imageBitmap = (Bitmap) extras.get("data");

            //Question 13: create an imageView in the layout
            //Question 14: set the imageView to the Bitmap

            ((ImageView) findViewById(R.id.imageView)).setImageBitmap(imageBitmap);
        }

        //ye
    }
}
