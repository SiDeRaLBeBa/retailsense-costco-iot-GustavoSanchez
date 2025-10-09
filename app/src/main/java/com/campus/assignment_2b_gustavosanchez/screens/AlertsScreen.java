package com.campus.assignment_2b_gustavosanchez.screens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.campus.assignment_2b_gustavosanchez.R;
import com.campus.assignment_2b_gustavosanchez.adapters.AlertsAdapter;
import com.campus.assignment_2b_gustavosanchez.models.Alert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AlertsScreen implements ScreenInterface {

    private View view;
    private List<Alert> alertList;
    private AlertsAdapter adapter;

    public AlertsScreen(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.screen_alerts, null);

        RecyclerView recyclerAlerts = view.findViewById(R.id.recyclerAlerts);
        recyclerAlerts.setLayoutManager(new LinearLayoutManager(context));

        // Read CSV and generate alerts
        alertList = readAlertsFromCSV(context, "readings_d1001.csv");

        adapter = new AlertsAdapter(context, alertList, new AlertsAdapter.OnAlertActionListener() {
            @Override
            public void onAcknowledge(Alert alert) {
                alertList.remove(alert);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onSuppress(Alert alert) {
                // Implement suppression logic if needed
            }

            @Override
            public void onOpenDevice(Alert alert) {
                // Implement navigation to DeviceDetailScreen if needed
            }
        });

        recyclerAlerts.setAdapter(adapter);
    }

    @Override
    public View getView() {
        return view;
    }

    private List<Alert> readAlertsFromCSV(Context context, String fileName) {
        List<Alert> alerts = new ArrayList<>();
        try {
            InputStream is = context.getAssets().open(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            String line;
            reader.readLine(); // Skip header

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 3) continue; // skip malformed lines

                String timestamp = parts[0];
                double tempC = Double.parseDouble(parts[1]);
                int doorOpen = Integer.parseInt(parts[2]);

                // Generate alerts
                if (tempC > 5) {
                    alerts.add(new Alert(
                            "Critical",
                            "Temperature too high",
                            "Fridge A",
                            "Store 1",
                            timestamp
                    ));
                } else if (doorOpen == 1) {
                    alerts.add(new Alert(
                            "Warning",
                            "Door open",
                            "Fridge A",
                            "Store 1",
                            timestamp
                    ));
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return alerts;
    }
}
