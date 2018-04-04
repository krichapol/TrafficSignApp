package sdu.cs58.krichapol.trafficsignapp;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    TextView titleTextView,detailTextView;
    ImageView signImageView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Initial View
        titleTextView = findViewById(R.id.txvTitle);
        detailTextView = findViewById(R.id.txvDetail);
        signImageView = findViewById(R.id.imvSign);
    }//end onCreate Method
}//end Class
