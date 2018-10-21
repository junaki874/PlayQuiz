package com.junakiakter.quizquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class part4 extends AppCompatActivity {
    RadioGroup grp7,grp8;
    RadioButton optionButton7, ans7,optionButton8,ans8;
    Button bu7,bu8,back4,next4;
    TextView result7,result8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part4);

        grp7=(RadioGroup) findViewById(R.id.groupId7);
        bu7=(Button)findViewById(R.id.bu7);
        result7=(TextView) findViewById((R.id.res7));

        grp8=(RadioGroup) findViewById(R.id.groupId8);
        bu8=(Button)findViewById(R.id.bu8);
        result8=(TextView) findViewById((R.id.res8));

        back4=(Button)findViewById(R.id.back3) ;
        next4=(Button)findViewById(R.id.next3) ;

        bu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int select7=grp7.getCheckedRadioButtonId();
                optionButton7=(RadioButton)findViewById(select7);

                String check7=optionButton7.getText().toString();
                ans7=(RadioButton)findViewById(R.id.op72);
                String valu7=ans7.getText().toString();

                if(check7.equals(valu7)){
                    result7.setText("Congratulation! Your answer is correct. Please try next quiz.");
                }
                else {
                    result7.setText("Sorry your answer is not correct. Please try again.");
                }
            }
        });


        bu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int select8=grp8.getCheckedRadioButtonId();
                optionButton8=(RadioButton)findViewById(select8);
                String check8=optionButton8.getText().toString();

                ans8=(RadioButton)findViewById(R.id.op83);
                String value8=ans8.getText().toString();

                if(check8.equals(value8)){
                    result8.setText("Congratulation! Your answer is correct. Please try next quiz.");
                }
                else {
                    result8.setText("Sorry your answer is not correct. Please try again.");
                }
            }
        });

        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(part4.this,part3.class);
                startActivity(intent3);
            }
        });

         next4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent2= new Intent(part4.this , part5.class);
                 startActivity(intent2);
             }
         });
    }
}
