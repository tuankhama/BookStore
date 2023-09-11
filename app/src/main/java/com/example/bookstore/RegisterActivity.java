package com.example.bookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bookstore.dto.RegisterRequestDTO;
import com.example.bookstore.dto.RegisterResponseDTO;
import com.example.bookstore.helpers.HttpRequest;
import com.example.bookstore.helpers.IHttpRequest;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    EditText edtRegisterEmail ,edtRegisterPassword ,edtRegisterName;
    Button btnRegister;
    TextView tvGoSignIn;
    IHttpRequest iHttpRequest;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtRegisterEmail = findViewById(R.id.edtRegisterEmail);
        edtRegisterPassword = findViewById(R.id.edtRegisterPassword);
        edtRegisterName = findViewById(R.id.edtRegisterName);
        btnRegister = findViewById(R.id.btnRegister);
        tvGoSignIn = findViewById(R.id.tvGoSignIn);
        iHttpRequest = HttpRequest.createService(IHttpRequest.class);
    }

    public void onGoLoginClick(View view)
    {
        finish();
    }

    public void onRegisterClick(View view)
    {
        String email = edtRegisterEmail.getText().toString();
        String password = edtRegisterPassword.getText().toString();
        String name = edtRegisterName.getText().toString();

        // bat loi
        RegisterRequestDTO requestDTO = new RegisterRequestDTO(name,email,password);
        iHttpRequest.register(requestDTO).enqueue(registerCallback);
    }

    Callback<RegisterResponseDTO> registerCallback = new Callback<RegisterResponseDTO>()
    {
        @Override
        public void onResponse(Call<RegisterResponseDTO> call, Response<RegisterResponseDTO> response) {
            if (response.isSuccessful()){
                RegisterResponseDTO responseDTO = response.body();
                if (responseDTO.isStatus()){
                    Toast.makeText(RegisterActivity.this,
                            " Thanh cong rui kia eyyyyy  ",Toast.LENGTH_LONG).show();
                    finish();
                }
                else {
                    Toast.makeText(RegisterActivity.this,
                            " That bai rui kia hmmmmm  ",Toast.LENGTH_LONG).show();
                }
            }
        }

        @Override
        public void onFailure(Call<RegisterResponseDTO> call, Throwable t) {
            Log.d(">>> login", "onFailure: " + t.getMessage());
        }
    };
}