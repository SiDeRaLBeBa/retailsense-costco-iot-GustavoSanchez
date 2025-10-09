package com.campus.assignment_2b_gustavosanchez.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.campus.assignment_2b_gustavosanchez.R;
import com.campus.assignment_2b_gustavosanchez.models.Reading;

import java.util.List;

public class ReadingsAdapter extends RecyclerView.Adapter<ReadingsAdapter.ReadingViewHolder> {

    private Context context;
    private List<Reading> readings;

    public ReadingsAdapter(Context context, List<Reading> readings) {
        this.context = context;
        this.readings = readings;
    }

    @Override
    public ReadingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_reading, parent, false);
        return new ReadingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReadingViewHolder holder, int position) {
        Reading r = readings.get(position);
        holder.timestamp.setText(r.getTimestamp());
        holder.value.setText(String.valueOf(r.getValue()));
        holder.flags.setText(r.getFlags());
    }

    @Override
    public int getItemCount() {
        return readings.size();
    }

    static class ReadingViewHolder extends RecyclerView.ViewHolder {
        TextView timestamp, value, flags;
        public ReadingViewHolder(View itemView) {
            super(itemView);
            timestamp = itemView.findViewById(R.id.readingTimestamp);
            value = itemView.findViewById(R.id.readingValue);
            flags = itemView.findViewById(R.id.readingFlags);
        }
    }
}
