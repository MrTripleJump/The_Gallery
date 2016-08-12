package edu.desu.the_gallery;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by dsuappacademy on 8/2/16.
 */
public class CustomSwipeAdapter extends PagerAdapter {
    Context ctx;
    private int[] image_resource;
    private int[] caption;
    private int[] caption1;
    private LayoutInflater layoutInflater;
    private int[] price;
    public CustomSwipeAdapter(Context ctx,int[] image_resource, int[] caption, int[] caption1, int[] price)
    {
        this.caption = caption;
        this.caption1 = caption1;
        this.price = price;
        this.ctx = ctx;
        this.image_resource = image_resource;

    }

    public CustomSwipeAdapter(Context ctx,int[] image_resource, int[] caption, int[] caption1)
    {
        this.caption = caption;
        this.caption1 = caption1;
        this.ctx = ctx;
        this.image_resource = image_resource;

    }
    @Override
    public int getCount() {
        return image_resource.length;
    }


    @Override
    public boolean isViewFromObject(View view, Object o) {
        return (view==(RelativeLayout)o);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        TextView c;
        TextView cc;
        TextView cccc;

        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        c = (TextView) item_view.findViewById(R.id.caption);
        c.setText(caption[position]);

        cc = (TextView) item_view.findViewById(R.id.caption1);
        cc.setText(caption1[position]);

        if(price != null){
            cccc =(TextView) item_view.findViewById(R.id.caption12);
            cccc.setText(price[position]);
        }



        ImageView imageView = (ImageView)item_view.findViewById(R.id.image_view);
        imageView.setImageResource(image_resource[position]);
        container.addView(item_view);

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}
