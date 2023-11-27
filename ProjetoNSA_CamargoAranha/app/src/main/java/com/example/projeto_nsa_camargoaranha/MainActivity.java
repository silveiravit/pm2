package com.example.projeto_nsa_camargoaranha;

import androidx.appcompat.app.AppCompatActivity;

import android.media.metrics.EditingSession;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference minhaReferencia = FirebaseDatabase.getInstance().getReference("cad_Aluno");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText rm_aluno = findViewById(R.id.rm_aluno);
        EditText nome = findViewById(R.id.nome_aluno);
        EditText email_aluno = findViewById(R.id.email_aluno);
        EditText celular_aluno = findViewById(R.id.celular_aluno);
        EditText cep_aluno = findViewById(R.id.cep_aluno);
        EditText complemento_aluno = findViewById(R.id.complemento_aluno);
        EditText endereco_aluno = findViewById(R.id.endereco_aluno);
        EditText curso_aluno = findViewById(R.id.curso_aluno);

        Button cadastrar = findViewById(R.id.cadastrar);
        Button limpar = findViewById(R.id.limpar);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rm = rm_aluno.getText().toString();
                String nome_aluno = nome.getText().toString();
                String email = email_aluno.getText().toString();
                String celular = celular_aluno.getText().toString();
                String cep = cep_aluno.getText().toString();
                String complemento = complemento_aluno.getText().toString();
                String endereco = endereco_aluno.getText().toString();
                String curso = curso_aluno.getText().toString();

                minhaReferencia.child("Codigo_Rm").child("Rm_Aluno").setValue(rm);
                minhaReferencia.child("Codigo_Rm").child("Nome").setValue(nome_aluno);
                minhaReferencia.child("Codigo_Rm").child("E-mail").setValue(email);
                minhaReferencia.child("Codigo_Rm").child("Celular").setValue(celular);
                minhaReferencia.child("Codigo_Rm").child("Endereço").setValue(endereco);
                minhaReferencia.child("Codigo_Rm").child("Complemento").setValue(complemento);
                minhaReferencia.child("Codigo_Rm").child("CEP").setValue(cep);
                minhaReferencia.child("Codigo_Rm").child("Curso").setValue(curso);
            }
        });

        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rm_aluno.setText("");
                nome.setText("");
                email_aluno.setText("");
                celular_aluno.setText("");
                cep_aluno.setText("");
                complemento_aluno.setText("");
                endereco_aluno.setText("");
                curso_aluno.setText("");
            }
        });


    }
}