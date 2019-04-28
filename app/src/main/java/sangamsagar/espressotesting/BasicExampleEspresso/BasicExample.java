package sangamsagar.espressotesting.BasicExampleEspresso;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import sangamsagar.espressotesting.R;

public class BasicExample extends AppCompatActivity implements View.OnClickListener {

    private TextView textView1;
    private EditText editText1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_example);


        findViewById(R.id.changeTextBt).setOnClickListener(this);
        findViewById(R.id.activityChangeTextBtn).setOnClickListener(this);


    }

    @Override
    public  void onClick(View view)
    {
        final String text = editText1.getText().toString();
        final int changeTextBtId = R.id.changeTextBt;
        final int activitChangeTextBtnId = R.id.activityChangeTextBtn;

        if(view.getId() == changeTextBtId)
            textView1.setText(text);

        else if(view.getId()== activitChangeTextBtnId) {
            Intent intent = new Intent(this, NewActivity.class);
            startActivity(intent);
        }
    }
}
