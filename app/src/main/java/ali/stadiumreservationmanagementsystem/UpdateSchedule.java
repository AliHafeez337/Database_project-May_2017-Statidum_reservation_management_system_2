package ali.stadiumreservationmanagementsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateSchedule extends AppCompatActivity implements View.OnClickListener{

    private Button btn;
    private EditText txt1, txt2, txt3, txt4, txt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_schedule);

        txt1=(EditText)findViewById(R.id.txt1);
        txt2=(EditText)findViewById(R.id.txt2);
        txt3=(EditText)findViewById(R.id.txt3);
        txt4=(EditText)findViewById(R.id.txt4);
        txt5=(EditText)findViewById(R.id.txt5);
        btn= (Button)findViewById(R.id.btn);

        txt1.setOnClickListener(this);
        txt2.setOnClickListener(this);
        txt3.setOnClickListener(this);
        txt4.setOnClickListener(this);
        txt5.setOnClickListener(this);
        btn.setOnClickListener(this);
    }
    public  void onClick(View v){
        if(v.getId() == R.id.btn){

        }
    }
}
