package com.example.shaml;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Register extends AppCompatActivity {

    TextView AlredyhaveAccount;
    EditText inputEmail , inputPassword ,inputconformPassword;
    Button btnRegister;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    ProgressDialog progressDialog;


    FirebaseAuth mAuth;
    FirebaseUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        AlredyhaveAccount=findViewById(R.id. AlredyhaveAccount);
        btnRegister=findViewById(R.id.btnRegister);
        inputconformPassword=findViewById(R.id.inputconformPassword);
        inputPassword=findViewById(R.id.inputPassword);
        inputEmail = findViewById(R.id.inputEmail );
        progressDialog= new ProgressDialog(this);
        mAuth=FirebaseAuth.getInstance();
        mUser=mAuth.getCurrentUser();

        AlredyhaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register.this,login.class));
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PerfoAuth();
            }
        });

    }

    private void PerfoAuth() {
        String email= inputEmail.getText().toString();
        String password = inputPassword.getText().toString();
        String conformpassword = inputconformPassword.getText().toString();

         if(password.isEmpty()    || password.length()<6){
            inputPassword.setError("Enter correct Password!!");

        }else
            {
                progressDialog.setMessage("Please Wait While Registration...");
                progressDialog.setTitle(" Registration");
                progressDialog.setCanceledOnTouchOutside(false);
                progressDialog.show();


                mAuth.createUserWithEmailAndPassword(email,password) .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            progressDialog.dismiss();
                            sendUserToNextActivity();
                            Toast.makeText(Register.this, "Registration was Successful  ", Toast.LENGTH_SHORT).show();
                        }else
                        {
                            progressDialog.dismiss();
                            Toast.makeText(Register.this, "+task.getException()", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        }

    private void sendUserToNextActivity() {
        Intent intent = new Intent(Register.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
