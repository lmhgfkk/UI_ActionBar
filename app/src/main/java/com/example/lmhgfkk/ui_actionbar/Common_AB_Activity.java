package com.example.lmhgfkk.ui_actionbar;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Common_AB_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_ab);

        ActionBar actionBar = getSupportActionBar();
        String title = (String) actionBar.getTitle();
        System.out.println(title);
        actionBar.setTitle("Common_AB");
        System.out.println( (String) actionBar.getTitle());


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //为actionbar扩展菜单项
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.common_ab_menu,menu);
        //You must return true for the menu to be displayed;if you return false it will not be shown.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_search:
                Toast.makeText(this,"search",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_setting:
                Toast.makeText(this,"setting",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_share:
                Toast.makeText(this,"share",Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
