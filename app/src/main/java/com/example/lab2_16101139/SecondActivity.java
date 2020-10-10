package com.example.lab2_16101139;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    String value ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button= (Button)findViewById(R.id.button2Id);
        textView= (TextView)findViewById(R.id.textViewId);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
             value = bundle.getString("key");
            textView.setText(value);
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myWebLink;
                myWebLink = new Intent(Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse( "https://www.google.com/search?q="+value));
                startActivity(myWebLink);

            }
        });


    }
}
