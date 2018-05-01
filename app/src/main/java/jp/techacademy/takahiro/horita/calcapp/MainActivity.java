package jp.techacademy.takahiro.horita.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText mEditText1;
    EditText mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mEditText1 = findViewById(R.id.editText1);
        mEditText2 = findViewById(R.id.editText2);

    }

    @Override
    public void onClick(View v) {
        float float1 = Float.parseFloat(mEditText1.getText().toString());
        float float2 = Float.parseFloat(mEditText2.getText().toString());
        float answer = 0;

        if (v.getId() == R.id.button1) {
            answer = float1 + float2;

        } else if (v.getId() == R.id.button2) {
            answer = float1 - float2;

        } else if (v.getId() == R.id.button3) {
            answer = float1 * float2;

        } else if (v.getId() == R.id.button4) {
            answer = float1 / float2;
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE1", answer);
        startActivity(intent);
    }
}
