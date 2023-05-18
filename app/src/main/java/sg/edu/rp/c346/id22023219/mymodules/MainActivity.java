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
                Bundle complete = new Bundle();
                complete.putStringArray("key" , new String[]{"C203" , "Web Application Development in php" , "1" , "2023" , "4" , "W65D"});
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtras(complete);
                startActivity(intent);
            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle complete = new Bundle();
                complete.putStringArray("key" , new String[]{"C206" , "Software Development Process" , "1" , "2023" , "4" , "W65D"});
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtras(complete);
                startActivity(intent);
            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle complete = new Bundle();
                complete.putStringArray("key" , new String[]{"C218" , "UI/UX Design for Apps" , "1" , "2023" , "4" , "W65D"});
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtras(complete);
                startActivity(intent);
            }
        });

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle complete = new Bundle();
                complete.putStringArray("key" , new String[]{"C235" , "IT Security and Management" , "1" , "2023" , "4" , "W65D"});
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtras(complete);
                startActivity(intent);
            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle complete = new Bundle();
                complete.putStringArray("key" , new String[]{"C346" , "Mobile App Development" , "1" , "2023" , "4" , "W65D"});
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtras(complete);
                startActivity(intent);
            }
        });
    }
}