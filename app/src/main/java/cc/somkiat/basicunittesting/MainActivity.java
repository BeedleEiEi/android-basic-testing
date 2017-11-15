package cc.somkiat.basicunittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.userNameInput);
        email = findViewById(R.id.emailInput);
    }

    public void onSaveClick(View view) {
        NameValidation v = new NameValidation();
        EmailValidation e = new EmailValidation();
        String message = v.validate(username.getText().toString());
        String mail = e.validate(email.getText().toString());
        System.out.println(message + "    " + mail);

        if (message == "Invalid" || mail == "Invalid") {
            Toast.makeText(this, "Invalid Name or Email!!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "OK!", Toast.LENGTH_SHORT).show();
        }


    }

    public void onRevertClick(View view) {
        username.setText("");
        email.setText("");
    }

}
