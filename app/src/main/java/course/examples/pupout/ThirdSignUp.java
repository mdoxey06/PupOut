package course.examples.pupout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_sign_up);

        Button next = (Button) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDogInfoPage();
            }
        });
    }

    public void openDogInfoPage() {
        Intent displayLogInPage = new Intent(this, FourthSignUp.class);
        startActivity(displayLogInPage);
    }
}