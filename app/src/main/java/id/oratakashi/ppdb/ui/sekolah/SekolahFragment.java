package id.oratakashi.ppdb.ui.sekolah;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import id.oratakashi.ppdb.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SekolahFragment extends Fragment {

    Unbinder unbinder;
    SekolahAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sekolah, container, false);

        unbinder = ButterKnife.bind(this, view);

        adapter = new SekolahAdapter(getActivity());
        rvSchool.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvSchool.setAdapter(adapter);

        return view;
    }

    @BindView(R.id.rvSchool)
    RecyclerView rvSchool;
}
