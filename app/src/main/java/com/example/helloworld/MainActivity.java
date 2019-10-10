package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG="MainActivity";

    Button button;
    Button button2;
    EditText edtNom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: 10/1/19

        button = (Button)findViewById(R.id.btnBoto);
        button2 = (Button)findViewById(R.id.btnBoto2);
        edtNom = (EditText)findViewById(R.id.edtNom);

        Log.d(TAG, "debugging"); //Aparece no Logcat
        Toast.makeText(this, "Això és una prova", Toast.LENGTH_LONG).show();//mensagem rapida que aparece na parte inferior da tela
        //Toast.makeText(this, "Bye per avui", Toast.LENGTH_SHORT).show();


    }

    public void onClickHelp(View view) {
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
    }

    public void onClickCreaCompte(View view) {

        String nomUser=edtNom.getText().toString();

        Toast.makeText(this, "Crearà una compte per l'usuari " + nomUser, Toast.LENGTH_LONG).show();

        Log.d(TAG, "Crearà nova compte");
        TextView textView = (TextView)findViewById(R.id.txtView2);
        textView.setText("El nom de l'usuari és: "+nomUser);
    }
}
