package kr.hs.e_mirim.s2019s04.mirimspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] posterTitles = {"스파이더맨", "백두산", "Eclipse", "라라랜드", "반도", "기생충", "레미제라블", "위대한쇼맨", "SKYSCRAPER", "신과 함께"};
    int[] imgRes = {R.drawable.poster1, R.drawable.poster2, R.drawable.poster3, R.drawable.poster4, R.drawable.poster5, R.drawable.poster6, R.drawable.poster7, R.drawable.poster8, R.drawable.poster9, R.drawable.poster10};
    ImageView imgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner1 = findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, posterTitles);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(spinnerListener);
        imgv.findViewById(R.id.imgv);
    }

    AdapterView.OnItemSelectedListener spinnerListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            imgv.setImageResource(imgRes[position]);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };
}