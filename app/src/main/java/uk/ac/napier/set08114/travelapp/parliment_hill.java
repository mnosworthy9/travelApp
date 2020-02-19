package uk.ac.napier.set08114.travelapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class parliment_hill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parliment_hill);
        ListView attractionDetails = (ListView) findViewById(R.id.attraction_list);

        Toast.makeText(getBaseContext(), "Travel to Parliment Hill", Toast.LENGTH_LONG).show();
        //Navigation back is via phones back button
        final String[] attractionDetailsArray = new String[]{
                "Located in Canada",
                "Fun fact 2",
                "Fun fact 3",
                "4",
                "5",
                "6",
                "its called parliment hill"};

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                attractionDetailsArray);

        attractionDetails.setAdapter(adapter);
        String stringToReturn = "Message back from Activity A";
        Intent returnIntent = new Intent();
        returnIntent.putExtra("String", stringToReturn);
        setResult(1, returnIntent);


    }
}
