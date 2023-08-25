package usuario.example.tp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import usuario.example.tp2.modelo.Inmueble;

public class ListaAdapter extends ArrayAdapter<Inmueble> {

    private Context context;
    private List<Inmueble> inmuebleList;
    private LayoutInflater li;

    public ListaAdapter(@NonNull Context context, int resource, @NonNull List<Inmueble> LsInmueble, LayoutInflater layoutInflater) {
        super(context, resource, LsInmueble);//layoutInflater
        this.context= context;
        this.inmuebleList=LsInmueble;
        this.li= layoutInflater;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View itemView= convertView;
       if(itemView==null)
       {
           itemView=li.inflate(R.layout.item,parent,false);
       }
       Inmueble inmueble = inmuebleList.get(position);
        ImageView foto = itemView.findViewById(R.id.imageView);
        foto.setImageResource(inmueble.getFoto());

        TextView direccion= itemView.findViewById(R.id.tvDireccion);
        direccion.setText(inmueble.getDireccion());

        TextView precio= itemView.findViewById(R.id.tvPrecio);
        precio.setText(inmueble.getPrecio()+"");

        return itemView;
    }
}
