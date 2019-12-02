package id.oratakashi.ppdb.utils;

import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import id.oratakashi.ppdb.R;

public class ImageHelper {
    public static void getPicasso(ImageView imageView, String image_url){
        Picasso.get().load(image_url)
                .placeholder(R.drawable.img_no_images)
                .error(R.drawable.img_no_images)
                .into(imageView, new Callback() {
                    @Override
                    public void onSuccess() {

                    }

                    @Override
                    public void onError(Exception e) {
                        Log.e("Picasso", e.getMessage());
                    }
                });
    }
}
