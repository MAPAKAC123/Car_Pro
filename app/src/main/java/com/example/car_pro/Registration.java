package com.example.car_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Registration extends AppCompatActivity implements View.OnClickListener {
ImageButton btn, btn2;
Button btn1;
private EditText edName, edFamilia, edOtchestvo;
private DatabaseReference mDataBase;
private String USER_KEY = "User";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        btn = findViewById(R.id.imageButton);
        btn.setOnClickListener(this);

        btn1 = findViewById(R.id.button);
        btn1.setOnClickListener(this);

        btn2 = findViewById(R.id.imageButton2);
        btn2.setOnClickListener(this);

        init();

        //myDataBase = FirebaseDatabase.getInstance().getReference(USER_KEY);

        int[] editTextIds = {R.id.edName, R.id.edFamilia, R.id.edOtchestvo, R.id.edMail, R.id.edLogin};

        for (int id : editTextIds) {
            EditText editText = findViewById(id);
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    if (hasFocus) {
                        ((EditText) v).setText("");
                    }
                }
            });
        }
    }
    private void init(){
        edName = findViewById(R.id.edName);
        edFamilia = findViewById(R.id.edFamilia);
        edOtchestvo = findViewById(R.id.edOtchestvo);
        mDataBase = FirebaseDatabase.getInstance().getReference(USER_KEY);
    }
    public void onClickSave(View view){
        String id = mDataBase.getKey();
        String name = edName.getText().toString();
        String familia = edFamilia.getText().toString();
        String otchestvo = edOtchestvo.getText().toString();
        User newUser = new User(id, name, familia, otchestvo);
        mDataBase.push().setValue(newUser);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.imageButton){
            startActivity(new Intent(this, HomeScreen.class));
        }
        if(view.getId() == R.id.button){
            startActivity(new Intent(this, LoginAccount.class));
        }
        if(view.getId() == R.id.imageButton2){
            //onSave();
            startActivity(new Intent(this, MainScreen.class));
        }
    }
    /*public void onSave(){
        String id = myDataBase.getKey();
        String name = edName.getText().toString();
        String familia = edFamilia.getText().toString();
        String otchestvo = edOtchestvo.getText().toString();
        String mail = edMail.getText().toString();
        String login = edLogin.getText().toString();
        String password = edPassword.getText().toString();
        RegistrationUsers registrationusers = new RegistrationUsers(id, name, familia, otchestvo, mail, login, password);
        myDataBase.push().setValue(registrationusers);
        Toast.makeText(this,"Пользователь добавлен", Toast.LENGTH_SHORT).show();
    }*/
}
