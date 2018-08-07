package sg.edu.rp.webservices.p12_mydatabook;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.content.Context;

import com.squareup.picasso.Picasso;

public class AuthorActivity extends AppCompatActivity {

    ActionBar ab;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);

        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        iv = (ImageView)findViewById(R.id.image);
        //iv.setImageResource(R.drawable.ajax_loader);

        String iurl = "https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg";

        //Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg").into(iv);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //action

            }
        });


    }
}
