package com.example.app_addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText t1, t2;
    TextView ans;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.T1);
        t2 = findViewById(R.id.T2);
        ans = findViewById(R.id.ans);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(view -> {
            String s1 = t1.getText().toString();
            String s2 = t2.getText().toString();
            if(s1.equals(""))
            {
                Toast toast=Toast.makeText(this,"Pls enter a number",Toast.LENGTH_SHORT);
                toast.show();
            }
            else if(s2.equals(""))
            {
                Toast toast=Toast.makeText(this,"pls enter a number",Toast.LENGTH_SHORT);
                toast.show();
            }
            else
            {
                int i1 = Integer.parseInt(s1);
                int i2 = Integer.parseInt(s2);
                int sum = i1+i2;
                ans.setText(String.valueOf(sum));
            }
        });
    }
}