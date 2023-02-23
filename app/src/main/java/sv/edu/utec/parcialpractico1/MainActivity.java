package sv.edu.utec.parcialpractico1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnlogin;
EditText ettextusername, ettextpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin=findViewById(R.id.btnlogin);
        ettextusername=findViewById(R.id.ettextusername);
        ettextpassword=findViewById(R.id.ettextpassword);
        }

    public void login (View v)    {
        String usr=ettextusername.getText().toString();
        String pss=ettextpassword.getText().toString();
        if (usr.equals("parcialETps1") && pss.equals("p4rC14l#tp$")) {
        Intent opwin=new Intent (this,imc.class);
    startActivity(opwin);
        } else {
            Toast toastP = new Toast(getApplicationContext());
            LayoutInflater inflater =getLayoutInflater();
            View layout=inflater.inflate(R.layout.toast_aviso,(ViewGroup) findViewById(R.id.lytalerta));
            TextView txtmessage=(TextView) layout.findViewById(R.id.txtmessage);
            txtmessage.setText("Contraseña y Usuario no son correctos");
            toastP.setDuration(Toast.LENGTH_LONG);toastP.setView(layout);
            toastP.show();
        }
    }
}