package au.edu.unsw.infs3634.covidtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Interger index = 400;
        Log.d(TAG, msg: "In line 15: index = "+ index);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnLauncher);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent.putExtra(name: "somekey", value: "Hello from MainActivity!");
                startActivity(intent);
            }
        })
    }
}