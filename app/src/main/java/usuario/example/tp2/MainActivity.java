package usuario.example.tp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import usuario.example.tp2.modelo.Inmueble;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel mv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mv = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        mv.getDatosInmueble().observe(this, new Observer<ArrayList<Inmueble>>() {
            @Override
            public void onChanged(ArrayList<Inmueble> inmuebles) {
                ArrayAdapter<Inmueble> adapter = new ListaAdapter(MainActivity.this,R.layout.item,inmuebles,getLayoutInflater());
                ListView lv=findViewById(R.id.lvmilista);
                lv.setAdapter(adapter);
            }
        });
        mv.SetDatos();

    }

}