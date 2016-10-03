package aedphisolucioneseducativas.aedphi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class hometeacher extends AppCompatActivity {

    ArrayList<CompHomeStd> funcion;
    RecyclerView recyclerstd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hometeacher);
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
        recyclerstd.setAdapter(ahstd);
    }
    public ArrayList<CompHomeStd> agregarfuncion() {
        funcion.add(new CompHomeStd("Study Planner",R.drawable.planner));
        funcion.add(new CompHomeStd("Registro",R.drawable.registro));
        funcion.add(new CompHomeStd("Schedule",R.drawable.schedule));
        funcion.add(new CompHomeStd("Sharing",R.drawable.sharing));
        funcion.add(new CompHomeStd("Tools",R.drawable.tools));
        return funcion;
    }
}
