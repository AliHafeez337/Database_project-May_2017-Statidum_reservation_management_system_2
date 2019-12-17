package ali.stadiumreservationmanagementsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.view.*;

public class Credit extends AppCompatActivity implements View.OnClickListener{
    private TextView txtV2, txtV3, txtV4, txtV5;
    private EditText txt1, txt2, txt3, txt4;
    private Button btn1;
    public String a,b,c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);

        txtV2 = (TextView)findViewById(R.id.txtV2);
        txtV3 = (TextView)findViewById(R.id.txtV3);
        txtV4 = (TextView)findViewById(R.id.txtV4);
        txtV5 = (TextView)findViewById(R.id.txtV5);
        txt1 = (EditText)findViewById(R.id.txt1);
        txt2 = (EditText)findViewById(R.id.txt2);
        txt3 = (EditText)findViewById(R.id.txt3);
        txt4 = (EditText)findViewById(R.id.txt4);
/*
        a= Integer.parseInt(txt1.getText().toString());
        b= Integer.parseInt(txt2.getText().toString());
        c= Integer.parseInt(txt3.getText().toString());
        d= Integer.parseInt(txt4.getText().toString());
*/
        a= txt1.getText().toString();
        b= txt2.getText().toString();
        c= txt3.getText().toString();
        d= txt4.getText().toString();

        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v.getId()== R.id.btn1){
            txtV2.setText(a);
            txtV3.setText(b);
            txtV4.setText(c);
            txtV5.setText(d);
/*
            txtV2.setText(Integer.toString(a));
            txtV3.setText(Integer.toString(b));
            txtV4.setText(Integer.toString(c));
            txtV5.setText(Integer.toString(d));
*/
        }
    }
}
