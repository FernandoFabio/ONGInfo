package com.example.danco.onginfo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.danco.onginfo.DAO.ConfiguracaoFirebase;
import com.example.danco.onginfo.R;
import com.google.firebase.auth.FirebaseAuth;

public class StartPerfilActivity extends AppCompatActivity {

    private Button btnpessoa;
    private Button btnong;
    private FirebaseAuth autenticacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_perfil);

        //verificaUsuarioLogado();

        btnong = findViewById(R.id.btnloginong);
        btnpessoa = findViewById(R.id.btnloginpessoa);

        btnong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itentong = new Intent(StartPerfilActivity.this, LoginOngActivity.class);
                startActivity(itentong);
            }
        });

        btnpessoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itentpessoa = new Intent(StartPerfilActivity.this, LoginPessoaActivity.class);
                startActivity(itentpessoa);
            }
        });
       /* Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

   /* public void verificaUsuarioLogado() {
        autenticacao = ConfiguracaoFirebase.getFirebaseAutenticacao();
        if (autenticacao.getCurrentUser() != null) {
            Intent intent = new Intent(StartPerfilActivity.this, TelaPrincipalActivity.class);
            startActivity(intent);
            finish();
        }
    }*/
}
