package edu.desu.the_gallery;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PhotoActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private CustomSwipeAdapter2 adapter;
    private int[] image_resource;
    private int[] caption;
    private int[] caption1;
    private int[] caption12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        image_resource = new int[] {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5};
        caption = new int[] {R.string.photo_title1, R.string.photo_title2, R.string.photo_title3, R.string.photo_title4, R.string.photo_title5};
        caption1 = new int[] {R.string.photo_sum1, R.string.photo_sum2, R.string.photo_sum3, R.string.photo_sum4, R.string.photo_sum5};
        caption12 = new int[] {R.string.MUA_sum1, R.string.MUA_sum2, R.string.MUA_title3, R.string.MUA_title4, R.string.MUA_title5};

        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new CustomSwipeAdapter2(this,image_resource,caption, caption1, caption12);
        viewPager.setAdapter(adapter);

    }
    public void contact(View target) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"+"demitriusramirez@gmail.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Im interested in your work ");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }// Do stuff
    }
    public void share(View target) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Hey check out this artwork. I really think you would like it");
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }

    public void website (View target){
        Intent website = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/site/demitriusramirezportfolio/"));

        startActivity(website);
    }
}