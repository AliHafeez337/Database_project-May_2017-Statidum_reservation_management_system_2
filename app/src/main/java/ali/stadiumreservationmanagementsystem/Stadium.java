package ali.stadiumreservationmanagementsystem;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Stadium extends Activity implements View.OnClickListener{
    private RadioGroup grp1;
    private RadioButton rbtn1, rbtn2;
    private TextView txt2,txt4, txt6, txt8, txt10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stadium);

        
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
