package ali.stadiumreservationmanagementsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Profile extends AppCompatActivity implements View.OnClickListener{

    private TextView txt2,txt4, txt6, txt8, txt10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        txt2 = (TextView)findViewById(R.id.txt2);
        txt4 = (TextView)findViewById(R.id.txt4);
        txt6 = (TextView)findViewById(R.id.txt6);
        txt8 = (TextView)findViewById(R.id.txt8);
        txt10 = (TextView)findViewById(R.id.txt10);
        txt2.setOnClickListener(this);
        txt4.setOnClickListener(this);
        txt6.setOnClickListener(this);
        txt8.setOnClickListener(this);
        txt10.setOnClickListener(this);
    }
    public void onClick(View v){

    }
}
