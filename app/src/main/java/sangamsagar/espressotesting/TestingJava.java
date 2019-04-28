package sangamsagar.espressotesting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TestingJava extends AppCompatActivity {

    EditText isusername,isnumber,isconfirmnumber;
    Button btnLogin;
    TextView txtLoginResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing_java);

        isusername =  findViewById(R.id.inUsername);
        isnumber =  findViewById(R.id.inNumber);
        isconfirmnumber = findViewById(R.id.inConfirmNumber);


        btnLogin = findViewById(R.id.btnLogin);
        txtLoginResult = findViewById(R.id.txtLoginResult);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(isnumber.getText()))
                    Toast.makeText(getApplicationContext(),"Number is empty",Toast.LENGTH_SHORT).show();

                else if(!(isnumber.getText().toString().equals(isconfirmnumber.getText().toString()))) {
                    Toast.makeText(getApplicationContext(), "toast_error", Toast.LENGTH_SHORT).show();
                    Log.d("TestingJava","numberConfirmed");
                }

                else if(isusername.getText().toString().trim().length()==0)
                    Toast.makeText(getApplicationContext(),"username_empty",Toast.LENGTH_SHORT).show();
                else
                    txtLoginResult.setText("Hello " + isusername.getText().toString().trim());


            }
        });

    }
}
