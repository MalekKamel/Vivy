package com.vivy.app.shared.util.io;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;

import androidx.core.graphics.BitmapCompat;

import com.vivy.app.shared.util.app.MyApp;

public class BitmapUtil {


    public static int sizeWithoutAllocationInMega(int image){
        BitmapFactory.Options options = new BitmapFactory.Options();
        // If set to true, the decoder will return null (no bitmap), but the out... fields will still
        // be set, allowing the caller to query the bitmap without having to allocate the memory for its pixels.
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(MyApp.context.getResources(), image, options);
        int imageHeight = options.outHeight;
        int imageWidth = options.outWidth;
        String imageType = options.outMimeType; // .jpg .png .gif
        return imageWidth * imageHeight;
    }

    public static long size(Bitmap bitmap){
        return BitmapCompat.getAllocationByteCount(bitmap);
    }

    public static Bitmap empty(){
        return Bitmap.createBitmap(
                1,
                1,
                Bitmap.Config.ARGB_8888
        );
    }

    public static Bitmap from(Intent intent) {
        return from(intent.getData());
    }

    public static Bitmap from(Uri uri) {
        if (uri == null) return null;

        // Let's read picked image path using content resolver
        String[] filePath = { MediaStore.Images.Media.DATA };
        Cursor cursor = MyApp.context.getContentResolver().query(uri, filePath, null, null, null);

        if (cursor == null) return null;

        cursor.moveToFirst();
        String imagePath = cursor.getString(cursor.getColumnIndex(filePath[0]));

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmap = BitmapFactory.decodeFile(imagePath, options);

        // At the end remember to close the cursor or you will end with the RuntimeException!
        cursor.close();
        return bitmap;
    }

    public static Bitmap from(String path) {
        if (TextUtils.isEmpty(path)) return null;

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;

        return BitmapFactory.decodeFile(path, options);
    }


}
