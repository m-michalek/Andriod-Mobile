package com.example.sonja.ui;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class NeueFahrt2 extends AppCompatActivity implements View.OnClickListener{

    Button btn_datepicker_FrAb, btn_timepicker_FrAb;
    EditText txt_date_FrAb, txt_time_FrAb;
    private int mYear, mMonth, mDay, mHour, mMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neue_fahrt2);

        btn_datepicker_FrAb=(Button)findViewById(R.id.btn_datepicker_FrAb);
        btn_timepicker_FrAb=(Button)findViewById(R.id.btn_timepicker_FrAb);
        txt_date_FrAb=(EditText)findViewById(R.id.txt_date_FrAb);
        txt_time_FrAb=(EditText)findViewById(R.id.txt_time_FrAb);

        btn_datepicker_FrAb.setOnClickListener(this);
        btn_timepicker_FrAb.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v == btn_datepicker_FrAb) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            txt_date_FrAb.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
        if (v == btn_timepicker_FrAb) {

            // Get Current Time
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            // Launch Time Picker Dialog
            TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {

                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay,
                                              int minute) {

                            txt_time_FrAb.setText(hourOfDay + ":" + minute);
                        }
                    }, mHour, mMinute, false);
            timePickerDialog.show();
        }
    }
}
