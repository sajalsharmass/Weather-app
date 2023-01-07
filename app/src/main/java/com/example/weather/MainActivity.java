package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout RLhome;
    private ImageView back_color, search_img, weather_img;
    private TextView city_name_id, tv_temperature, tv_condition;
    private ProgressBar PBloading;
    private RecyclerView rv_weather;
    private TextInputEditText edt_city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RLhome = findViewById(R.id.RLhome);
        PBloading = findViewById(R.id.PBloading);
        city_name_id = findViewById(R.id.city_name_id);
        tv_temperature = findViewById(R.id.tv_temperature);
        tv_condition = findViewById(R.id.tv_condition);
        rv_weather = findViewById(R.id.rv_weather);
        edt_city = findViewById(R.id.edt_city);
        back_color = findViewById(R.id.back_color);
        search_img = findViewById(R.id.search_img);
        weather_img = findViewById(R.id.weather_img);
    }
}