package fr.ensea.a3dn.exemple01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public final String TAG = "Home";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Toujours cette première ligne !
        super.onCreate(savedInstanceState);
        // Log - d for Debug
        Log.d(TAG, "On entre dans onCreate()");
        // On affiche la vue
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "On entre dans onStart()");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "On entre dans onRestart()");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "On entre dans onResume()");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "On entre dans onPause()");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "On entre dans onStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "On entre dans onDestroy()");
        super.onDestroy();
    }


}
