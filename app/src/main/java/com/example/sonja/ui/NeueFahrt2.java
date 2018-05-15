package com.example.sonja.ui;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
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
    Button btn_datepicker_FrAbR, btn_timepicker_FrAbR;
    EditText txt_date_FrAbR, txt_time_FrAbR;
    Button btn_datepicker_SpAnR, btn_timepicker_SpAnR;
    EditText txt_date_SpAnR, txt_time_SpAnR;
    Button btn_startSearch;
    private int mYear_FrAb, mMonth_FrAb, mDay_FrAb, mHour_FrAb, mMinute_FrAb;
    private int mYear_SpAn, mMonth_SpAn, mDay_SpAn, mHour_SpAn, mMinute_SpAn;
    private int mYear_FrAbR, mMonth_FrAbR, mDay_FrAbR, mHour_FrAbR, mMinute_FrAbR;
    private int mYear_SpAnR, mMonth_SpAnR, mDay_SpAnR, mHour_SpAnR, mMinute_SpAnR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neue_fahrt2);

        btn_datepicker_FrAb = findViewById(R.id.btn_datepicker_FrAb);
        btn_timepicker_FrAb = findViewById(R.id.btn_timepicker_FrAb);

        btn_datepicker_SpAn = findViewById(R.id.btn_datepicker_SpAn);
        btn_timepicker_SpAn = findViewById(R.id.btn_timepicker_SpAn);

        btn_datepicker_FrAbR = findViewById(R.id.btn_datepicker_FrAbR);
        btn_timepicker_FrAbR = findViewById(R.id.btn_timepicker_FrAbR);

        btn_datepicker_SpAnR = findViewById(R.id.btn_datepicker_SpAnR);
        btn_timepicker_SpAnR = findViewById(R.id.btn_timepicker_SpAnR);

        btn_startSearch = findViewById(R.id.btn_startSearch);

        txt_date_FrAb = findViewById(R.id.txt_date_FrAb);
        txt_time_FrAb = findViewById(R.id.txt_time_FrAb);

        txt_date_SpAn = findViewById(R.id.txt_date_SpAn);
        txt_time_SpAn = findViewById(R.id.txt_time_SpAn);

        txt_date_FrAbR = findViewById(R.id.txt_date_FrAbR);
        txt_time_FrAbR = findViewById(R.id.txt_time_FrAbR);

        txt_date_SpAnR = findViewById(R.id.txt_date_SpAnR);
        txt_time_SpAnR = findViewById(R.id.txt_time_SpAnR);

        btn_datepicker_FrAb.setOnClickListener(this);
        btn_timepicker_FrAb.setOnClickListener(this);

        btn_datepicker_SpAn.setOnClickListener(this);
        btn_timepicker_SpAn.setOnClickListener(this);

        btn_datepicker_FrAbR.setOnClickListener(this);
        btn_timepicker_FrAbR.setOnClickListener(this);

        btn_datepicker_SpAnR.setOnClickListener(this);
        btn_timepicker_SpAnR.setOnClickListener(this);

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
// Rückweg
        if (v == btn_datepicker_FrAbR) {

            // Get Current Date
            final Calendar c_FrAbR = Calendar.getInstance();
            mYear_FrAbR = c_FrAbR.get(Calendar.YEAR);
            mMonth_FrAbR = c_FrAbR.get(Calendar.MONTH);
            mDay_FrAbR = c_FrAbR.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog_FrAbR = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            txt_date_FrAbR.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear_FrAbR, mMonth_FrAbR, mDay_FrAbR);
            datePickerDialog_FrAbR.show();
        }
        if (v == btn_timepicker_FrAbR) {

            // Get Current Time
            final Calendar c_FrAbR = Calendar.getInstance();
            mHour_FrAbR = c_FrAbR.get(Calendar.HOUR_OF_DAY);
            mMinute_FrAbR = c_FrAbR.get(Calendar.MINUTE);

            // Launch Time Picker Dialog
            TimePickerDialog timePickerDialog_FrAbR = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {

                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay,
                                              int minute) {

                            txt_time_FrAbR.setText(hourOfDay + ":" + minute);
                        }
                    }, mHour_FrAbR, mMinute_FrAbR, false);
            timePickerDialog_FrAbR.show();
        }
// Späteste Ankunft
        if (v == btn_datepicker_SpAnR) {

            // Get Current Date
            final Calendar c_SpAnR = Calendar.getInstance();
            mYear_SpAn = c_SpAnR.get(Calendar.YEAR);
            mMonth_SpAn = c_SpAnR.get(Calendar.MONTH);
            mDay_SpAn = c_SpAnR.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog_SpAnR = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            txt_date_SpAnR.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear_SpAnR, mMonth_SpAnR, mDay_SpAnR);
            datePickerDialog_SpAnR.show();
        }
        if (v == btn_timepicker_SpAnR) {

            // Get Current Time
            final Calendar c_SpAnR = Calendar.getInstance();
            mHour_SpAnR = c_SpAnR.get(Calendar.HOUR_OF_DAY);
            mMinute_SpAnR = c_SpAnR.get(Calendar.MINUTE);

            // Launch Time Picker Dialog
            TimePickerDialog timePickerDialog_SpAnR = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {

                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay,
                                              int minute) {

                            txt_time_SpAnR.setText(hourOfDay + ":" + minute);
                        }
                    }, mHour_SpAnR, mMinute_SpAnR, false);
            timePickerDialog_SpAnR.show();
        }
        }

        // When clicking on back you get redirected to NeueFahrt1
        public void onBackPressed(){
            System.out.println("Neue Fahrt2 onBackPressed() aufgerufen.");
            Intent intent = new Intent(this, NeueFahrt1.class);
            startActivity(intent);
            this.finish();
        }

}