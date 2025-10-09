package com.campus.assignment_2b_gustavosanchez.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.campus.assignment_2b_gustavosanchez.R;
import com.campus.assignment_2b_gustavosanchez.models.Store;

import java.util.List;

public class StoresAdapter extends RecyclerView.Adapter<StoresAdapter.StoreViewHolder> {

    private Context context;
    private List<Store> stores;
    private OnStoreClickListener listener;

    public interface OnStoreClickListener {
        void onStoreClick(Store store);
        void onScheduleMaintenance(Store store);
    }

    public StoresAdapter(Context context, List<Store> stores, OnStoreClickListener listener) {
        this.context = context;
        this.stores = stores;
        this.listener = listener;
    }

    @Override
    public StoreViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_store, parent, false);
        return new StoreViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StoreViewHolder holder, int position) {
        Store store = stores.get(position);
        holder.name.setText(store.getName());
        holder.city.setText(store.getCity() + " • Last updated " + store.getLastUpdated());

        int activeAlerts = store.getActiveAlerts();
        if (activeAlerts == 0) {
            holder.status.setText("OK");
            holder.status.setBackgroundColor(context.getColor(R.color.green));
        } else {
            holder.status.setText("Issues: " + activeAlerts);
            if (activeAlerts < 3)
                holder.status.setBackgroundColor(context.getColor(R.color.yellow));
            else
                holder.status.setBackgroundColor(context.getColor(R.color.red));
        }

        holder.itemView.setOnClickListener(v -> listener.onStoreClick(store));
        holder.itemView.setOnLongClickListener(v -> {
            listener.onScheduleMaintenance(store);
            return true;
        });
    }

    @Override
    public int getItemCount() {
        return stores.size();
    }

    static class StoreViewHolder extends RecyclerView.ViewHolder {
        TextView name, city, status;
        public StoreViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.storeName);
            city = itemView.findViewById(R.id.storeCity);
            status = itemView.findViewById(R.id.storeStatus);
        }
    }
}
