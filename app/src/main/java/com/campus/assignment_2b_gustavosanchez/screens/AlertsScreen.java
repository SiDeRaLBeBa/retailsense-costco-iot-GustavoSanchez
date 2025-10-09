package com.campus.assignment_2b_gustavosanchez.screens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.campus.assignment_2b_gustavosanchez.R;

public class AlertsScreen implements ScreenInterface {

    private View view;

    public AlertsScreen(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.screen_alerts, null);

        RecyclerView recyclerAlerts = view.findViewById(R.id.recyclerAlerts);
        recyclerAlerts.setLayoutManager(new LinearLayoutManager(context));

    }

    @Override
    public View getView() {
        return view;
    }
}
