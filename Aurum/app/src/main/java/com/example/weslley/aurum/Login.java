package com.example.weslley.aurum;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;


public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);

        CardView btCadastro = (CardView) findViewById(R.id.btCadastrar);


    }

    public void cadastrar (View btCadastro){
        Intent intent = new Intent(Login.this, CadRevendedora.class);
        startActivity(intent);
    }
}
