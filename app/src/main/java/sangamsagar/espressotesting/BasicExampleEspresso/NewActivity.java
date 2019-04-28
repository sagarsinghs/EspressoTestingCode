package sangamsagar.espressotesting.BasicExampleEspresso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import sangamsagar.espressotesting.R;
public class NewActivity extends AppCompatActivity {
    // The name of the extra data sent through an {@link Intent}.
    public final static String KEY_EXTRA_MESSAGE =
            "com.example.android.testing.espresso.basicsample.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);



        // Show message.
        String message = getIntent().getStringExtra(KEY_EXTRA_MESSAGE);
        ((TextView)findViewById(R.id.show_text_view)).setText(message);
    }
}
