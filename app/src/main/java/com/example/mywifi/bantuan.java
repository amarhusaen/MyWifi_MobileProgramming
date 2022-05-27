package com.example.mywifi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class bantuan extends AppCompatActivity {

    ListView lv;

    String[] lvItems = {
            "",
            "Apa itu MyWifi",
            "Apa saja biaya yang termasuk ke paket langganan MyWifi",
            "Syarat apa saja yang diperlukan untuk mendaftar MyWifi",
            "Bagaimana cara berlangganan MyWifi",
            "Bagaimana cara mengecek tagihan MyWifi",
            "Bagaimana cara pembayaran tagihan MyWifi",
            "Berapa biaya untuk upgrade speed MyWifi",
            "Apakah ada denda jika perangkat MyWifi dirumah rusak",
            "Bagaimana jika ingin memanggil teknisi untuk mengecek jaringan MyWifi",
            "Apa yang dimaksud gangguan massal",
            "Bagaimana cara mengadukan masalah pada layanan MyWifi",
            "Apa saja paket yang tersedia untuk layanan TV Kabel",
            "Bagaimana jika saya telat membayar tagihan",
            "Berapa biaya berlanggan Cloud Storage",
            "Apakah biaya langganan Cloud Storage termasuk ke tagian MyWifi",
            "Bagaimana jika pembayaran saya belum terverifikasi di aplikasi MyWifi",
            "Apakah ada promo pembayaran tagihan MyWifi",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bantuan);

        lv = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, lvItems);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), lvItems[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}