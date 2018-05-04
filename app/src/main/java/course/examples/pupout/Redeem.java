package course.examples.pupout;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.content.Context;
import android.view.View;
import android.widget.Button;


public class Redeem extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Context currContext = Redeem.this;

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent1 = new Intent(currContext, HomeScreen.class);
                    currContext.startActivity(intent1);
                    return true;
                case R.id.navigation_matches:
                    Intent intent2 = new Intent(currContext, Matches.class);
                    currContext.startActivity(intent2);
                    return true;
                case R.id.navigation_redeem:
                    Intent intent3 = new Intent(currContext, Redeem.class);
                    currContext.startActivity(intent3);
                    return true;
            }
            return false;
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redeem);

        Button redeem = findViewById(R.id.redeem_button);
        redeem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context currContext = Redeem.this;
                Intent intent1 = new Intent(currContext, Redeem2.class);
                currContext.startActivity(intent1);
            }
        });

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.getMenu().findItem(R.id.navigation_redeem).setChecked(true);
    }


}