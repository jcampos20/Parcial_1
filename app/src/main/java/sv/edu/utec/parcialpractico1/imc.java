package sv.edu.utec.parcialpractico1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class imc extends AppCompatActivity {
Button btnexit;
Button btncalc;
EditText ettexpeso, ettextaltura;
TextView etmsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        btnexit=findViewById(R.id.btnexit);
        btncalc=findViewById(R.id.btncalc);
        ettexpeso=findViewById(R.id.ettexpeso);
        ettextaltura=findViewById(R.id.ettextaltura);
        etmsg=findViewById(R.id.etmsg);

    }

        public void calcular (View v) {
            Double peso=Double.parseDouble(ettexpeso.getText().toString());
            Double altura=Double.parseDouble(ettextaltura.getText().toString());
            Double IMC=peso/(altura*altura);
            if (IMC < 10.5) { etmsg.setText("Críticamente Bajo de Peso");}
            else if (IMC < 15.9) { etmsg.setText("Severamente Bajo de Peso");}
            else if (IMC < 18.5) {etmsg.setText("Bajo de Peso");}
           else if (IMC < 25) {etmsg.setText("Normal (peso saludable)");}
            else if (IMC < 30) {etmsg.setText("Sobrepeso");}
            else if (IMC < 35) {etmsg.setText("Obesidad Clase 1 - Moderadamente Obeso");}
           else if (IMC < 40) {etmsg.setText("Obesidad Clase 2 - Severamente Obeso");}
            else if (IMC > 50) {etmsg.setText("Obesidad Clase 3 - Críticamente Obeso");}

        }


    public void exit (View v)    {
        finish();
    }

}