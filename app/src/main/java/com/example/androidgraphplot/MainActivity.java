package com.example.androidgraphplot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import org.eazegraph.lib.charts.PieChart;

public class MainActivity extends AppCompatActivity {

    private Button click;
    private PieChart chart;
//ctrl D
    private int i1 = 15;
    private int i2 = 15;
    private int i3 = 15;
    private int i4 = 15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}