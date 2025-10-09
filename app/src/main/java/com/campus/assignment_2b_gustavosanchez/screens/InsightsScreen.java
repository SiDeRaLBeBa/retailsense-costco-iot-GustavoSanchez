package com.campus.assignment_2b_gustavosanchez.screens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.campus.assignment_2b_gustavosanchez.R;

public class InsightsScreen implements ScreenInterface {

    private View view;

    public InsightsScreen(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.screen_insights, null);

    }

    @Override
    public View getView() {
        return view;
    }
}
