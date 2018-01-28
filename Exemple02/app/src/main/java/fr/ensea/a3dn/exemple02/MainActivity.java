package fr.ensea.a3dn.exemple02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    /*Compteur du nombre de clic sur le bouton*/
    private int value = 0;
    /* Le bouton */
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* On récupère le bouton grâce à son id*/
        button = (Button) findViewById(R.id.button);
        /* Le Listener sur le Bouton*/
        button.setOnClickListener(new onClickListener());
    }

    /*Actualise le texte sur bouton */
    private void updateButtonLabel() {
        button.setText(Integer.toString(this.value));
    }

    /*On défini notre propre Listener pour bouton*/
    private class onClickListener implements View.OnClickListener {
        /*A chaque clic sur le bouton on incrémente le compteur*/
        @Override
        public void onClick(View v) {
            value++;
            updateButtonLabel();
        }
    }


    /*Sauvegarde du compteur si besoin.
    On pourrai aussi le faire dans le callback Activity.onPause()*/
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // on récupère la valeur du compteur grâce à la clé "value"
        value =  savedInstanceState.getInt("value");
        updateButtonLabel();
    }

    /*Restauration du compteur quand l'activité reviens au premier plan.
    On pourrai aussi le faire dans Activity.onResume() par exemple.*/
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Le Bundle fonctionne sur un système de clé/ valeur.
        outState.putInt("value", value);
    }

}