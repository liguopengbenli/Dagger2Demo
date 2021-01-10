package com.androidtutz.anushka.didemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    SmartPhone smartPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.create();
        //smartPhone = smartPhoneComponent.getSmartPhone();
        smartPhoneComponent.inject(this);

        smartPhone.makeACall();
    }
}
