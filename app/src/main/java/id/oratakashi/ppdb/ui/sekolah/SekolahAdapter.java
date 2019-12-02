package id.oratakashi.ppdb.ui.sekolah;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;
import id.oratakashi.ppdb.R;
import id.oratakashi.ppdb.data.sekolah.DataSekolah;
import id.oratakashi.ppdb.ui.sekolah.detail.DetailSekolahActivity;
import id.oratakashi.ppdb.utils.ImageHelper;

public class SekolahAdapter extends RecyclerView.Adapter<SekolahAdapter.ViewHolder> {

    List<String> name = DataSekolah.dummy_name();
    List<String> address = DataSekolah.dummy_address();
    Context context;

    public SekolahAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_school,
                parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvName.setText(name.get(position));
        holder.tvAddress.setText(address.get(position));
        holder.cvSchool.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailSekolahActivity.class);
            intent.putExtra("name", name.get(position));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.tvName)
        TextView tvName;
        @BindView(R.id.tvAddress)
        TextView tvAddress;
        @BindView(R.id.cvSchool)
        CardView cvSchool;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
