package ali.stadiumreservationmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class admin extends AppCompatActivity implements View.OnClickListener{

    private Button btn1, btn2, btn3, btn4, btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v.getId() == R.id.btn1){
            Intent in = new Intent("ali.stadiumreservationmanagementsystem.Profile");
            startActivity(in);
        }
        if(v.getId() == R.id.btn2){
            Intent in = new Intent("ali.stadiumreservationmanagementsystem.UpdateSchedule");
            startActivity(in);
        }
        if(v.getId() == R.id.btn3){
            //ATTENTIO......!!!!
            //here first, admin has to take the details of a customer and then reserve a seat for him
            //HOW WE WILL DO THAT........?????
            Intent in = new Intent("ali.stadiumreservationmanagementsystem.Reserve");
            startActivity(in);
        }
        if(v.getId() == R.id.btn4){
            onBackPressed();
        }
        if(v.getId()  == R.id.btn5){
            Intent in = new Intent("ali.stadiumreservationmanagementsystem.RemoveCustomer");
            startActivity(in);
        }
    }
}
