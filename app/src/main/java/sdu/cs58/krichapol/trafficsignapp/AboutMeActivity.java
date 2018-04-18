package sdu.cs58.krichapol.trafficsignapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutMeActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }//end onCreate

    public void clickBack(View view) {
        finish();
    }//end clickBack

    public void playSound(View view) {
        if (mediaPlayer != null) {//ตรวจสอบว่ามี obj mediaPlay เล่นอยู่รึป่าว
            mediaPlayer.stop(); // ถ้ามี ให้หยุดเล่น
            mediaPlayer.release(); //คืน resource ที่ mediaPlayer เดิมให้กับระบบ
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.bird);
        mediaPlayer.start();
    }//end playSound

    public void clickFacebook(View view) {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("https://www.facebook.com/UltimaTar.The.Hedgehog"));
        startActivity(fbIntent);
    }//end clickFacebook

    public void clickMobile(View view) {
        Intent mobileIntent = new Intent(Intent.ACTION_DIAL);
        mobileIntent.setData(Uri.parse("tel:0971011835"));
        startActivity(mobileIntent);
    }//end clickMobile

    public void clickMap(View view){
        String lat = "13.77604";
        String lng = "100.510835";
        String label = "มหาวิทยาลัยสวนดุสิต";

        Uri location = Uri.parse("https://maps.google.com/maps?z=10&q=loc:" + lat + "," + lng + "(" + label + ")");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        mapIntent.setPackage("com.google.android.apps.maps"); //ใช้ Test บน Genymotion ไม่ได้
        startActivity(mapIntent);
    }
}//end class
