package ali.stadiumreservationmanagementsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class schedule extends AppCompatActivity  implements View.OnClickListener{

    private CheckBox chk1, chk2;
    private Button btn1;
    private EditText txt1,txt2, txt3, txt4, txt5;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        chk1 = (CheckBox)findViewById(R.id.chk1);
        chk2 = (CheckBox)findViewById(R.id.chk2);
        btn1 = (Button)findViewById(R.id.btn1);
        txt1 = (EditText)findViewById(R.id.txt1);
        txt2 = (EditText)findViewById(R.id.txt2);
        txt3 = (EditText)findViewById(R.id.txt3);
        txt4 = (EditText)findViewById(R.id.txt4);
        txt5 = (EditText)findViewById(R.id.txt5);

        chk1.setOnClickListener(this);
        chk2.setOnClickListener(this);
        btn1.setOnClickListener(this);
    }
    public void onClick (View v){
        if(v.getId() == R.id.btn1){
            if(chk1.isChecked() && chk2.isChecked()== false){

            }
            else if(chk2.isChecked() && chk1.isChecked() == false){

            }
            else{
                String notice = "Please, select team or match option in check box";
                Toast.makeText(schedule.this, notice, Toast.LENGTH_LONG).show();
            }
        }
    }
}
