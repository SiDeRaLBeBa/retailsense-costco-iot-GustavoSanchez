package com.campus.assignment_2b_gustavosanchez.screens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.campus.assignment_2b_gustavosanchez.R;

public class DeviceDetailScreen implements ScreenInterface {

    private View view;

    public DeviceDetailScreen(Context context, String deviceId) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.screen_device_detail, null);

    }

    @Override
    public View getView() {
        return view;
    }
}
