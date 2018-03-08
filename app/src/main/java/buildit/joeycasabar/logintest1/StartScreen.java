package buildit.joeycasabar.logintest1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StartScreen extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.logintest1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
    }

    public void enterLogin(View view) {
        Intent intent = new Intent(this, LoginScreen.class);
        startActivity(intent);
    }
}
