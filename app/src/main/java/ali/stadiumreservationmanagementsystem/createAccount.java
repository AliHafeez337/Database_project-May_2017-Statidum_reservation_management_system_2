package ali.stadiumreservationmanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class createAccount extends Activity implements View.OnClickListener{

    private Button btn1;
    private TextView txtV1;
    private EditText txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10;
    private CheckBox chk1, chk2;
    private Boolean b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        btn1 = (Button) findViewById(R.id.btn1);
        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText) findViewById(R.id.txt2);
        txt3 = (EditText) findViewById(R.id.txt3);
        txt4 = (EditText) findViewById(R.id.txt4);
        txt5 = (EditText) findViewById(R.id.txt5);
        txt6 = (EditText) findViewById(R.id.txt6);
        txt7 = (EditText) findViewById(R.id.txt7);
        txt8 = (EditText) findViewById(R.id.txt8);
        txt9 = (EditText) findViewById(R.id.txt9);
        txt10 = (EditText) findViewById(R.id.txt10);
        chk1 = (CheckBox) findViewById(R.id.chk1);
        chk2 = (CheckBox) findViewById(R.id.chk2);

        chk1.setOnClickListener(this);
        chk2.setOnClickListener(this);
        if (txt1 != null && txt2 != null && txt3 != null && txt4 != null && txt5 != null
                && txt6 != null && txt7 != null && txt8 != null && txt9 != null && txt10 != null)
            b = true;
        else {
            b = false;
        }
        btn1.setOnClickListener(this);
    }
    public void onClick(View v) {

        if (v.getId() == R.id.btn1) {
            if (chk1.isChecked() && b && chk2.isChecked()==false) {
                Intent in = new Intent("ali.stadiumreservationmanagementsystem.Credit");
                startActivity(in);
            }
            else if (chk1.isChecked() && chk2.isChecked() && b){

            }
            else {
                String miss = "Please, Fill all necessary fields...!!!";
                Toast.makeText(createAccount.this, miss, Toast.LENGTH_LONG).show();

            }
        }
    }
}
