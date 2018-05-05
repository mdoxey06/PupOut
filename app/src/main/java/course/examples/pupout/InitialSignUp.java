package course.examples.pupout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InitialSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_sign_up);

        Button next = (Button) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserInfoPage();
            }
        });
    }

    public void openUserInfoPage() {
        Intent displayLogInPage = new Intent(this, SecondSignUp.class);
        startActivity(displayLogInPage);
    }
}