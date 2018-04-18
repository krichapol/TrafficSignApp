package sdu.cs58.krichapol.trafficsignapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }//end onCreate

    public void Back(View view) {
        Intent backIntent = new Intent(AboutMeActivity.this, MainActivity.class);
        startActivity(backIntent);
    }
}//end class
