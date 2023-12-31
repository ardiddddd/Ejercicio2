package javi.ardid.ejercicio2;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import javi.ardid.ejercicio2.modelos.Bici;
import javi.ardid.ejercicio2.modelos.Coche;
import javi.ardid.ejercicio2.modelos.Moto;

public class MainActivity extends AppCompatActivity {
    //ATRIBUTOS PARA LA VISTA
    private Button btnCrearCoche;
    private Button btnCrearMoto;
    private Button btnCrearBici;
    private TextView lbCantidadCoches;
    private TextView lbCantidadMotos;
    private TextView lbCantidadBicis;

    //ATRIBUTOS PARA LOS LAUNCHERS (RECOGER INFORMACIÓN)

    private ActivityResultLauncher<Intent> launcherCoches;
    private ActivityResultLauncher<Intent> launcherMotos;
    private ActivityResultLauncher<Intent> launcherBicis;

    //ATIBUTOS PARA LA LÓGICA
    private ArrayList<Coche> listaCoches;
    private ArrayList<Moto> listaMotos;
    private ArrayList<Bici> listaBicis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inicializarVariables();


    }

    private void inicializarVariables() {
        //inicializar Vista
        lbCantidadCoches = findViewById(R.id.lbCantidadCochesMain);
        lbCantidadMotos = findViewById(R.id.lbCantidadMotosMain);
        lbCantidadBicis = findViewById(R.id.lbCantidadBicisMain);


        btnCrearCoche = findViewById(R.id.btnCrearCocheMain);
        btnCrearMoto = findViewById(R.id.btnCrearMotoMain);
        btnCrearBici = findViewById(R.id.btnCrearBiciMain);
        //inicializar Lógica
        listaCoches = new ArrayList<>();
        listaMotos = new ArrayList<>();
        listaBicis = new ArrayList<>();

    }
}