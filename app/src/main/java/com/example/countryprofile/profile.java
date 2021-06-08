package com.example.countryprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class profile extends AppCompatActivity {
private TextView textView;
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        textView=findViewById(R.id.textid);
        imageView=findViewById(R.id.imageid);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String countrynama=bundle.getString("name");
            showdetails(countrynama);

        }
    }
    void showdetails(String countryname){
        if(countryname.equals("Bangladesh")){
            imageView.setImageResource(R.drawable.bd);
            textView.setText(R.string.bdtext);
        } if(countryname.equals("Italy")){
            imageView.setImageResource(R.drawable.italy);
            textView.setText(R.string.italy_text);
        } if(countryname.equals("Norway")){
            imageView.setImageResource(R.drawable.noorwegen);
            textView.setText(R.string.norway_text );
        }

    }


}
