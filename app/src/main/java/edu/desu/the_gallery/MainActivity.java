package edu.desu.the_gallery;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    CustomSwipeAdapter adapter;
     int[] image_resource;
     int[] caption;
    int[] caption1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        image_resource = new int[] {R.drawable.skyline, R.drawable.independence2, R.drawable.theater, R.drawable.trainstation};
        caption = new int[] {R.string.skyline_summary, R.string.hall_summary, R.string.theater_summary, R.string.station_summary};
        caption1 = new int[] {R.string.summary3, R.string.summary3, R.string.summary3, R.string.summary3};

        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new CustomSwipeAdapter(this, caption, image_resource, caption1);
        viewPager.setAdapter(adapter);

    }
}
