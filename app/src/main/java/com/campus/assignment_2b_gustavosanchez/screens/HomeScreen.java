package com.campus.assignment_2b_gustavosanchez.screens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import com.campus.assignment_2b_gustavosanchez.HomeActivity;
import com.campus.assignment_2b_gustavosanchez.R;

public class HomeScreen implements ScreenInterface {

    private View view;

    public HomeScreen(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.screen_home, null);

        Button btnStores = view.findViewById(R.id.btnStores);
        btnStores.setOnClickListener(v -> ((HomeActivity) context).showScreen(new StoresScreen(context)));

        Button btnDevices = view.findViewById(R.id.btnDevices);
        btnDevices.setOnClickListener(v -> ((HomeActivity) context).showScreen(new DevicesScreen(context)));

        Button btnAlerts = view.findViewById(R.id.btnAlerts);
        btnAlerts.setOnClickListener(v -> ((HomeActivity) context).showScreen(new AlertsScreen(context)));

        Button btnInsights = view.findViewById(R.id.btnInsights);
        btnInsights.setOnClickListener(v -> ((HomeActivity) context).showScreen(new InsightsScreen(context)));
    }

    @Override
    public View getView() {
        return view;
    }
}
