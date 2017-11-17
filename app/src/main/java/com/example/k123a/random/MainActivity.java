package com.example.k123a.random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plus(View view) {
        EditText num1 = (EditText) this.findViewById(R.id.num1);
        String s_num1 = num1.getText().toString();
        EditText num2 = (EditText) this.findViewById(R.id.num2);
        String s_num2 = num2.getText().toString();
        TextView out = (TextView) this.findViewById(R.id.out);
        out.setText(""+(Double.parseDouble(s_num1)+Double.parseDouble(s_num2)));
    }

    public void minus(View view) {
        EditText num1 = (EditText) this.findViewById(R.id.num1);
        String s_num1 = num1.getText().toString();
        EditText num2 = (EditText) this.findViewById(R.id.num2);
        String s_num2 = num2.getText().toString();
        TextView out = (TextView) this.findViewById(R.id.out);
        out.setText(""+(Double.parseDouble(s_num1)-Double.parseDouble(s_num2)));
    }

    public void mul(View view) {EditText num1 = (EditText) this.findViewById(R.id.num1);
        String s_num1 = num1.getText().toString();
        EditText num2 = (EditText) this.findViewById(R.id.num2);
        String s_num2 = num2.getText().toString();
        TextView out = (TextView) this.findViewById(R.id.out);
        out.setText(""+(Double.parseDouble(s_num1)*Double.parseDouble(s_num2)));
    }

    public void del(View view) {
        EditText num1 = (EditText) this.findViewById(R.id.num1);
        String s_num1 = num1.getText().toString();
        EditText num2 = (EditText) this.findViewById(R.id.num2);
        String s_num2 = num2.getText().toString();
        TextView out = (TextView) this.findViewById(R.id.out);
        out.setText(""+(Double.parseDouble(s_num1)/Double.parseDouble(s_num2)));
    }
}
