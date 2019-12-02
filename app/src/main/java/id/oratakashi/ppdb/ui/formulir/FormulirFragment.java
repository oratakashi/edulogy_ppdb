package id.oratakashi.ppdb.ui.formulir;


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
public class FormulirFragment extends Fragment {

    Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_formulir, container, false);

        unbinder = ButterKnife.bind(this, view);

        rvFormulir.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvFormulir.setAdapter(new FormulirAdapter());

        return view;
    }

    @BindView(R.id.rvFormulir)
    RecyclerView rvFormulir;

}
