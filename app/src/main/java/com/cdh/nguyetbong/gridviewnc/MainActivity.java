package com.cdh.nguyetbong.gridviewnc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<HinhAnh> hinhAnhArrayList;
    AdapterHinhanh adapterHinhanh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        adapterHinhanh = new AdapterHinhanh(this,R.layout.dong_hinhanh,hinhAnhArrayList);
        gridView.setAdapter(adapterHinhanh);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, hinhAnhArrayList.get(i).getTen(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Anhxa() {
        gridView = findViewById(R.id.grview);
        hinhAnhArrayList = new ArrayList<>();
        hinhAnhArrayList.add(new HinhAnh("Tôm Hấp", R.drawable.monan01));
        hinhAnhArrayList.add(new HinhAnh("Bạch Tuộc Nướng", R.drawable.monan02));
        hinhAnhArrayList.add(new HinhAnh("Sò Lông", R.drawable.monan03));
        hinhAnhArrayList.add(new HinhAnh("Càng Ghẹ rang muối", R.drawable.monan04));
        hinhAnhArrayList.add(new HinhAnh("Lòn xào chua ngọt", R.drawable.monan05));
    }
}
