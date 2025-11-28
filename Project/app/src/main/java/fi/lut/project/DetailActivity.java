package fi.lut.project;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent in = getIntent();
        int index = in.getIntExtra("fi.lut.ITEM_INDEX", -1);

        if(index > -1){
            int pic = getImg(index);
            ImageView img = findViewById(R.id.imageView);
            scaleImg(img, pic);
        }
    }
    private int getImg(int index){
        switch(index){
            case 0: return R.drawable.baptism;
            case 1: return R.drawable.sitz;
            case 2: return R.drawable.sauna;
            case 3: return R.drawable.esn_overalls;
            case 4: return R.drawable.swimming;
            case 5: return R.drawable.icehockey;
            case 6: return R.drawable.porvo;
            case 7: return R.drawable.hiking;
            case 8: return R.drawable.pumpkin;
            case 9: return R.drawable.bakery;
            case 10: return R.drawable.food;
            case 11: return R.drawable.karaoke;
            case 12: return R.drawable.sweden;
            case 13: return R.drawable.pirates;
            case 14: return R.drawable.riga;
            case 15: return R.drawable.tallinn;

            default: return -1;
        }
    }
    private void scaleImg(ImageView img, int pic){
        Display screen = getWindowManager().getDefaultDisplay();
        BitmapFactory.Options options = new BitmapFactory.Options();

        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), pic, options);

        int imgWidth = options.outWidth;
        int screenWidth = screen.getWidth();

        if(imgWidth > screenWidth){
            int ratio = Math.round((float) imgWidth / (float) screenWidth);
            options.inSampleSize = ratio;
        }
        options.inJustDecodeBounds = false;
        Bitmap scaledImg = BitmapFactory.decodeResource(getResources(), pic, options);
        img.setImageBitmap(scaledImg);
    }

}
