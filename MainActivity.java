package com.example.practical_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n1;
    private EditText n2;
    private Button adds;
    private TextView anss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText)findViewById(R.id.et1);
        n2=(EditText)findViewById(R.id.et2);
        adds=(Button)findViewById(R.id.btn1);
        anss=(TextView)findViewById(R.id.ans);

        adds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(n1.getText().toString());
                int num2 =Integer.parseInt(n2.getText().toString());
                int sum =num1 +num2;
                anss.setText("Answer is:"+ String.valueOf(sum));
            }
        });

    }
}