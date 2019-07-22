package koding.web.takeimageapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class singlephoto extends AppCompatActivity {
    ImageAdapter myImageAdapter;
    ArrayList<String> myList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singlephoto);

    String imgPath = this.getIntent().getExtras().getString("path");
    ImageView iv = (ImageView) findViewById(R.id.singleImage);
    BitmapFactory.Options myBitmap = new BitmapFactory.Options();
        myBitmap.inJustDecodeBounds=false;
                myBitmap.inSampleSize=4;
                myBitmap.inPurgeable=true;
                Bitmap bitmap = BitmapFactory.decodeFile(imgPath,myBitmap);
                iv.setImageBitmap(bitmap);

    }
}