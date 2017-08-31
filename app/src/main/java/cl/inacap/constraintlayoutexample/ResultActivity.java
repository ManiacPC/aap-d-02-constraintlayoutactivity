package cl.inacap.constraintlayoutexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView tvResultadoLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Obtener la instancia de la actividad actual
        Intent intentoActual = getIntent();
        // Obtener los valores recibidos (putExtra)
        Bundle valores = intentoActual.getExtras();

        String usuarioCorrecto = "abc@def.com";
        String passwordCorrecto = "12345";

        String usuarioIngresado;
        String passwordIngresado;

        // Obtener los valores individuales recibidos
        usuarioIngresado = (String) valores.get("elUsuario");
        passwordIngresado = (String) valores.get("elPassword");

        tvResultadoLogin = (TextView) findViewById(R.id.tvResultadoLogin);
        // Verificación
        if(usuarioIngresado.equals(usuarioCorrecto) && passwordIngresado.equals(passwordCorrecto))
            tvResultadoLogin.setText("El usuario ha ingresado correctamente");
        else tvResultadoLogin.setText("Las credenciales ingresadas no son válidas");


    }
}
