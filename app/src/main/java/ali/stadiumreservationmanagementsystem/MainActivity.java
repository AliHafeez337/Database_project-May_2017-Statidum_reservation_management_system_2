package ali.stadiumreservationmanagementsystem;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.graphics.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn1,btn2, btn3;
    private EditText txt1, txtP1;
    private TextView txtV1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtV1 = (TextView)findViewById(R.id.txtV1);
        btn1 = (Button)findViewById(R.id.btn1);
        txt1 = (EditText)findViewById(R.id.txt1);
        txtP1 = (EditText)findViewById(R.id.txtP1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }
    public void onClick(View V){

        if (V.getId() == R.id.btn1)
        {
            Intent in = new Intent("ali.stadiumreservationmanagementsystem.schedule");
            startActivity(in);
        }
        else if (V.getId() == R.id.btn2)
        {

            String log = " successfull login";
            Toast.makeText(MainActivity.this, log, Toast.LENGTH_LONG).show();
            Intent in2 = new Intent("ali.stadiumreservationmanagementsystem.LogedIn");
            startActivity(in2);
        }
        else if (V.getId() == R.id.btn3)
        {
            Intent in3 = new Intent("ali.stadiumreservationmanagementsystem.createAccount");
            startActivity(in3);
        }
    }
}
