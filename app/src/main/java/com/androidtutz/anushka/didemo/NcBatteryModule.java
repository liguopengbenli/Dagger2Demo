package com.androidtutz.anushka.didemo;

import dagger.Module;
import dagger.Provides;

@Module
public class NcBatteryModule {

    @Provides
    Battery provideNCBattery(NickelCadmiumBattery nickelCadmiumBattery){
        nickelCadmiumBattery.showType();
        return nickelCadmiumBattery;
    }
}
