package com.example.countryprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button bdbutton,italybutton,norwaybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bdbutton=findViewById(R.id.bdid);
        italybutton=findViewById(R.id.italyid);
        norwaybutton=findViewById(R.id.norwayid);
        bdbutton.setOnClickListener(this);
        italybutton.setOnClickListener(this);
        norwaybutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.bdid){
            Intent intent=new Intent(MainActivity.this,profile.class);
            intent.putExtra("name","Bangladesh");
            startActivity(intent);
        }
 if (v.getId()==R.id.italyid){
            Intent intent=new Intent(MainActivity.this,profile.class);
            intent.putExtra("name","Italy");
            startActivity(intent);
        }
 if (v.getId()==R.id.norwayid){
            Intent intent=new Intent(MainActivity.this,profile.class);
            intent.putExtra("name","Norway");
            startActivity(intent);
        }

    }
}
