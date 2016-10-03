package aedphisolucioneseducativas.aedphi;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class homestd extends AppCompatActivity {

    ArrayList<CompHomeStd>funcion;
    RecyclerView recyclerstd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homestd);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Bienvenido");
        recyclerstd=(RecyclerView) findViewById(R.id.recyclerstd);
        recyclerstd.setHasFixedSize(true);

        LinearLayoutManager ll=new LinearLayoutManager(this);
        ll.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerstd.setLayoutManager(ll);

        funcion=new ArrayList<CompHomeStd>();

        agregarfuncion();
        AdaptadorHomestd ahstd = new AdaptadorHomestd(funcion);
        ahstd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(),hometeacher.class );
                startActivity(i);
                Log.i("Demo RecView","Pulsado el elemento"+recyclerstd.getChildPosition(v));
            }
        });
        recyclerstd.setAdapter(ahstd);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menustd,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.acercade:
                Intent acercade = new Intent(homestd.this, acercade.class);
                startActivity(acercade);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public ArrayList<CompHomeStd> agregarfuncion() {
        funcion.add(new CompHomeStd("Study Planner",R.drawable.planner));
        funcion.add(new CompHomeStd("Schedule",R.drawable.schedule));
        funcion.add(new CompHomeStd("Sharing",R.drawable.sharing));
        funcion.add(new CompHomeStd("Tools",R.drawable.tools));
        return funcion;
    }

}
