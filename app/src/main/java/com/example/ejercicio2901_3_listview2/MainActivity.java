package com.example.ejercicio2901_3_listview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lvEjercicios;
    TextView tvEjercicioPrincipal, tvEjercicioSecundario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvEjercicioPrincipal=(TextView)findViewById(R.id.tvPrincipal);
        tvEjercicioSecundario=(TextView)findViewById(R.id.tvSecundario);


        lvEjercicios=(ListView)findViewById(R.id.lvLista);

        String[] ejercicios = {"Press Banca", "Extensión triceps", "Biceps concentrado",
        "Dominada", "Dominada inversa", "Sentadilla frontal", "Sentadilla trasera",
        "Flexiones", "Abdominal", "Clean", "Press militar", "Press francés"};

        ArrayAdapter<String> adaptador=new ArrayAdapter<String>( this,
                android.R.layout.simple_list_item_1,ejercicios);

        lvEjercicios.setAdapter(adaptador);

        lvEjercicios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String ejercicio_seleccionado1 = parent.getItemAtPosition(position).toString();
                //Lo siguiente sería para que apareciera en la burbujita negra inferior, pero no es nuestro caso
                /*Toast.makeText(getApplicationContext(), "Has seleccionado"+ejercicio_seleccionado, Toast.LENGTH_SHORT).show();
*/
                tvEjercicioPrincipal.setText(ejercicio_seleccionado1);
            }
        });

        lvEjercicios.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String ejercicio_seleccionado2 = parent.getItemAtPosition(position).toString();
                /*Toast.makeText(getApplicationContext(), "Has seleccionado como secundario"+ejercicio_seleccionado,);
                return true;
                */
                tvEjercicioSecundario.setText(ejercicio_seleccionado2);

            }
        });


    }
}
