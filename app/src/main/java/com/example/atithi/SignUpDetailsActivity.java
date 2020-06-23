package com.example.atithi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SignUpDetailsActivity extends AppCompatActivity
{

    Dialog myDialog;
    ImageView close_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_details);

        myDialog = new Dialog(this);
        close_icon = (ImageView) findViewById(R.id.close_popup);
    }

    public void ShowPopup(View v)
    {
        Button btnRegister;
        myDialog.setContentView(R.layout.imageuploadpopup);

        btnRegister = (Button) myDialog.findViewById(R.id.btn_signup);


        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }



    public void Dashboard(View v)
    {
        myDialog.dismiss();
        Intent i = new Intent(this,DashboardActivity.class);
        startActivity(i);

    }

    public void ClosePopup(View v)
    {
        myDialog.dismiss();
    }


}