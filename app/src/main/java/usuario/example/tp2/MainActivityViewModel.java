package usuario.example.tp2;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import usuario.example.tp2.modelo.Inmueble;

public class MainActivityViewModel extends AndroidViewModel {
    private ArrayList<Inmueble> list;
    private MutableLiveData<ArrayList<Inmueble>> mut_Inmueble;

    private Context context;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        this.context=application.getApplicationContext();
    }

    public LiveData<ArrayList<Inmueble>> getDatosInmueble()
    {
        if(mut_Inmueble==null){

            mut_Inmueble=new MutableLiveData<ArrayList<Inmueble>>();
        }
        return mut_Inmueble;
    }

    public void SetDatos()
    {
        list =new ArrayList<>();
        list.add(new Inmueble(R.drawable.casa,"JK",180.000));
        list.add(new Inmueble(R.drawable.casa1,"LA TOMA",100.000));
        list.add(new Inmueble(R.drawable.casa2,"MERLO",19500.000));

        mut_Inmueble.setValue(list);

    }
}
