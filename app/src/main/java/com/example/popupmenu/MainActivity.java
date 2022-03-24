package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.imageView).setOnClickListener(view->{
            PopupMenu popupMenu = new PopupMenu(MainActivity.this, view);
            popupMenu.inflate(R.menu.menu_popup);
            popupMenu.setOnMenuItemClickListener(menuItemClickListener);
            popupMenu.show();
        });
    }

    private PopupMenu.OnMenuItemClickListener menuItemClickListener = menuItem -> {
      switch (menuItem.getItemId()){
          case R.id.menu_reply:
              Toast.makeText(this, "Reply", Toast.LENGTH_SHORT).show();
              break;
          case R.id.menu_reply_all:
              Toast.makeText(this, "Reply All", Toast.LENGTH_SHORT).show();
              break;
          case R.id.menu_forward:
              Toast.makeText(this, "Forward", Toast.LENGTH_SHORT).show();
              break;
          default:
              return false;
      }
      return false;
    };
}