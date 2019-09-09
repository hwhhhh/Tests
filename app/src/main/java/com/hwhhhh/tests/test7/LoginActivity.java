package com.hwhhhh.tests.test7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hwhhhh.tests.R;

public class LoginActivity extends AppCompatActivity {
    private EditText account;
    private EditText password;
    private static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //获取账号、密码的EditText
        account = findViewById(R.id.login_account);
        password = findViewById(R.id.login_password);
        //设置login按钮的监听
        Button b1 = findViewById(R.id.login_login);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 注意是equals 而不是 == ！！
                if (account.getText().toString().equals("abc") && password.getText().toString().equals("123")){
                    Toast.makeText(LoginActivity.this, "登录成功！", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(LoginActivity.this, "账号或密码错误，登录失败！", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
