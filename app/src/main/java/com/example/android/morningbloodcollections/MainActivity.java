package com.example.android.morningbloodcollections;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TextWatcher{

    TextView total, paketo;
    EditText aimolipsies0, aimolipsies1, aimolipsies2, aimolipsies3, aimolipsies4,
            aimolipsies5, aimolipsies6, aimolipsies7, aimolipsies8, aimolipsies9, aimolipsies10, atoma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        aimolipsies0 = (EditText) findViewById(R.id.aimolipsies0);
        aimolipsies1 = (EditText) findViewById(R.id.aimolipsies1);
        aimolipsies2 = (EditText) findViewById(R.id.aimolipsies2);
        aimolipsies3 = (EditText) findViewById(R.id.aimolipsies3);
        aimolipsies4 = (EditText) findViewById(R.id.aimolipsies4);
        aimolipsies5 = (EditText) findViewById(R.id.aimolipsies5);
        aimolipsies6 = (EditText) findViewById(R.id.aimolipsies6);
        aimolipsies7 = (EditText) findViewById(R.id.aimolipsies7);
        aimolipsies8 = (EditText) findViewById(R.id.aimolipsies8);
        aimolipsies9 = (EditText) findViewById(R.id.aimolipsies9);
        aimolipsies10 = (EditText) findViewById(R.id.aimolipsies10);
        total = (TextView) findViewById(R.id.total);
        atoma = (EditText) findViewById(R.id.atoma);
        paketo = (TextView) findViewById(R.id.paketo);

        aimolipsies0.addTextChangedListener(this);
        aimolipsies1.addTextChangedListener(this);
        aimolipsies2.addTextChangedListener(this);
        aimolipsies3.addTextChangedListener(this);
        aimolipsies4.addTextChangedListener(this);
        aimolipsies5.addTextChangedListener(this);
        aimolipsies6.addTextChangedListener(this);
        aimolipsies7.addTextChangedListener(this);
        aimolipsies8.addTextChangedListener(this);
        aimolipsies9.addTextChangedListener(this);
        aimolipsies10.addTextChangedListener(this);
        atoma.addTextChangedListener(this);

}

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        total.setText(addAimolipsies());
        paketo.setText(packet());
    }

    private String addAimolipsies(){
        int aimo0,aimo1,aimo2,aimo3,aimo4,aimo5,aimo6,aimo7,aimo8,aimo9,aimo10;

        if(!aimolipsies0.getText().toString().equals("") && aimolipsies0.getText().length() > 0) {
            aimo0 = Integer.parseInt(aimolipsies0.getText().toString());
        } else {
            aimo0 = 0;
        }
        if(!aimolipsies1.getText().toString().equals("") && aimolipsies1.getText().length() > 0) {
            aimo1 = Integer.parseInt(aimolipsies1.getText().toString());
        } else {
            aimo1 = 0;
        }
        if(!aimolipsies2.getText().toString().equals("") && aimolipsies2.getText().length() > 0) {
            aimo2 = Integer.parseInt(aimolipsies2.getText().toString());
        } else {
            aimo2 = 0;
        }
        if(!aimolipsies3.getText().toString().equals("") && aimolipsies3.getText().length() > 0) {
            aimo3 = Integer.parseInt(aimolipsies3.getText().toString());
        } else {
            aimo3 = 0;
        }
        if(!aimolipsies4.getText().toString().equals("") && aimolipsies4.getText().length() > 0) {
            aimo4 = Integer.parseInt(aimolipsies4.getText().toString());
        } else {
            aimo4 = 0;
        }
        if(!aimolipsies5.getText().toString().equals("") && aimolipsies5.getText().length() > 0) {
            aimo5 = Integer.parseInt(aimolipsies5.getText().toString());
        } else {
            aimo5 = 0;
        }
        if(!aimolipsies6.getText().toString().equals("") && aimolipsies6.getText().length() > 0) {
            aimo6 = Integer.parseInt(aimolipsies6.getText().toString());
        } else {
            aimo6 = 0;
        }
        if(!aimolipsies7.getText().toString().equals("") && aimolipsies7.getText().length() > 0) {
            aimo7 = Integer.parseInt(aimolipsies7.getText().toString());
        } else {
            aimo7 = 0;
        }
        if(!aimolipsies8.getText().toString().equals("") && aimolipsies8.getText().length() > 0) {
            aimo8 = Integer.parseInt(aimolipsies8.getText().toString());
        } else {
            aimo8 = 0;
        }
        if(!aimolipsies9.getText().toString().equals("") && aimolipsies9.getText().length() > 0) {
            aimo9 = Integer.parseInt(aimolipsies9.getText().toString());
        } else {
            aimo9 = 0;
        }
        if(!aimolipsies10.getText().toString().equals("") && aimolipsies10.getText().length() > 0) {
            aimo10 = Integer.parseInt(aimolipsies10.getText().toString());
        } else {
            aimo10 = 0;
        }

        return Integer.toString(aimo0 + aimo1 + aimo2 + aimo3 + aimo4 + aimo5 + aimo6 + aimo7 + aimo8 + aimo9 + aimo10);

    }

    public String liptes(){
        int diathesimoi;

        if(!atoma.getText().toString().equals("") && atoma.getText().length() > 0) {
            diathesimoi = Integer.parseInt(atoma.getText().toString());
        } else{
            diathesimoi = 1;
        }

        return Integer.toString(diathesimoi);
    }

    private String packet(){
        String pckt;
        int plithos = Integer.parseInt(liptes());
        int aimolipsies = Integer.parseInt(addAimolipsies());
        double basic, median, dif, sub1, sub, res;

        basic = Math.floor(aimolipsies / plithos);
        median = basic * plithos;
        dif = aimolipsies - median;
        sub = plithos - dif;
        sub1 = plithos - sub;
        res = basic + 1;

        int bas = (int) basic;
        int med = (int) median;
        int df = (int) dif;
        int s = (int) sub;
        int s1 = (int) sub1;
        int rs = (int) res;

        if (med == aimolipsies){
            if (plithos == 1){
                pckt = plithos + " άτομο " + bas + " αιμοληψίες";
            }else {
                pckt = plithos + " άτομα από " + bas + " αιμοληψίες";
            }
        }else {
            if (s == 1){
                pckt = s + " άτομο " + bas + " και " + s1 + " άτομα από " + rs + " αιμοληψίες";
            }else if (s1 == 1){
                pckt = s + " άτομα από " + bas + " και " + s1 + " άτομο " + rs + " αιμοληψίες";
            }else {
                pckt = s + " άτομα από " + bas + " και " + s1 + " άτομα από " + rs + " αιμοληψίες";
            }
        }

        return pckt;
    }
}