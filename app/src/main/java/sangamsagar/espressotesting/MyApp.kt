package sangamsagar.espressotesting

import android.app.Application
import android.util.Log


class MyApp:Application()
{
    override fun onCreate() {
        super.onCreate()
        Log.e("onCreate","MyApplication")
    }
}