package com.example.lmhgfkk.ui_actionbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_common_ab = (Button) findViewById(R.id.common_actionbar);
        btn_common_ab.setOnClickListener(this);
        Button btn_custom_ab = (Button) findViewById(R.id.custom_actionbar);
        btn_custom_ab.setOnClickListener(this);
        Button btn_custom_ab_tab = (Button) findViewById(R.id.common_actionbar_tab);
        btn_custom_ab_tab.setOnClickListener(this);
        Button btn_custom_ab_pts = (Button) findViewById(R.id.common_actionbar_pts);
        btn_custom_ab_pts.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.common_actionbar:
                Intent intent=new Intent(this,Common_AB_Activity.class);
                startActivity(intent);
                break;
            case R.id.custom_actionbar:
                Intent intent2=new Intent(this,Custom_AB_Activity.class);
                startActivity(intent2);
                break;
            case R.id.common_actionbar_tab:
                Intent intent3=new Intent(this,Common_AB_Tab_Activity.class);
                startActivity(intent3);
                break;
            case R.id.common_actionbar_pts:
                Intent intent4=new Intent(this,Common_AB_PTS_Activity.class);
                startActivity(intent4);
                break;

        }
    }


}
