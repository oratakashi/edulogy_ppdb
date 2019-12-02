package id.oratakashi.ppdb.ui.pambayaran;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import id.oratakashi.ppdb.R;
import id.oratakashi.ppdb.data.payment.DataPayment;
import id.oratakashi.ppdb.ui.formulir.form_beli.FormulirBeliActivity;
import id.oratakashi.ppdb.ui.sekolah.detail.DetailSekolahActivity;

public class PembayaranAdapter extends RecyclerView.Adapter<PembayaranAdapter.ViewHolder> {

    Context context;
    List<String> data = DataPayment.dummy_name();

    public PembayaranAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_payment,
                parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvName.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.tvName)
        TextView tvName;
        @OnClick(R.id.rlPayment) void onClick(){
            ((Activity) context).finish();
            FormulirBeliActivity.getInstance().finish();
            DetailSekolahActivity.getInstance().finish();
        }
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
