package edu.desu.the_gallery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by dsuappacademy on 8/4/16.
 */
public class Selection2 extends MainActivity {
    final Context context2 = this;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_selection_2);

        FrameLayout selections = (FrameLayout) findViewById(R.id.photography);
        selections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent photoIntent = new Intent(context2, PhotoActivity.class);
                startActivity(photoIntent);
            }
        });

    }
}
