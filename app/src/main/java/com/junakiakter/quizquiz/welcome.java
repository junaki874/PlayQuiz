package com.junakiakter.quizquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome extends AppCompatActivity implements View.OnClickListener{
    Button yes,no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        yes=(Button) findViewById(R.id.yes);
        no=(Button) findViewById(R.id.no);

        yes.setOnClickListener(this);
        no.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.yes){
            Intent intn12= new Intent(welcome.this, MainActivity.class);
            startActivity(intn12);
        }
        else if(v.getId()==R.id.no){
           moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }
    }
}
