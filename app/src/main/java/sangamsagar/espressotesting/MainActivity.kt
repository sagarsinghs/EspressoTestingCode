package sangamsagar.espressotesting

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val buttonlogin by lazy{
        findViewById<Button>(R.id.login_button)
    }


    private val editTextusername by lazy {
        findViewById<EditText>(R.id.user_name)
    }


    private  val editeTextpassword by lazy{
        findViewById<EditText>(R.id.password)
    }

    private val textViewresult by lazy{
        findViewById<TextView>(R.id.login_result)
    }

    override fun onCreate(savedInstanceState:Bundle?)
    {
        Log.e("Activity" ,"onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonlogin.setOnClickListener{
        if(editTextusername.text.toString().equals("Sagar") &&
            editeTextpassword.text.toString().equals("password"))
            textViewresult.text =  "login_success"
        else
            textViewresult.text= "login_failed"

    }

}

override fun onStart()
{
    Log.e("Activity","onStart")
        super.onStart()
}

override fun onPause()
{
    Log.e("Activity","onPause")
    super.onPause()
}

override fun onStop()
{
    Log.e("Activity","onStop")
    super.onStop()
}

override fun onDestroy()
{
    Log.e("Activity","onDestroy")
    super.onDestroy()
}
}
