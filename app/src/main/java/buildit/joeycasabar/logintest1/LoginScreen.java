package buildit.joeycasabar.logintest1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.logintest1.MESSAGE";
    EditText idField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startLockTask();
        setContentView(R.layout.activity_login_screen);
        idField = (EditText) findViewById(R.id.redID);
        idField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    checkLogin(textView);
                    handled = true;
                }
                return handled;
            }
        });
    }

    @Override
    public void onBackPressed() {
        return;
    }


    public void checkLogin(View view) {
        Intent intent = new Intent(this, Landing1.class);
        String message = idField.getText().toString();
        idField.setText("");
        if (message.length() != 9) {
            Toast toast = Toast.makeText(getApplicationContext(), "Invalid Red ID", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
    }
}
