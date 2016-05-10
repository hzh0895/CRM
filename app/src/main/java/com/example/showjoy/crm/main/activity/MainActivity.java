package com.example.showjoy.crm.main.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.showjoy.crm.R;
import com.example.showjoy.crm.business.activity.BusinessActivity;
import com.example.showjoy.crm.contact.activity.ContactActivity;
import com.example.showjoy.crm.contract.activity.ContractActivity;
import com.example.showjoy.crm.customer.activity.CustomerActivity;
import com.example.showjoy.crm.form.activity.FormActivity;
import com.example.showjoy.crm.product.activity.ProductActivity;
import com.example.showjoy.crm.remind.activity.RemindActivity;
import com.example.showjoy.crm.target.activity.TargetActivity;

public class MainActivity extends AppCompatActivity {
    private View customerLayout;
    private View businessLayout;
    private View contractLayout;
    private View targetLayout;
    private View remindLayout;
    private View formLayout;
    private View contactLayout;
    private View productLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        customerLayout = findViewById(R.id.customer_layout);
        customerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, CustomerActivity.class);
                startActivity(intent);
            }
        });


        businessLayout = findViewById(R.id.business_layout);
        businessLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, BusinessActivity.class);
                startActivity(intent);
            }
        });


        contractLayout = findViewById(R.id.contract_layout);
        contractLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ContractActivity.class);
                startActivity(intent);
            }
        });


        targetLayout = findViewById(R.id.target_layout);
        targetLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, TargetActivity.class);
                startActivity(intent);
            }
        });


        remindLayout = findViewById(R.id.remind_layout);
        remindLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, RemindActivity.class);
                startActivity(intent);
            }
        });


        formLayout = findViewById(R.id.form_layout);
        formLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, FormActivity.class);
                startActivity(intent);
            }
        });


        contactLayout = findViewById(R.id.contact_layout);
        contactLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ContactActivity.class);
                startActivity(intent);
            }
        });


        productLayout = findViewById(R.id.product_layout);
        productLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ProductActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
