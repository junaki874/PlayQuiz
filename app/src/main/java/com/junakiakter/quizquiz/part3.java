package com.junakiakter.quizquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class part3 extends AppCompatActivity {
    RadioGroup grp5,grp6;
    RadioButton optionButton5, ans5,optionButton6,ans6;
    Button bu5,bu6,back3,next3;
    TextView result5,result6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part3);

        grp5=(RadioGroup) findViewById(R.id.groupId5);
        bu5=(Button)findViewById(R.id.bu5);
        result5=(TextView) findViewById((R.id.res5));

        grp6=(RadioGroup) findViewById(R.id.groupId6);
        bu6=(Button)findViewById(R.id.bu6);
        result6=(TextView) findViewById((R.id.res6));

        back3=(Button)findViewById(R.id.back2) ;
        next3=(Button)findViewById(R.id.next2) ;

        bu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int select5=grp5.getCheckedRadioButtonId();
                optionButton5=(RadioButton)findViewById(select5);

                String check5=optionButton5.getText().toString();
                ans5=(RadioButton)findViewById(R.id.op53);
                String valu5=ans5.getText().toString();

                if(check5.equals(valu5)){
                    result5.setText("Congratulation! Your answer is correct. Please try next quiz.");
                }
                else {
                    result5.setText("Sorry your answer is not correct. Please try again.");
                }
            }
        });


        bu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int select6=grp6.getCheckedRadioButtonId();
                optionButton6=(RadioButton)findViewById(select6);
                String check6=optionButton6.getText().toString();

                ans6=(RadioButton)findViewById(R.id.op63);
                String value6=ans6.getText().toString();

                if(check6.equals(value6)){
                    result6.setText("Congratulation! Your answer is correct. Please try next quiz.");
                }
                else {
                    result6.setText("Sorry your answer is not correct. Please try again.");
                }
            }
        });

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(part3.this,part2.class);
                startActivity(intent2);
            }
        });

       next3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent itnt= new Intent(part3.this, part4.class);
               startActivity(itnt);
           }
       });

    }
}
