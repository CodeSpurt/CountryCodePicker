package com.codespurt.countrycodepicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hbb20.CountryCodePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button getCountryCode;
    private CountryCodePicker ccp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getCountryCode = (Button) findViewById(R.id.get_country_code);
        ccp = (CountryCodePicker) findViewById(R.id.ccp);
    }

    @Override
    protected void onResume() {
        super.onResume();
        getCountryCode.setOnClickListener(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        getCountryCode.setOnClickListener(null);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.get_country_code:
                Toast.makeText(this, getResources().getString(R.string.selected_country_code) + " " + ccp.getSelectedCountryCodeWithPlus(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}