package sg.edu.rp.c346.id22023219.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDetails = findViewById(R.id.textViewDetails);

        Intent intentReceived = getIntent();
        String Module = intentReceived.getStringExtra("Module");
        String Name = intentReceived.getStringExtra("Name");
        String Sem = intentReceived.getStringExtra("Sem");
        String Year = intentReceived.getStringExtra("Year");
        String Credit = intentReceived.getStringExtra("Credit");
        String Venue = intentReceived.getStringExtra("Venue");
        tvDetails.setText("Module Code: " + Module + "\nModule Name: " + Name + "\nAcademic Year: " + Year + "\nSemester: " + Sem + "\nModule Credit: " + Credit + "\nVenue: " + Venue);
    }
}