package ali.stadiumreservationmanagementsystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Parking extends AppCompatActivity implements View.OnClickListener{

    private EditText txt1, txt2, txt3, txt4, txt5;
    private CheckBox chk1, chk2, chk3, chk4, chk5;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);
        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText)findViewById(R.id.txt2);
        txt3 = (EditText)findViewById(R.id.txt3);
        txt4 = (EditText)findViewById(R.id.txt4);
        txt5 = (EditText)findViewById(R.id.txt5);
        chk1 = (CheckBox)findViewById(R.id.chk1);
        chk2 = (CheckBox)findViewById(R.id.chk2);
        chk3 = (CheckBox)findViewById(R.id.chk3);
        chk4 = (CheckBox)findViewById(R.id.chk4);
        chk5 = (CheckBox)findViewById(R.id.chk5);
        button= (Button)findViewById(R.id.button2);

        txt1.setOnClickListener(this);
        txt2.setOnClickListener(this);
        txt3.setOnClickListener(this);
        txt4.setOnClickListener(this);
        txt5.setOnClickListener(this);
        chk1.setOnClickListener(this);
        chk2.setOnClickListener(this);
        chk3.setOnClickListener(this);
        chk4.setOnClickListener(this);
        chk5.setOnClickListener(this);
        button.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v.getId() == R.id.button2){

        }
    }
}
