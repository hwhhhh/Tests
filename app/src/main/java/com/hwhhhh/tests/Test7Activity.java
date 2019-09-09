package com.hwhhhh.tests;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Test7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test7);
        //按钮1 进入登录界面
        Button btn1 = findViewById(R.id.test_7_login);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.hwhhhh.tests.test7.LOGIN_UP");
                startActivity(intent);
            }
        });
        Button btn2 = findViewById(R.id.test_7_tip);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showEditDialog();
            }
        });
    }

    private void showEditDialog(){
        //对话框
        final EditText editText = new EditText(this);
        AlertDialog.Builder editDialog = new AlertDialog.Builder(this);
        editDialog.setTitle("提示对话框");
        editDialog.setView(editText);
        editDialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Test7Activity.this, editText.getText().toString(), Toast.LENGTH_SHORT).show();
                dialogInterface.dismiss();
            }
        });
        editDialog.create().show();
    }
}
