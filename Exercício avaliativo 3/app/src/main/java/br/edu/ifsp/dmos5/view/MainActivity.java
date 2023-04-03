package br.edu.ifsp.dmos5.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.edu.ifsp.dmos5.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextUsuario;
    private EditText editTextSenha;
    private Button buttonLogin;
    private Button buttonNovoUsuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        setClickListener();
    }


    private void findViews() {
        this.editTextUsuario = findViewById(R.id.editTextUsuario);
        this.editTextSenha = findViewById(R.id.editTextSenha);
        this.buttonLogin = findViewById(R.id.buttonLogin);
        this.buttonNovoUsuario = findViewById(R.id.buttonNovoUsuario);
    }

    private void setClickListener() {
        buttonLogin.setOnClickListener(this);
        buttonNovoUsuario.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == buttonNovoUsuario){
            Intent telaCadastro = new Intent(this, NewUserActivity.class);
            startActivity(telaCadastro);
        }


    }
}