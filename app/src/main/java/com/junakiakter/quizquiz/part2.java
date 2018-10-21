package com.junakiakter.quizquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class part2 extends AppCompatActivity {
    RadioGroup grp3,grp4;
    RadioButton optionButton3, ans3,optionButton4,ans4;
    Button bu3,bu4,back2,next2;
    TextView  result3,result4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2);

        grp3=(RadioGroup) findViewById(R.id.groupId3);
        bu3=(Button)findViewById(R.id.bu3);
        result3=(TextView) findViewById((R.id.res3));

        grp4=(RadioGroup) findViewById(R.id.groupId4);
        bu4=(Button)findViewById(R.id.bu4);
        result4=(TextView) findViewById((R.id.res4));

        back2=(Button)findViewById(R.id.back1) ;
        next2=(Button)findViewById(R.id.next1) ;

        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int select3=grp3.getCheckedRadioButtonId();
                optionButton3=(RadioButton)findViewById(select3);

                String check3=optionButton3.getText().toString();
                ans3=(RadioButton)findViewById(R.id.op34);
                String valu3=ans3.getText().toString();

                if(check3.equals(valu3)){
                    result3.setText("Congratulation! Your answer is correct. Please try next quiz.");
                }
                else {
                    result3.setText("Sorry your answer is not correct. Please try again.");
                }
            }
        });


        bu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int select4=grp4.getCheckedRadioButtonId();
                optionButton4=(RadioButton)findViewById(select4);
                String check4=optionButton4.getText().toString();

                ans4=(RadioButton)findViewById(R.id.op42);
                String value4=ans4.getText().toString();

                if(check4.equals(value4)){
                    result4.setText("Congratulation! Your answer is correct. Please try next quiz.");
                }
                else {
                    result4.setText("Sorry your answer is not correct. Please try again.");
                }
            }
        });

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(part2.this,MainActivity.class);
                startActivity(intent2);
            }
        });

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itn= new Intent(part2.this, part3.class);
                startActivity(itn);
            }
        });
    }
}
