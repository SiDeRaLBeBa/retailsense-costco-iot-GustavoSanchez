package com.campus.assignment_2b_gustavosanchez.screens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.campus.assignment_2b_gustavosanchez.R;

public class StoresScreen implements ScreenInterface {

    private View view;

    public StoresScreen(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.screen_stores, null);

        RecyclerView recyclerStores = view.findViewById(R.id.recyclerStores);
        recyclerStores.setLayoutManager(new LinearLayoutManager(context));


    }

    @Override
    public View getView() {
        return view;
    }
}
