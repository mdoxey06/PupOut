package course.examples.pupout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        Button login = (Button) findViewById(R.id.login_button);
        Button signup = (Button) findViewById(R.id.signup_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openloginPage();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensignupPage();
            }
        });
    }

    public void openloginPage() {
        Intent displayLogInPage = new Intent(this, LoginActivity.class);
        startActivity(displayLogInPage);
    }

    public void opensignupPage() {
        Intent displaySignUpPage = new Intent(this, InitialSignUp.class);
        startActivity(displaySignUpPage);
    }
}