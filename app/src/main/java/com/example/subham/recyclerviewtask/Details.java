package com.example.subham.recyclerviewtask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            ((ImageView) findViewById(R.id.details_img)).setImageResource((int)Integer.parseInt(extras.getString("image")));
            ((TextView) findViewById(R.id.details_age)).setText(extras.getString("age"));
            ((TextView) findViewById(R.id.details_name)).setText(extras.getString("name"));
            ((TextView) findViewById(R.id.details_email)).setText(extras.getString("email"));
            ((TextView) findViewById(R.id.details_contact)).setText(extras.getString("contact"));
        }
    }
}
