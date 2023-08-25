package usuario.example.tp2;

import androidx.appcompat.app.AppCompatActivity;
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

        ArrayAdapter<Inmueble> adapter = new ListaAdapter(this,R.layout.item,mv.GetDatos(),getLayoutInflater());
        ListView lv=findViewById(R.id.lvmilista);
        lv.setAdapter(adapter);
    }

}