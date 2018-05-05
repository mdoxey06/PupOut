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


public class MatchFilters extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Context currContext = MatchFilters.this;

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
                    Intent intent3 = new Intent(currContext, ExchangeScreen.class);
                    currContext.startActivity(intent3);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_filters);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.settings_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.edit_profile:
                Intent intent1 = new Intent(this, EditProfile.class);
                this.startActivity(intent1);
                break;
            case R.id.edit_filters:
                Intent intent2 = new Intent(this, MatchFilters.class);
                this.startActivity(intent2);
                break;
        }
        return true;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, DogPref.class);
        this.startActivity(intent);
    }
}