package com.androidtutz.anushka.didemo;

import dagger.Component;

@Component(modules = {MemoryCardModule.class, NcBatteryModule.class})
public interface SmartPhoneComponent {
    //SmartPhone getSmartPhone();
    void inject(MainActivity mainActivity);

}
