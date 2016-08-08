package edu.desu.the_gallery;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class mainPage extends AppCompatActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        ImageView profile = (ImageView) findViewById(R.id.imageView);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent freeIntent = new Intent(context, Selection.class);

                startActivity(freeIntent);

            }

        });

        ImageView profile2 = (ImageView) findViewById(R.id.imageView2);
        profile2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent free2Intent = new Intent(context, Selection2.class);
                startActivity(free2Intent);
            }
        });

    }
}



