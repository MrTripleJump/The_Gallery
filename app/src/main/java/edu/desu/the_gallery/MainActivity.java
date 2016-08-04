package edu.desu.the_gallery;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.StringDef;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private CustomSwipeAdapter adapter;
    private int[] image_resource;
    private int[] caption;
    private int[] caption1;
    private ShareActionProvider mShareActionProvider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        image_resource = new int[] {R.drawable.skyline, R.drawable.independence2, R.drawable.theater, R.drawable.trainstation};
        caption = new int[] {R.string.skyline_summary, R.string.hall_summary, R.string.theater_summary, R.string.station_summary};
        caption1 = new int[] {R.string.summary1, R.string.summary1, R.string.summary1, R.string.summary1};

        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new CustomSwipeAdapter(this, caption, image_resource, caption1);
        viewPager.setAdapter(adapter);}

            public void contact(View target) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Im interested in your work ");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }// Do stuff
            }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate menu resource file.
        getMenuInflater().inflate(R.menu.share, menu);

        // Locate MenuItem with ShareActionProvider
        MenuItem item = menu.findItem(R.id.menu_item_share);

        // Fetch and store ShareActionProvider
        mShareActionProvider = (ShareActionProvider) item.getActionProvider();

        // Return true to display menu
        return true;
    }

    // Call to update the share intent
    private void setShareIntent(Intent shareIntent) {
        if (mShareActionProvider != null) {
            mShareActionProvider.setShareIntent(shareIntent);
        }
    }

    }

