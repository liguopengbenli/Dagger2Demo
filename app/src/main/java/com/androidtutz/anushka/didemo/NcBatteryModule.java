package com.androidtutz.anushka.didemo;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
abstract class NcBatteryModule {

    @Binds
    abstract Battery bindNCBattery(NickelCadmiumBattery nickelCadmiumBattery);
}
