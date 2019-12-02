package id.oratakashi.ppdb.ui.pambayaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import id.oratakashi.ppdb.R;

public class PembayaranActivity extends AppCompatActivity {

    Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Pilih Pembayaran");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(5);

        unbinder = ButterKnife.bind(this);

        rvPembayaran.setLayoutManager(new LinearLayoutManager(this));
        rvPembayaran.setAdapter(new PembayaranAdapter(this));

    }

    @BindView(R.id.rvPembayaran)
    RecyclerView rvPembayaran;
}
