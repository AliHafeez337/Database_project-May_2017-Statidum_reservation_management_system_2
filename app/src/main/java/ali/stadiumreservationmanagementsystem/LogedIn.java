package ali.stadiumreservationmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class LogedIn extends AppCompatActivity implements View.OnClickListener{

    private Button btn1, btn2, btn3, btn4, btn5, btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loged_in);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4= (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }
    public void onClick(View V){

        if(V.getId()== R.id.btn1){
            Intent in = new Intent("ali.stadiumreservationmanagementsystem.Profile");
            startActivity(in);
        }
        if(V.getId()== R.id.btn2){
            onBackPressed();
        }
        if(V.getId()== R.id.btn3){
            Intent in = new Intent("ali.stadiumreservationmanagementsystem.Stadium");
            startActivity(in);
        }
        if(V.getId()== R.id.btn4){
            Intent in = new Intent("ali.stadiumreservationmanagementsystem.schedule");
            startActivity(in);
        }
        if(V.getId()== R.id.btn5){
            Intent in = new Intent("ali.stadiumreservationmanagementsystem.Reserve");
            startActivity(in);
        }

        if(V.getId()== R.id.btn6){
            Intent in= new Intent("ali.stadiumreservationmanagementsystem.Credit");
            startActivity(in);
        }
    }
}
