package com.example.elasz.leki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button_lekarz)
    Button button_lekarz;

    @OnClick(R.id.button_lekarz)
    void OnClick(){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        //Bundle bundle = new Bundle();
        //intent.putExtras(bundle);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
