package com.campus.assignment_2b_gustavosanchez;

import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.OnBackPressedCallback;
import com.campus.assignment_2b_gustavosanchez.screens.*;
import com.campus.assignment_2b_gustavosanchez.utils.Simulation;

public class HomeActivity extends AppCompatActivity {

    private FrameLayout container;
    private ScreenInterface currentScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        container = findViewById(R.id.container);

        // Show Home screen at launch
        showScreen(new HomeScreen(this));

        // Back gestures / button handling
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                if (!(currentScreen instanceof HomeScreen)) {
                    showScreen(new HomeScreen(HomeActivity.this));
                } else {
                    setEnabled(false);
                    onBackPressed();
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(android.view.MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_reset_day) {
            showResetDialog();
            return true;
        } else if (id == R.id.action_about) {
            showAboutDialog();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showResetDialog() {
        new androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle("Reset Day")
                .setMessage("Are you sure you want to reset the day?")
                .setPositiveButton("Yes", (d, w) -> {
                    Simulation.getInstance().reset();
                    com.google.android.material.snackbar.Snackbar.make(
                            findViewById(android.R.id.content),
                            "Day has been reset.",
                            com.google.android.material.snackbar.Snackbar.LENGTH_SHORT
                    ).show();
                })
                .setNegativeButton("Cancel", null)
                .show();
    }

    private void showAboutDialog() {
        new androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle("About RetailSense")
                .setMessage("RetailSense IoT Simulation\nv1.0.0\nDeveloped by Gustavo Sánchez.")
                .setPositiveButton("OK", null)
                .show();
    }


    // Method to swap screens
    public void showScreen(ScreenInterface screen) {
        container.removeAllViews();
        container.addView(screen.getView());
        currentScreen = screen;
    }
}
