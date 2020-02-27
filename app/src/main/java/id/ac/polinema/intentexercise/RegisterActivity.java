package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    public static String USER_KEY = "user";
    private EditText fullnameInput;
    private EditText emailInput;
    private EditText passwordInput;
    private EditText homepageInput;
    private EditText aboutInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        fullnameInput = findViewById(R.id.text_fullname);
        emailInput = findViewById(R.id.text_email);
        passwordInput = findViewById(R.id.text_password);
        homepageInput = findViewById(R.id.text_homepage);
        aboutInput = findViewById(R.id.text_about);
    }
}
