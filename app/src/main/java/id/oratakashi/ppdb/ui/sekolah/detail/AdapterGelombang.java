package id.oratakashi.ppdb.ui.sekolah.detail;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.oratakashi.ppdb.R;
import id.oratakashi.ppdb.data.jadwal.DataJadwal;
import id.oratakashi.ppdb.ui.formulir.form_beli.FormulirBeliActivity;

public class AdapterGelombang extends RecyclerView.Adapter<AdapterGelombang.ViewHolder> {

    Context context;
    List<String> name = DataJadwal.name();
    List<String> tgl = DataJadwal.tgl();

    public AdapterGelombang(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_gelombang,
                parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvName.setText(name.get(position));
        holder.tvTgl.setText(tgl.get(position));
        holder.btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, FormulirBeliActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.tvName)
        TextView tvName;
        @BindView(R.id.tvTgl)
        TextView tvTgl;
        @BindView(R.id.btnBuy)
        Button btnBuy;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
