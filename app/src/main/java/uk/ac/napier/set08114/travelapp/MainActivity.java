package uk.ac.napier.set08114.travelapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.util.Log;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton rb0 = (RadioButton) findViewById(R.id.radioButton);
        rb0.setOnClickListener(radioGroupClick);

        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton2);
        rb1.setOnClickListener(radioGroupClick);

        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton3);
        rb2.setOnClickListener(radioGroupClick);

        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton4);
        rb3.setOnClickListener(radioGroupClick);

        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton5);
        rb4.setOnClickListener(radioGroupClick);
    }

    private View.OnClickListener radioGroupClick = new View.OnClickListener() {
        public void onClick(View view) {
            RadioButton rb = (RadioButton) view;
            ImageView iv = findViewById(R.id.imageView);
            //ProgressBar progressBar = findViewById(R.id.progressBar);
            //progressBar.setVisibility(View.VISIBLE);
            Log.d("3.14.15","de-bugger, a button has been clicked");

            if (rb.getText().equals("Hopewell Rocks")) {
                iv.setImageResource(R.drawable.hopewell_rocks);
                Intent activityA = new Intent(MainActivity.this, hopewell_rocks.class);
                startActivity(activityA);
            } else if (rb.getText().equals("Niagara Falls")) {
                iv.setImageResource(R.drawable.niagara_falls);
                Intent activityA = new Intent(MainActivity.this, niagra_falls.class);
                startActivity(activityA);
                Log.i("3.14.15", "reached the end of the main activity");
            } else if (rb.getText().equals("Parliament Hill")) {
                iv.setImageResource(R.drawable.parliament_hill);
                Intent activityA = new Intent(MainActivity.this, parliment_hill.class);
                startActivity(activityA);
            } else if (rb.getText().equals("Moraine Lake")) {
                iv.setImageResource(R.drawable.moraine_lake);
                Intent activityA = new Intent(MainActivity.this, moraine_lake.class);
                startActivity(activityA);
            } else if (rb.getText().equals("CN Tower")) {
                iv.setImageResource(R.drawable.cn_tower);
                Intent activityA = new Intent(MainActivity.this, cn_tower.class);
                startActivity(activityA);
            }

        }
    };

}
