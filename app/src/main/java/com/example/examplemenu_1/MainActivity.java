package com.example.examplemenu_1;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.VectorEnabledTintResources;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.view.MenuInflater;
import android.view.Menu;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class MainActivity extends AppCompatActivity {

    EditText userid;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    /*public void ButtonSignup(View view){
        Toast.makeText(this,"注册成功",Toast.LENGTH_LONG).show();
    }*/

    public void ButtonSignin(View view){
        userid = (EditText)findViewById(R.id.userid);
        password = (EditText)findViewById(R.id.password);
        if(userid.getText().toString().equalsIgnoreCase("abc")  &&  password.getText().toString().equalsIgnoreCase("123")){
            Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "用户名或密码错误", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean  onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_settings1:
                Toast.makeText(this, "确定", Toast.LENGTH_LONG).show();
                break;
            case R.id.action_settings2:
                Toast.makeText(this, "取消", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void ButtonSignup(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        LayoutInflater inflater = getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.login_dialog, null));

        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "注册成功", Toast.LENGTH_LONG).show();

            }

        });

        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "已取消", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();

    }
}

