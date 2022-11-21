package com.example.goodmorning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private TextView textView2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);
    }

    public void display(View view){
        String name = editText.getText().toString();
        Toast.makeText(this, "Hello,"+name+" "+"wish you a very good morning !", Toast.LENGTH_SHORT).show();
        textView2.setText("Good Morning, Have a nice day :"+ name +" "+"Everyone may not be good, but there is something good in everyday.");

    }
}