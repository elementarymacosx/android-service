package htin.linnzaw.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start = findViewById(R.id.buttonStart);
        Button stop = findViewById(R.id.buttonStop);
        Button next = findViewById(R.id.buttonNext);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
        next.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.buttonStart:
                startService(new Intent(this, MyService.class));
                break;
            case R.id.buttonStop:
                stopService(new Intent(this, MyService.class));
                break;
            case R.id.buttonNext:
                Intent intent = new Intent(this, NextActivity.class);
                startActivity(intent);
                break;
        }
    }
}
