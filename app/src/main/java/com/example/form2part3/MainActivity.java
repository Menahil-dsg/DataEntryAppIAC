package com.example.form2part3;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.form2part3.Database.DatabaseHelper;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper helper;
    SQLiteDatabase db;
    LinearLayout panelLayout,panelLayout1, panelLayout2, panelLayout3, panelLayout4, panelLayout5, panelLayout6 ;
    CheckBox chkNo, chkNo1,chkNo2, chkNo3, chkNo4, chkNo5, chkNo6;
    EditText Q111,Q112,Q121,Q122,Q131,Q132, Q211,Q212,Q221,Q222,Q231,Q232, Q311,Q312,Q321,Q322,Q331,Q332, Q411,Q412,Q421,Q422,Q431,Q432,Q511,Q512,Q521,Q522,Q531,Q532, Q611,Q612,Q621,Q622,Q631,Q632, Q711,Q712,Q721,Q722,Q731,Q732;
    ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        panelLayout =  findViewById(R.id.panelLayout);
        panelLayout1 = findViewById(R.id.panelLayout1);
       // panelLayout2 = findViewById(R.id.panelLayout2);
        panelLayout2 = findViewById(R.id.panelLayout2);
        panelLayout3 = findViewById(R.id.panelLayout3);
        panelLayout4 = findViewById(R.id.panelLayout4);
        panelLayout5 = findViewById(R.id.panelLayout5);
        panelLayout6 = findViewById(R.id.panelLayout6);



        chkNo = findViewById(R.id.chkNo);
        chkNo1 = findViewById(R.id.chkNo1);
        chkNo2 = findViewById(R.id.chkNo2);
        chkNo3 = findViewById(R.id.chkNo3);
        chkNo4 = findViewById(R.id.chkNo4);
        chkNo5 = findViewById(R.id.chkNo5);
        chkNo6 = findViewById(R.id.chkNo6);

        Q111 = findViewById(R.id.Q111);
        Q112 = findViewById(R.id.Q112);
        Q121 = findViewById(R.id.Q121);
        Q122 = findViewById(R.id.Q122);
        Q131 = findViewById(R.id.Q131);
        Q132 = findViewById(R.id.Q132);

        Q211 = findViewById(R.id.Q211);
        Q212 = findViewById(R.id.Q212);
        Q221 = findViewById(R.id.Q221);
        Q222 = findViewById(R.id.Q222);
        Q231 = findViewById(R.id.Q231);
        Q232 = findViewById(R.id.Q232);

        Q311 = findViewById(R.id.Q311);
        Q312 = findViewById(R.id.Q312);
        Q321 = findViewById(R.id.Q321);
        Q322 = findViewById(R.id.Q322);
        Q331 = findViewById(R.id.Q331);
        Q332 = findViewById(R.id.Q332);

        Q411 = findViewById(R.id.Q411);
        Q412 = findViewById(R.id.Q412);
        Q421 = findViewById(R.id.Q421);
        Q422 = findViewById(R.id.Q422);
        Q431 = findViewById(R.id.Q431);
        Q432 = findViewById(R.id.Q432);

        Q511 = findViewById(R.id.Q511);
        Q512 = findViewById(R.id.Q512);
        Q521 = findViewById(R.id.Q521);
        Q522 = findViewById(R.id.Q522);
        Q531 = findViewById(R.id.Q531);
        Q532 = findViewById(R.id.Q532);

        Q611 = findViewById(R.id.Q611);
        Q612 = findViewById(R.id.Q612);
        Q621 = findViewById(R.id.Q621);
        Q622 = findViewById(R.id.Q622);
        Q631 = findViewById(R.id.Q631);
        Q632 = findViewById(R.id.Q632);

        helper = new DatabaseHelper(getApplicationContext());
        db = helper.getWritableDatabase();

        chkNo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    panelLayout.setVisibility(View.GONE);
                    Q111.setText("");
                    Q112.setText("");
                    Q121.setText("");
                    Q122.setText("");
                    Q131.setText("");
                    Q132.setText("");

                }
                else
                    panelLayout.setVisibility(View.VISIBLE);

            }
        });





        chkNo1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    panelLayout1.setVisibility(View.GONE);

                    Q211.setText("");
                    Q212.setText("");
                    Q221.setText("");
                    Q222.setText("");
                    Q231.setText("");
                    Q232.setText("");
                }
                else
                    panelLayout1.setVisibility(View.VISIBLE);

            }
        });



        chkNo2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    panelLayout2.setVisibility(View.GONE);

                    Q311.setText("");
                    Q312.setText("");
                    Q321.setText("");
                    Q322.setText("");
                    Q331.setText("");
                    Q332.setText("");
                }
                else
                    panelLayout2.setVisibility(View.VISIBLE);

            }
        });


        chkNo3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    panelLayout3.setVisibility(View.GONE);

                    Q411.setText("");
                    Q412.setText("");
                    Q421.setText("");
                    Q422.setText("");
                    Q431.setText("");
                    Q432.setText("");
                }
                else
                    panelLayout3.setVisibility(View.VISIBLE);

            }
        });


        chkNo4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    panelLayout4.setVisibility(View.GONE);

                    Q511.setText("");
                    Q512.setText("");
                    Q521.setText("");
                    Q522.setText("");
                    Q531.setText("");
                    Q532.setText("");
                }
                else
                    panelLayout4.setVisibility(View.VISIBLE);

            }
        });


        chkNo5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    panelLayout5.setVisibility(View.GONE);

                    Q611.setText("");
                    Q612.setText("");
                    Q621.setText("");
                    Q622.setText("");
                    Q631.setText("");
                    Q632.setText("");
                }
                else
                    panelLayout5.setVisibility(View.VISIBLE);

            }
        });


        chkNo6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    panelLayout6.setVisibility(View.GONE);

                    Q711.setText("");
                    Q712.setText("");
                    Q721.setText("");
                    Q722.setText("");
                    Q731.setText("");
                    Q732.setText("");
                }
                else
                    panelLayout6.setVisibility(View.VISIBLE);

            }
        });



    }


    public void AddFormData(View view) {




    }



    public void AddFormData1(View view) {

        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.C1, Q111.getText().toString());
        values.put(DatabaseHelper.C2, Q112.getText().toString());
        values.put(DatabaseHelper.C3, Q121.getText().toString());
        values.put(DatabaseHelper.C4, Q122.getText().toString());
        values.put(DatabaseHelper.C5, Q131.getText().toString());
        values.put(DatabaseHelper.C6, Q132.getText().toString());
        values.put(DatabaseHelper.C7, Q211.getText().toString());
        values.put(DatabaseHelper.C8, Q212.getText().toString());
        values.put(DatabaseHelper.C9, Q221.getText().toString());
        values.put(DatabaseHelper.C10, Q222.getText().toString());
        values.put(DatabaseHelper.C11, Q231.getText().toString());
        values.put(DatabaseHelper.C12, Q232.getText().toString());
        values.put(DatabaseHelper.C13, Q311.getText().toString());
        values.put(DatabaseHelper.C14, Q312.getText().toString());
        values.put(DatabaseHelper.C15, Q321.getText().toString());
        values.put(DatabaseHelper.C16, Q322.getText().toString());
        values.put(DatabaseHelper.C17, Q331.getText().toString());
        values.put(DatabaseHelper.C18, Q332.getText().toString());

        values.put(DatabaseHelper.C19, Q411.getText().toString());
        values.put(DatabaseHelper.C20, Q412.getText().toString());
        values.put(DatabaseHelper.C21, Q421.getText().toString());
        values.put(DatabaseHelper.C22, Q422.getText().toString());
        values.put(DatabaseHelper.C23, Q431.getText().toString());
        values.put(DatabaseHelper.C24, Q432.getText().toString());


        values.put(DatabaseHelper.C25, Q511.getText().toString());
        values.put(DatabaseHelper.C26, Q512.getText().toString());
        values.put(DatabaseHelper.C27, Q521.getText().toString());
        values.put(DatabaseHelper.C28, Q522.getText().toString());
        values.put(DatabaseHelper.C29, Q531.getText().toString());
        values.put(DatabaseHelper.C30, Q532.getText().toString());

        values.put(DatabaseHelper.C31, Q611.getText().toString());
        values.put(DatabaseHelper.C32, Q612.getText().toString());
        values.put(DatabaseHelper.C33, Q621.getText().toString());
        values.put(DatabaseHelper.C34, Q622.getText().toString());
        values.put(DatabaseHelper.C35, Q631.getText().toString());
        values.put(DatabaseHelper.C36, Q632.getText().toString());

        values.put(DatabaseHelper.C37, Q711.getText().toString());
        values.put(DatabaseHelper.C38, Q712.getText().toString());
        values.put(DatabaseHelper.C39, Q721.getText().toString());
        values.put(DatabaseHelper.C40, Q722.getText().toString());
        values.put(DatabaseHelper.C41, Q731.getText().toString());
        values.put(DatabaseHelper.C42, Q732.getText().toString());










        long rows =   db.insert(DatabaseHelper.TABLE_PART3QUES1,null, values);
        Toast.makeText(getApplicationContext(), rows +" inserted", Toast.LENGTH_LONG).show();
    }
}




//اس گھرانے کا کل ملکیتی رقبہ// ایکڑ