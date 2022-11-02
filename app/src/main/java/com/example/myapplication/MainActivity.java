package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvinfo;
    EditText etInput;
    Button bControl;
    int guess = (int) (Math.random() * 100);
    boolean gameFinished = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvinfo = findViewById(R.id.textView);
        etInput = findViewById(R.id.editTextTextPersonName);
        bControl = findViewById(R.id.button);

    }
    public void onClick(){
     if (!gameFinished){
         int inp=Integer.parseInt(etInput.getText().toString());
         if (inp > guess)
             tvinfo.setText("Перелет");
         if (inp < guess)
             tvinfo.setText("Недалет");
         if (inp==guess){
             tvinfo.setText("В точку");
             bControl.setText("Сыграть еще");
             gameFinished=true;
         }
     }
     else{
         guess = (int)(Math.random()*100);
         bControl.setText("Ввести значения");
         tvinfo.setText("Попробуйте угадать число(1 - 100)");
         gameFinished = false;
     }
     etInput.setText("");
    }
}
