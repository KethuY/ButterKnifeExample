package com.c2s.butterknifesample;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.enter_name)
    TextView enterName;
    @BindView(R.id.ok)
    TextView ok;
    @BindString(R.string.name)
    String strName;
    @BindDrawable(R.mipmap.ic_launcher)
    Drawable graphic;
    @BindColor(R.color.colorAccent)
    int red; // int or ColorStateList field
    // @BindDimen(R.dimen.spacer) Float spacer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText(enterName.getText().toString());
            }
        });
    }


}
