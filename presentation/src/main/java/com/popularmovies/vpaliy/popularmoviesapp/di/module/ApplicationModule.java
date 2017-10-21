package com.popularmovies.vpaliy.popularmoviesapp.di.module;

import android.app.Application;
import android.content.Context;
import com.popularmovies.vpaliy.popularmoviesapp.ui.base.bus.RxBus;
import com.popularmovies.vpaliy.popularmoviesapp.ui.navigator.Navigator;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application application){
        this.application=application;
    }

    @Singleton
    @Provides
    Context provideWithContext(){
        return application;
    }

    @Singleton
    @Provides
    Navigator provideNavigator(){
        return new Navigator();
    }


    @Singleton
    @Provides
    RxBus provideRxBus(){
        return new RxBus();
    }

}
