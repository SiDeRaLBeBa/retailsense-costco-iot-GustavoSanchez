package com.campus.assignment_2b_gustavosanchez.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.campus.assignment_2b_gustavosanchez.R;
import com.campus.assignment_2b_gustavosanchez.models.Device;

import java.util.List;

public class StoreDevicesAdapter extends RecyclerView.Adapter<StoreDevicesAdapter.DeviceViewHolder> {

    private Context context;
    private List<Device> devices;
    private OnDeviceClickListener listener;

    public interface OnDeviceClickListener {
        void onDeviceClick(Device device);
    }

    public StoreDevicesAdapter(Context context, List<Device> devices, OnDeviceClickListener listener) {
        this.context = context;
        this.devices = devices;
        this.listener = listener;
    }

    @Override
    public DeviceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_store_device, parent, false);
        return new DeviceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DeviceViewHolder holder, int position) {
        Device device = devices.get(position);
        holder.label.setText(device.getLabel());
        holder.type.setText(device.getType());
        holder.status.setText(device.getStatus());
        holder.lastHeartbeat.setText(device.getLastHeartbeat());

        holder.itemView.setOnClickListener(v -> listener.onDeviceClick(device));
    }

    @Override
    public int getItemCount() {
        return devices.size();
    }

    static class DeviceViewHolder extends RecyclerView.ViewHolder {
        TextView label, type, status, lastHeartbeat;
        public DeviceViewHolder(View itemView) {
            super(itemView);
            label = itemView.findViewById(R.id.deviceLabel);
            type = itemView.findViewById(R.id.deviceType);
            status = itemView.findViewById(R.id.deviceStatus);
            lastHeartbeat = itemView.findViewById(R.id.deviceLastHeartbeat);
        }
    }
}
