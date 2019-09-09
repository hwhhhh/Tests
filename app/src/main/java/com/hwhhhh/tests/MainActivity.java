package com.hwhhhh.tests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //按钮1 进入实验7界面
        Button btn1 = findViewById(R.id.test_7);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "enter TEST 7", Toast.LENGTH_SHORT).show();
                //实验7 使用显式intent切换
                Intent intent = new Intent(MainActivity.this, Test7Activity.class);
                startActivity(intent);
            }
        });
        //按钮2 进入实验11界面 采用隐式Intent切换
        Button btn2 = findViewById(R.id.test_11);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.hwhhhh.tests.ACTION_START");
                startActivity(intent);
            }
        });
        //按钮3 测试打开系统浏览器
        Button btn3 = findViewById(R.id.browser_test);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });
    }
}
