package id.oratakashi.ppdb.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import id.oratakashi.ppdb.R;
import id.oratakashi.ppdb.ui.formulir.FormulirFragment;
import id.oratakashi.ppdb.ui.pengumuman.PengumumanFragment;
import id.oratakashi.ppdb.ui.sekolah.SekolahFragment;
import id.oratakashi.ppdb.utils.TabAdapter;

public class MainActivity extends AppCompatActivity {

    Unbinder unbinder;
    TabAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Edu PPDB");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(5);

        unbinder = ButterKnife.bind(this);

        adapter = new TabAdapter(getSupportFragmentManager());

        adapter.addFragment(new SekolahFragment(), "Sekolah");
        adapter.addFragment(new FormulirFragment(), "Formulir");
        adapter.addFragment(new PengumumanFragment(), "Pengumuman");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_search:
                Toast.makeText(this, "Coming soon!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_info:
                Toast.makeText(this, "Coming soon!", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
}
