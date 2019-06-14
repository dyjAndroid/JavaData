package com.example.mapdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "dyj";

    private Map<String, String> mMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMap.put("name", "11");
        mMap.put("age", "18");
    }

    public void onClick(View view) {

        for (String key :
                mMap.keySet()) {
            Log.d(TAG, "key" + key + ",value:" + mMap.get(key));
        }
    }
}
