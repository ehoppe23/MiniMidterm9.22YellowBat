package edu.up.mm5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.minimidterm922.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Artwork art = findViewById(R.id.sf_art);
        Toggler tog = new Toggler(art);

        Button pushMeButton = findViewById(R.id.but_push);
        pushMeButton.setOnClickListener(tog);
    }
}