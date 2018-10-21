package com.junakiakter.quizquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class part5 extends AppCompatActivity {
    RadioGroup grp9,grp10;
    RadioButton optionButton9, ans9,optionButton10,ans10;
    Button bu9,bu10,back5,next5;
    TextView result9,result10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part5);

        grp9=(RadioGroup) findViewById(R.id.groupId9);
        bu9=(Button)findViewById(R.id.bu9);
        result9=(TextView) findViewById((R.id.res9));

        grp10=(RadioGroup) findViewById(R.id.groupId10);
        bu10=(Button)findViewById(R.id.bu10);
        result10=(TextView) findViewById((R.id.res10));

        back5=(Button)findViewById(R.id.back4) ;
        next5=(Button)findViewById(R.id.next4) ;

        bu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int select9=grp9.getCheckedRadioButtonId();
                optionButton9=(RadioButton)findViewById(select9);

                String check9=optionButton9.getText().toString();
                ans9=(RadioButton)findViewById(R.id.op94);
                String valu9=ans9.getText().toString();

                if(check9.equals(valu9)){
                    result9.setText("Congratulation! Your answer is correct. Please try next quiz.");
                }
                else {
                    result9.setText("Sorry your answer is not correct. Please try again.");
                }
            }
        });


        bu10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int select10=grp10.getCheckedRadioButtonId();
                optionButton10=(RadioButton)findViewById(select10);
                String check10=optionButton10.getText().toString();

                ans10=(RadioButton)findViewById(R.id.op101);
                String value10=ans10.getText().toString();

                if(check10.equals(value10)){
                    result10.setText("Congratulation! Your answer is correct. Please try next quiz.");
                }
                else {
                    result10.setText("Sorry your answer is not correct. Please try again.");
                }
            }
        });

        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5= new Intent(part5.this,part4.class);
                startActivity(intent5);
            }
        });

    next5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }
    });

    }
}
