package fr.ensea.a3dn.exemple04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*On récupère les vues*/
        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        /*Une façon de faire*/
        button1.setOnClickListener(new onClickListener());
        /*Une façon équivalente*/
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Clic sur le bouton 2");
            }
        });

    }

    private class onClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            textView.setText("Clic sur le bouton 1");
        }
    }
}
