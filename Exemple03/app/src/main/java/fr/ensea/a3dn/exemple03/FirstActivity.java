package fr.ensea.a3dn.exemple03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    /*Le bouton pour changer d'activité*/
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new onClickListener());

    }

    /*Listener pour gérer le bouton*/
    private class onClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            goToNextActivity();
        }
    }

    public void goToNextActivity() {
        /*On créé un Intent (explicite) pour démarrer la nouvelle activitée*/
        Intent intent = new Intent(this, SecondActivity.class);
        /*On utilise la méthode Activity.startActivity() pour démarrer la nouvelle activitée*/
        startActivity(intent);
    }
}
