package com.example.adarsh.spacein;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        final Button bHomepage = (Button) findViewById(R.id.bHomePage);
        final Button bHelp = (Button) findViewById(R.id.bHelp);
        final Button bSettings = (Button) findViewById(R.id.bSettings);

        bHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent userAreaintent = new Intent(IndexActivity.this, UserAreaActivity.class);
                IndexActivity.this.startActivity(userAreaintent);
            }
        });
    }
}
