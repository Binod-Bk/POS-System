package com.example.nepalairlink;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editUsername, editPassword;
    private TextView txtPreview;
    private Button btnLogin;

    ActivityResultLauncher<Intent> someActivityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        // There are no request codes
                        Intent data = result.getData();
                        Log.d("Data", data.getStringExtra("Value"));
                    }
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findViews();
        setOnClick();
//        Toast.makeText(this, " Logout Successfully ", Toast.LENGTH_SHORT).show();

    }

    void setOnClick() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editUsername.getText().toString().equals(""))
                    txtPreview.setText("Username cannot be empty");
                else if (editPassword.getText().toString().equals(""))
                    txtPreview.setText("Password cannot be empty");
                else {
                    String username = editUsername.getText().toString();
                    String password = editPassword.getText().toString();

                    if (username.equals("a") && password.equals("a")) {
                        Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
//                        intent.putExtra("username", username);
//                        intent.putExtra("password", password);
//                        intent.putExtra("isLogin", "Login Successfully");
//                        startActivity(intent);
                        startActivityForResult(intent, 100);
                        someActivityResultLauncher.launch(intent);
                    } else {
                        txtPreview.setText("Cannot login");
                    }
                }
            }
        });
    }

    void findViews() {
        editUsername = findViewById(R.id.editUsername);
        editPassword = findViewById(R.id.editPassword);
        btnLogin = findViewById(R.id.btnLogin);
        txtPreview = findViewById(R.id.txtPreview);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}