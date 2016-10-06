package org.austinharmreduction.ahrcclientdata;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
        //stuff from mysql example
        protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

    //gsgfd
    /** Called when the user clicks the See Database button */
    public void seedatabase(View view) {
        Intent intent = new Intent(this, AndroidDatabaseManager.class);
        startActivity(intent); //go to enter client
    }

    /** Called when the user clicks the Enter Client button */
    public void Enter(View view) {
        String staff = SiteHolder.getInstance().getstaffhold();
        String site = SiteHolder.getInstance().getsitehold();
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        if (site == null){
            Toast toast = Toast.makeText(context, "please enter site", duration);
            toast.show();
            return;
        }
        if (staff == null){
            Toast toast = Toast.makeText(context, "please enter data inputer", duration);
            toast.show();
            return;
        }

        Intent intent = new Intent(this, EnterClient.class);
        startActivity(intent); //go to enter client
    }

    /** Called when the user clicks the write to csv button */
    public void csvwrite(View view) {
        Intent intent = new Intent(this, EmailCSV.class);
        startActivity(intent); //go to enter client
    }
    /** Called when the user clicks the site change button */
    public void SiteChange(View view) {
        Intent intent = new Intent(this, SiteChange.class);
        startActivity(intent); //go to site change
    }
}