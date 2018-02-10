package com.example.chandanasrinivas.arithmos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static java.lang.Math.floor;

public class Main3Activity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    EditText et = (EditText)findViewById(R.id.et);
    DatabaseReference reference = database.getReference("Ashika");
    Long score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("in fire","here");



        Intent intent = new Intent(Main3Activity.this,Main3Activity.class);
        score = intent.getLongExtra("Score",0);


    }

    public void click(View view) {

      //  String name = et.getText().toString();
        reference.child("Ashika").setValue(floor(score/1000));
        Toast.makeText(this, "Uploaded", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(Main3Activity.this,Main4Activity.class);
        startActivity(i);

    }
}
