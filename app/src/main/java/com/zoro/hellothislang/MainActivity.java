package com.zoro.hellothislang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  private ArrayList<String> helloWorldLIst=new ArrayList<>();
  private TextView textcountry;
//private int count=0;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       textcountry=findViewById(R.id.hellowor);
       helloWorldLIst.add("Hello !");
        helloWorldLIst.add("Привет !");
        helloWorldLIst.add("Bonjour!");
  helloWorldLIst.add("Buenos días!");
        helloWorldLIst.add("Guten Tag");
       helloWorldLIst.add("Buongiorno!");
        helloWorldLIst.add("Olá");
        helloWorldLIst.add("Dzień dobry!");
        helloWorldLIst.add("שָׁלוֹם ");
        helloWorldLIst.add("Merhaba!");
        helloWorldLIst.add("God dag!");
        helloWorldLIst.add("你好");
        helloWorldLIst.add("Dobrý den!");
        helloWorldLIst.add("Hallo");
        helloWorldLIst.add("नमस्ते ");
        helloWorldLIst.add("Halo");
        helloWorldLIst.add("Hyvää päivää");
        helloWorldLIst.add("Szervusz");
        helloWorldLIst.add("God dag");
        helloWorldLIst.add("Hallo!");
        helloWorldLIst.add("salam!");
        helloWorldLIst.add("Salaam!");
        helloWorldLIst.add("Mendvt!");
        helloWorldLIst.add("Assalomu alaikum!");
        helloWorldLIst.add("Mauri!");
        helloWorldLIst.add("Haa!");
        helloWorldLIst.add("hasimnikka!");
        helloWorldLIst.add("Moien!");
      Handler mHandler = new Handler();
        final Runnable runnable = new Runnable() {
            int count = 0;
            @Override
            public void run() {
                count++;
                textcountry.setText(helloWorldLIst.get(count).toString());
                mHandler.postDelayed(this, 3000); // five second in ms
            }
        };
        mHandler.postDelayed(runnable, 1000);
    }}