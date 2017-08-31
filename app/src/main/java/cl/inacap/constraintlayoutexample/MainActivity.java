package cl.inacap.constraintlayoutexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Resumido!", Toast.LENGTH_SHORT).show();
    }

    public void login(View view)
    {
        // Invocar la actividad
        Intent intento = new Intent(this, ResultActivity.class);

        EditText usuario = (EditText) findViewById(R.id.etUsuario);
        EditText password = (EditText) findViewById(R.id.etPassword);

        intento.putExtra("elUsuario", usuario.getText().toString());
        intento.putExtra("elPassword", password.getText().toString());
        startActivity(intento);


    }
}
