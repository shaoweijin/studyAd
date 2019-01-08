package com.launchso.studyad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("HelloActivity","onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HelloActivity.this, "你再点我试试！", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.add_item:
                Toast.makeText(this, "你点了新增菜单", Toast.LENGTH_SHORT).show();
                break;


            case R.id.remove_item:
                Toast.makeText(this, "你点了删除菜单", Toast.LENGTH_SHORT).show();
                break;

            default:
        }


        return true;
    }
}
