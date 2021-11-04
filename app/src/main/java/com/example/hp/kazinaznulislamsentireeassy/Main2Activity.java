package com.example.hp.kazinaznulislamsentireeassy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button b2,b3,b4,b5,b6,b7,b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain2Acitivity2();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain2Acitivity3();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain2Acitivity4();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain2Acitivity5();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain2Acitivity6();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain2Acitivity7();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain2Acitivity8();
            }
        });
    }

    public void openMain2Acitivity2()
    {
        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);
    }

    public void openMain2Acitivity3()
    {
        Intent intent = new Intent(this,Main4Activity.class);
        startActivity(intent);
    }

    public void openMain2Acitivity4()
    {
        Intent intent = new Intent(this,Main5Activity.class);
        startActivity(intent);
    }

    public void openMain2Acitivity5()
    {
        Intent intent = new Intent(this,Main6Activity.class);
        startActivity(intent);
    }

    public void openMain2Acitivity6()
    {
        Intent intent = new Intent(this,Main7Activity.class);
        startActivity(intent);
    }

    public void openMain2Acitivity7()
    {
        Intent intent = new Intent(this,Main8Activity.class);
        startActivity(intent);
    }

    public void openMain2Acitivity8()
    {
        Intent intent = new Intent(this,Main9Activity.class);
        startActivity(intent);
    }


}
