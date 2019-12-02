package id.oratakashi.ppdb.ui.sekolah.detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import id.oratakashi.ppdb.R;

public class DetailSekolahActivity extends AppCompatActivity {

    Unbinder unbinder;
    AdapterGelombang adapter;

    public static DetailSekolahActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sekolah);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        activity = this;

        unbinder = ButterKnife.bind(this);

        getSupportActionBar().setTitle("Detail Sekolah");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(5);

        adapter = new AdapterGelombang(this);
        rvGelombang.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        rvGelombang.setAdapter(adapter);

        tvName.setText(getIntent().getStringExtra("name"));
    }

    public static DetailSekolahActivity getInstance(){
        return activity;
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish(); return super.onSupportNavigateUp();
    }

    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.rvGelombang)
    RecyclerView rvGelombang;
}
