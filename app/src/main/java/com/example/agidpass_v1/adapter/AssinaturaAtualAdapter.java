package com.example.agidpass_v1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.agidpass_v1.R;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.DocumentSnapshot;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
public class AssinaturaClienteAdapter extends RecyclerView.Adapter<AssinaturaClienteAdapter.ViewHolder> {

    private List<DocumentSnapshot> assinaturas;

    public AssinaturaClienteAdapter(List<DocumentSnapshot> assinaturas) {
        this.assinaturas = assinaturas;
    }

    @NonNull
    @Override
    public AssinaturaClienteAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_assinatura_atual, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AssinaturaClienteAdapter.ViewHolder holder, int position) {
        DocumentSnapshot doc = assinaturas.get(position);

        String nomePlano = doc.getString("nomePlano");
        String status = doc.getString("status");
        Timestamp dataFim = doc.getTimestamp("dataFim");

        holder.txtNomePlano.setText(nomePlano != null ? nomePlano : "Assinatura");

        if (dataFim != null) {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            holder.txtVencimento.setText("Vence em " + formato.format(dataFim.toDate()));
        } else {
            holder.txtVencimento.setText("Sem data de vencimento");
        }

        holder.txtPreco.setText(status != null ? status : "ativa");
    }

    @Override
    public int getItemCount() {
        return assinaturas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtNomePlano, txtVencimento, txtPreco;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNomePlano = itemView.findViewById(R.id.txtNomePlano);
            txtVencimento = itemView.findViewById(R.id.txtVencimento);
            txtPreco = itemView.findViewById(R.id.txtPreco);
        }
    }
}