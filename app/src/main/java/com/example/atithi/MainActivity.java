package com.example.atithi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDialog = new Dialog(this);


    }

    public void ShowPopup(View v)
    {
        Button btnSignup,next;
        myDialog.setContentView(R.layout.imageuploadpopup);

        btnSignup = (Button) myDialog.findViewById(R.id.bt_SignUp);

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
    public void Register(View v)
    {
        myDialog.dismiss();
        Intent i = new Intent(this,SignUpActivity.class);
        startActivity(i);

    }

}