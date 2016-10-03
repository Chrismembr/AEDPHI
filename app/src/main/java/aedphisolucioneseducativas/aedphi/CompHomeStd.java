package aedphisolucioneseducativas.aedphi;

/**
 * Created by phone on 2/10/16.
 */

public class CompHomeStd {

    private String Elementos;
    private int Imagen;
    private int Layout;


    public String getElementos() {
        return Elementos;
    }

    public void setElementos(String elementos) {
        Elementos = elementos;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }


    public CompHomeStd(String elementos, int imagen) {
        this.Elementos = elementos;
        this.Imagen = imagen;

    }
}


