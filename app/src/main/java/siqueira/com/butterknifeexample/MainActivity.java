package siqueira.com.butterknifeexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.email) EditText email;
    @InjectView(R.id.password) EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.inject(this);

    }

    @OnClick(R.id.button)
    void buttonClick() {
        Toast.makeText(this, "email: " + email.getText() + " senha: " + password.getText(), Toast.LENGTH_SHORT).show();
    }
}
