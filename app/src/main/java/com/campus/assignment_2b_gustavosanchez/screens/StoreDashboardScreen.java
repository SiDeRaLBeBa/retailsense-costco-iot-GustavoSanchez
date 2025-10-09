package com.campus.assignment_2b_gustavosanchez.screens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.campus.assignment_2b_gustavosanchez.R;

public class StoreDashboardScreen implements ScreenInterface {

    private View view;

    public StoreDashboardScreen(Context context, String storeId) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.screen_store_dashboard, null);

    }

    @Override
    public View getView() {
        return view;
    }
}
