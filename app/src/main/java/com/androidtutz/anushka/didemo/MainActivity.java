package com.androidtutz.anushka.didemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    SmartPhone smartPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.create();
        //smartPhone = smartPhoneComponent.getSmartPhone();
        /*SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.builder()
                                                                            .memoryCardModule(new MemoryCardModule(100))
                                                                            .build();*/

        //smartPhoneComponent.inject(this);
        App.getApp().getSmartPhoneComponent().inject(this);

        smartPhone.makeACall();
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}
