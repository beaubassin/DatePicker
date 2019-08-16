package com.bita.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button buttonChoose;
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker=(DatePicker) findViewById(R.id.datePicker);
        buttonChoose=(Button)findViewById(R.id.btnChoose);

        Toast.makeText(this, "Current Date: "+getCurrentDate(), Toast.LENGTH_SHORT).show();
        
        buttonChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "The selected date was: "+getCurrentDate(), Toast.LENGTH_SHORT).show();

            }
        });
        
    }

    //Getting selected Date from the DatePicker:
    public String getCurrentDate(){
        StringBuilder builder=new StringBuilder();;
        //Getting the Month
        builder.append((datePicker.getMonth() + 1)+"/");//month is 0 based
        //Getting the Day
        builder.append(datePicker.getDayOfMonth()+"/");
        //Getting the Year
        builder.append(datePicker.getYear());
        return builder.toString();
    }

}
