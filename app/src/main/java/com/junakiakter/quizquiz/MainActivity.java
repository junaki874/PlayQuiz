package com.junakiakter.quizquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  RadioGroup grp,grp2;
  RadioButton OptonButton, optButton2,ans,ans2;
    Button bu1,bu2,next,back;
    TextView  ressult1,ressult2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       grp=(RadioGroup)findViewById(R.id.groupId) ;
       bu1=(Button) findViewById(R.id.bu1);
        ressult1= (TextView) findViewById(R.id.res1);


        grp2=(RadioGroup)findViewById(R.id.groupId2) ;
        bu2=(Button) findViewById(R.id.bu2);
        ressult2= (TextView) findViewById(R.id.res2);

        next=(Button)findViewById(R.id.next);
        back=(Button)findViewById(R.id.back);

        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int select= grp.getCheckedRadioButtonId();
                OptonButton=(RadioButton)findViewById(select);
                String check= OptonButton.getText().toString();

                ans=(RadioButton) findViewById(R.id.op3);
                String value= ans.getText().toString();


                if(check.equals(value)){
                    ressult1.setText("Congratulation! Your answer is correct. Please try next quiz.");
                }
                else{
                    ressult1.setText("Sorry your answer is not correct. Please try again.");
                }

            }
        });

        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int select2=grp2.getCheckedRadioButtonId();
                optButton2=(RadioButton) findViewById(select2);
                String check2=optButton2.getText().toString();
                ans2=(RadioButton)findViewById(R.id.op22);
                String value2=ans2.getText().toString();

                if(check2.equals(value2)){
                    ressult2.setText("Congratulation! Your answer is correct. Please try next quiz.");
                }
                else{
                    ressult2.setText("Sorry your answer is not correct. Please try again.");
                }
            }
        });

           next.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent= new Intent(MainActivity.this,part2.class);
                   startActivity(intent);
               }
           });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten= new Intent(MainActivity.this,welcome.class);
                startActivity(inten);
            }
        });
    }




    }
