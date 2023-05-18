package sg.edu.rp.c346.id22023219.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC203;
    TextView tvC206;
    TextView tvC218;
    TextView tvC235;
    TextView tvC346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC203 = findViewById(R.id.textViewC203);
        tvC206 = findViewById(R.id.textViewC206);
        tvC218 = findViewById(R.id.textViewC218);
        tvC235 = findViewById(R.id.textViewC235);
        tvC346 = findViewById(R.id.textViewC346);

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module" , "C203");
                intent.putExtra("Name" , "Web Application Development in php");
                intent.putExtra("Sem" , "1");
                intent.putExtra("Year" , "2023");
                intent.putExtra("Credit" , "4");
                intent.putExtra("Venue" , "W65D");
                startActivity(intent);
            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module" , "C206");
                intent.putExtra("Name" , "Software Development Process");
                intent.putExtra("Sem" , "1");
                intent.putExtra("Year" , "2023");
                intent.putExtra("Credit" , "4");
                intent.putExtra("Venue" , "W65D");
                startActivity(intent);
            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module" , "C218");
                intent.putExtra("Name" , "UI/UX Design for Apps");
                intent.putExtra("Sem" , "1");
                intent.putExtra("Year" , "2023");
                intent.putExtra("Credit" , "4");
                intent.putExtra("Venue" , "W65D");
                startActivity(intent);
            }
        });

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module" , "C235");
                intent.putExtra("Name" , "IT Security and Management");
                intent.putExtra("Sem" , "1");
                intent.putExtra("Year" , "2023");
                intent.putExtra("Credit" , "4");
                intent.putExtra("Venue" , "W65D");
                startActivity(intent);
            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module" , "C346");
                intent.putExtra("Name" , "Mobile App Development");
                intent.putExtra("Sem" , "1");
                intent.putExtra("Year" , "2023");
                intent.putExtra("Credit" , "4");
                intent.putExtra("Venue" , "E63A");
                startActivity(intent);
            }
        });
    }
}