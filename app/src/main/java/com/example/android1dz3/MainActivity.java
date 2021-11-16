package com.example.android1dz3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
   private TextInputEditText et1, et2, et3;
   private   Button bt_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.bem1);
        et2 = findViewById(R.id.bem2);
        et3 = findViewById(R.id.bem3);
        bt_send = findViewById(R.id.button_send);
        ConstraintLayout constraintLayout = findViewById(R.id.background);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();


        bt_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("mailto:" + et1.getText().toString()));
                intent.putExtra(Intent.EXTRA_SUBJECT, et2.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, et3.getText().toString());
                startActivity(intent);
            }
        });






    }

}