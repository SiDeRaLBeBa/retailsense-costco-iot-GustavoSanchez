package com.campus.assignment_2b_gustavosanchez.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.campus.assignment_2b_gustavosanchez.R;
import com.campus.assignment_2b_gustavosanchez.models.Alert;

import java.util.List;

public class AlertsAdapter extends RecyclerView.Adapter<AlertsAdapter.AlertViewHolder> {

    public interface OnAlertActionListener {
        void onAcknowledge(Alert alert);
        void onSuppress(Alert alert);
        void onOpenDevice(Alert alert);
    }

    private Context context;
    private List<Alert> alerts;
    private OnAlertActionListener listener;

    public AlertsAdapter(Context context, List<Alert> alerts, OnAlertActionListener listener) {
        this.context = context;
        this.alerts = alerts;
        this.listener = listener;
    }

    @NonNull
    @Override
    public AlertViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_alert, parent, false);
        return new AlertViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlertViewHolder holder, int position) {
        Alert alert = alerts.get(position);

        holder.severity.setText(alert.getSeverity());
        holder.message.setText(alert.getMessage());
        holder.device.setText(alert.getDeviceLabel());
        holder.store.setText(alert.getStoreName());
        holder.timestamp.setText(alert.getTimestamp());

        holder.btnAcknowledge.setOnClickListener(v -> {
            if (listener != null) listener.onAcknowledge(alert);
        });

        holder.btnSuppress.setOnClickListener(v -> {
            if (listener != null) listener.onSuppress(alert);
        });

        holder.btnOpenDevice.setOnClickListener(v -> {
            if (listener != null) listener.onOpenDevice(alert);
        });
    }

    @Override
    public int getItemCount() {
        return alerts.size();
    }

    static class AlertViewHolder extends RecyclerView.ViewHolder {
        TextView severity, message, device, store, timestamp;
        Button btnAcknowledge, btnSuppress, btnOpenDevice;

        public AlertViewHolder(@NonNull View itemView) {
            super(itemView);
            severity = itemView.findViewById(R.id.alertSeverity);
            message = itemView.findViewById(R.id.alertMessage);
            device = itemView.findViewById(R.id.alertDevice);
            store = itemView.findViewById(R.id.alertStore);
            timestamp = itemView.findViewById(R.id.alertTimestamp);

            btnAcknowledge = itemView.findViewById(R.id.btnAcknowledge);
            btnSuppress = itemView.findViewById(R.id.btnSuppress);
            btnOpenDevice = itemView.findViewById(R.id.btnOpenDevice);
        }
    }
}
