package br.com.lsdm.myapplicationcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText t1;
    private  EditText t2;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.editText1);
        t2 = findViewById(R.id.editText2);

        tv = findViewById(R.id.editTextResult);
    }

    public void calcular(View view) {

        int v1 = Integer.parseInt(t1.getText().toString());
        int v2 = Integer.parseInt(t2.getText().toString());

        tv.setText(String.valueOf(v1+v2));

        t1.setText("");
        t2.getText().clear();

        t1.requestFocus();

    }
}