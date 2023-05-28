package com.sanderpiva.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.grid_view);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(MainActivity.this, Brasil.class);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, Argentina.class);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, Colombia.class);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, Peru1.class);
                        break;
                    default:
                        intent = new Intent(MainActivity.this, MainActivity.class);
                }
                startActivity(intent);
            }
        });
    }
}




