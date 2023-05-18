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
        Bundle complete = this.getIntent().getExtras();
        String[] array = complete.getStringArray("key");

        tvDetails.setText("Module Code: " + array[0] + "\nModule Name: " + array[1] + "\nAcademic Year: " + array[2] + "\nSemester: " + array[3] + "\nModule Credit: " + array[4] + "\nVenue: " + array[5]);
    }
}