package id.oratakashi.ppdb.ui.formulir.form_beli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import id.oratakashi.ppdb.R;
import id.oratakashi.ppdb.ui.pambayaran.PembayaranActivity;
import id.oratakashi.ppdb.ui.sekolah.detail.DetailSekolahActivity;
import id.oratakashi.ppdb.utils.FunctionHelper;

public class FormulirBeliActivity extends AppCompatActivity {

    Unbinder unbinder;
    public static FormulirBeliActivity activity;

    int total = 1000000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulir_beli);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        activity = this;

        getSupportActionBar().setTitle("Pembelian Formulir");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(5);

        unbinder = ButterKnife.bind(this);

        tvTotal.setText(FunctionHelper.formatRupiah(total));
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish(); return super.onSupportNavigateUp();
    }

    @OnClick(R.id.btnBayar) void onBayar(){
        startActivity(new Intent(getApplicationContext(), PembayaranActivity.class));
    }

    @OnClick(R.id.btnMin) void onMin(){
        int jumlah = Integer.parseInt(tvJml.getText().toString());
        tvJml.setText(String.valueOf(jumlah-1));
        total = total-1000000;
        tvTotal.setText(FunctionHelper.formatRupiah(total));
    }

    @OnClick(R.id.btnMax) void onMax(){
        int jumlah = Integer.parseInt(tvJml.getText().toString());
        tvJml.setText(String.valueOf(jumlah+1));
        total = total+1000000;
        tvTotal.setText(FunctionHelper.formatRupiah(total));
    }

    public static FormulirBeliActivity getInstance(){
        return activity;
    }

    @BindView(R.id.tvJml)
    TextView tvJml;
    @BindView(R.id.tvTotal)
    TextView tvTotal;
}
