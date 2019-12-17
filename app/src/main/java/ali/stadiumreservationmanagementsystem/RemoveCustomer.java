package ali.stadiumreservationmanagementsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RemoveCustomer extends AppCompatActivity implements View.OnClickListener{

    private EditText txt1;
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_customer);

        txt1 = (EditText)findViewById(R.id.txt1);
        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v.getId() == R.id.btn1){

        }
    }
}
