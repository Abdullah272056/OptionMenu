package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.my_options_menu, menu);
//        return true;
//    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.aboutId){
            Toast.makeText(this, "About item Clicked", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId()==R.id.contactId){
            Toast.makeText(this, "Contact item Clicked ", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId()==R.id.shareId){
            Toast.makeText(this, "Share item Clicked", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId()==R.id.helpId){
            Toast.makeText(this, "Help item Clicked", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}

