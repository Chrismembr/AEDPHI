package aedphisolucioneseducativas.aedphi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button buton = (Button) findViewById(R.id.IniciarSesion);
        buton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
              Intent login = new Intent(getApplicationContext(), homestd.class);
                startActivity(login);

            }
        });

    }

}
