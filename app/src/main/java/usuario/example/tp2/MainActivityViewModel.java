package usuario.example.tp2;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import java.util.ArrayList;

import usuario.example.tp2.modelo.Inmueble;

public class MainActivityViewModel extends AndroidViewModel {
    private ArrayList<Inmueble> list;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }


    public ArrayList<Inmueble> GetDatos()
    {
        list =new ArrayList<>();
        list.add(new Inmueble(R.drawable.casa,"JK",180.000));
        list.add(new Inmueble(R.drawable.casa1,"LA TOMA",100.000));
        list.add(new Inmueble(R.drawable.casa2,"MERLO",19500.000));

        return list;
    }
}
