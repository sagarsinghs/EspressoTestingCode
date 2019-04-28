package sangamsagar.learningroom.kotlinMvvmArchitecture

import android.app.Activity
import android.app.Application
import com.squareup.leakcanary.LeakCanary
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import sangamsagar.learningroom.BuildConfig
import sangamsagar.learningroom.kotlinMvvmArchitecture.di.modules.AppModule
import sangamsagar.learningroom.kotlinMvvmArchitecture.di.modules.NetModules
import timber.log.Timber
import javax.inject.Inject
import  sangamsagar.learningroom.kotlinMvvmArchitecture.di.modules.component.AppComponent

class App:Application() , HasActivityInjector
{
    @Inject
    lateinit var activityInjector : DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        @Suppress("DEPRECATION")
             DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .netModule(NetModules(BuildConfig.URL))
            .build()
            .inject(this)

        if(BuildConfig.DEBUG)
        {
            Timber.plant(Timber.DebugTree())

        //    Stetho.initializedWithDefaults(this)
        }
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return
        }
        LeakCanary.install(this)


    }
    override fun activityInjector(): AndroidInjector<Activity> = activityInjector
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  