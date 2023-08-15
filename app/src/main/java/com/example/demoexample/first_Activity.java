package com.example.demoexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class first_Activity extends AppCompatActivity {
    EditText edtId,edtName;
    RadioButton radMale,radFemale;
    Spinner spProgram;
    TextView txtResult;
    Button btnSubmit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        edtId=findViewById(R.id.edtId);
        edtName=findViewById(R.id.edtName);
        radMale=findViewById(R.id.radMale);
        radFemale=findViewById(R.id.radFemale);
        spProgram=findViewById(R.id.spProgram);
        txtResult=findViewById(R.id.txtResult);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id=edtId.getText().toString();
                String name =edtName.getText().toString();
                String gender="";
                if(radMale.isChecked())
                    gender="Male";
                else
                    gender="Female";

                String program=spProgram.getSelectedItem().toString();
                txtResult.setText("student Id="+id +"\n" +"Student Name="+name+"\n"+ "program="+program);

            }
        });

    }
}