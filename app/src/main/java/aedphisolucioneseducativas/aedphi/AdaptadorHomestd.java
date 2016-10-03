package aedphisolucioneseducativas.aedphi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by phone on 2/10/16.
 */

public class AdaptadorHomestd extends RecyclerView.Adapter<AdaptadorHomestd.funcstdViewHolder>
implements View.OnClickListener{


    ArrayList<CompHomeStd> funcion;
    public AdaptadorHomestd(ArrayList<CompHomeStd>CHSTD){this.funcion=CHSTD;}

    public static class funcstdViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgfunc;
        private TextView func;
        public funcstdViewHolder(View itemView){
            super(itemView);
            imgfunc=(ImageView) itemView.findViewById(R.id.imgfunc);
            func=(TextView) itemView.findViewById(R.id.tvfunc);
        }
    }

    @Override
    public funcstdViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardelhome,parent,false);
        v.setOnClickListener(this);
        funcstdViewHolder fvh = new funcstdViewHolder(v);
        return fvh;
    }

    @Override
    public void onBindViewHolder(AdaptadorHomestd.funcstdViewHolder holder, int position) {
        CompHomeStd funcion1=funcion.get(position);
        holder.imgfunc.setImageResource(funcion1.getImagen());
        holder.func.setText(funcion1.getElementos());
    }

    @Override
    public int getItemCount() {
        return funcion.size();
    }

    private View.OnClickListener click;
    public void setOnClickListener(View.OnClickListener click){
        this.click=click;
    }

    public void onClick(View view) {
        if (click !=null)
            click.onClick(view);
    }

}

