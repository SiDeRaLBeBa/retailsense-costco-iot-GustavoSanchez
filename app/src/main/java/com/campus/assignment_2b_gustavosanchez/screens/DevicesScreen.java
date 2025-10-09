package com.campus.assignment_2b_gustavosanchez.screens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.campus.assignment_2b_gustavosanchez.R;

public class DevicesScreen implements ScreenInterface {

    private View view;

    public DevicesScreen(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.screen_devices, null);

        RecyclerView recyclerDevices = view.findViewById(R.id.recyclerDevices);
        recyclerDevices.setLayoutManager(new LinearLayoutManager(context));

    }

    @Override
    public View getView() {
        return view;
    }
}
