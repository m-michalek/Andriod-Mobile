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

public class NeueFahrt2 extends AppCompatActivity implements View.OnClickListener {

    Button btn_datepicker_FrAb, btn_timepicker_FrAb;
    EditText txt_date_FrAb, txt_time_FrAb;
    Button btn_datepicker_SpAn, btn_timepicker_SpAn;
    EditText txt_date_SpAn, txt_time_SpAn;
    private int mYear_FrAb, mMonth_FrAb, mDay_FrAb, mHour_FrAb, mMinute_FrAb;
    private int mYear_SpAn, mMonth_SpAn, mDay_SpAn, mHour_SpAn, mMinute_SpAn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neue_fahrt2);

        btn_datepicker_FrAb = (Button) findViewById(R.id.btn_datepicker_FrAb);
        btn_timepicker_FrAb = (Button) findViewById(R.id.btn_timepicker_FrAb);

        btn_datepicker_SpAn = (Button) findViewById(R.id.btn_datepicker_SpAn);
        btn_timepicker_SpAn = (Button) findViewById(R.id.btn_timepicker_SpAn);

        txt_date_FrAb = (EditText) findViewById(R.id.txt_date_FrAb);
        txt_time_FrAb = (EditText) findViewById(R.id.txt_time_FrAb);

        txt_date_SpAn = (EditText) findViewById(R.id.txt_date_SpAn);
        txt_time_SpAn = (EditText) findViewById(R.id.txt_time_SpAn);

        btn_datepicker_FrAb.setOnClickListener(this);
        btn_timepicker_FrAb.setOnClickListener(this);

        btn_datepicker_SpAn.setOnClickListener(this);
        btn_timepicker_SpAn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v == btn_datepicker_FrAb) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear_FrAb = c.get(Calendar.YEAR);
            mMonth_FrAb = c.get(Calendar.MONTH);
            mDay_FrAb = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog_FrAb = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            txt_date_FrAb.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear_FrAb, mMonth_FrAb, mDay_FrAb);
            datePickerDialog_FrAb.show();
        }
        if (v == btn_timepicker_FrAb) {

            // Get Current Time
            final Calendar c = Calendar.getInstance();
            mHour_FrAb = c.get(Calendar.HOUR_OF_DAY);
            mMinute_FrAb = c.get(Calendar.MINUTE);

            // Launch Time Picker Dialog
            TimePickerDialog timePickerDialog_FrAb = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {

                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay,
                                              int minute) {

                            txt_time_FrAb.setText(hourOfDay + ":" + minute);
                        }
                    }, mHour_FrAb, mMinute_FrAb, false);
            timePickerDialog_FrAb.show();
        }
// Späteste Ankunft
            if (v == btn_datepicker_SpAn) {

                // Get Current Date
                final Calendar c_SpAn = Calendar.getInstance();
                mYear_SpAn = c_SpAn.get(Calendar.YEAR);
                mMonth_SpAn = c_SpAn.get(Calendar.MONTH);
                mDay_SpAn = c_SpAn.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog datePickerDialog_SpAn = new DatePickerDialog(this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                txt_date_SpAn.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        }, mYear_SpAn, mMonth_SpAn, mDay_SpAn);
                datePickerDialog_SpAn.show();
            }
            if (v == btn_timepicker_SpAn) {

                // Get Current Time
                final Calendar c_SpAn = Calendar.getInstance();
                mHour_SpAn = c_SpAn.get(Calendar.HOUR_OF_DAY);
                mMinute_SpAn = c_SpAn.get(Calendar.MINUTE);

                // Launch Time Picker Dialog
                TimePickerDialog timePickerDialog_SpAn = new TimePickerDialog(this,
                        new TimePickerDialog.OnTimeSetListener() {

                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay,
                                                  int minute) {

                                txt_time_SpAn.setText(hourOfDay + ":" + minute);
                            }
                        }, mHour_SpAn, mMinute_SpAn, false);
                timePickerDialog_SpAn.show();
            }
        }

}