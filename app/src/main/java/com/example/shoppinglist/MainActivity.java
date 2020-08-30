package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleText1(View v) {
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        ((TextView)findViewById(R.id.item1)).setText(input);
        Log.d("info", input);

        ((TextView)findViewById(R.id.item1)).setVisibility(View.VISIBLE);
        v.setEnabled(false);
        Button b = (Button) v;
        b.setText("ADDED");
        t.setText("");

        Toast myToast = Toast.makeText(getApplicationContext(), input+" added!", Toast.LENGTH_LONG);
        myToast.show();
    }
    public void handleText2(View v) {
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        ((TextView) findViewById(R.id.item2)).setText(input);
        Log.d("info", input);

        ((TextView)findViewById(R.id.item2)).setVisibility(View.VISIBLE);
        v.setEnabled(false);
        Button b = (Button) v;
        b.setText("ADDED");
        t.setText("");

        Toast myToast = Toast.makeText(getApplicationContext(), input+" added!", Toast.LENGTH_LONG);
        myToast.show();
    }
    public void handleText3(View v) {
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        ((TextView) findViewById(R.id.item3)).setText(input);
        Log.d("info", input);

        ((TextView)findViewById(R.id.item3)).setVisibility(View.VISIBLE);
        v.setEnabled(false);
        Button b = (Button) v;
        b.setText("ADDED");
        t.setText("");

        Toast myToast = Toast.makeText(getApplicationContext(), input+" added!", Toast.LENGTH_LONG);
        myToast.show();
    }
    public void handleText4(View v) {
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        ((TextView) findViewById(R.id.item4)).setText(input);
        Log.d("info", input);

        ((TextView)findViewById(R.id.item4)).setVisibility(View.VISIBLE);
        v.setEnabled(false);
        Button b = (Button) v;
        b.setText("ADDED");
        t.setText("");

        Toast myToast = Toast.makeText(getApplicationContext(), input+" added!", Toast.LENGTH_LONG);
        myToast.show();
    }
    public void reboot(View v) {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }
    // launch new window/activity. ''SettingsActivity'' is the activity we created, can be found in the java folder!
    public void lauchActivity(View v) {
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }
}