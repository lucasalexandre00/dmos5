package br.edu.ifsp.dmos5.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.edu.ifsp.dmos5.R;
import br.edu.ifsp.dmos5.model.Usuario;
import br.edu.ifsp.dmos5.repository.UsuarioRepository;


public class NewUserActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private EditText editTextConfPassword;

    private Button buttonSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

        findViews();
        setClickListener();
    }

    private void setClickListener() {
        buttonSalvar.setOnClickListener(this);
    }

    private void findViews() {
        this.editTextUsername = findViewById(R.id.editTextUsername);
        this.editTextPassword = findViewById(R.id.editTextPassword);
        this.editTextConfPassword = findViewById(R.id.editTextConfPassword);
        this.buttonSalvar = findViewById(R.id.buttonSalvar);
    }

    @Override
    public void onClick(View view) {
        new UsuarioRepository().save(editTextUsername.getText().toString(), editTextPassword.getText().toString());
        System.out.println(new UsuarioRepository().findAll());
    }
}