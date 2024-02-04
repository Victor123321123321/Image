package com.example.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.io.IOException;
import java.net.URL;

public class Work extends Thread {
    ImageView view;
    public Bitmap image;
    URL imageURL;

    public Work(ImageView view) {
        this.view = view;
    }

    @Override
    public void run() {
        try {
            imageURL = new URL("https://www.w3schools.com/w3css/img_lights.jpg");
            image = BitmapFactory.decodeStream(imageURL.openConnection().getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
