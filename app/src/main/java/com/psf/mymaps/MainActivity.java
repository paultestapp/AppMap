package com.psf.mymaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.psf.mymaps.models.Menu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mainActionbar = findViewById(R.id.main_actionbar);
        if(mainActionbar != null) setSupportActionBar(mainActionbar);

        rv_menu = findViewById(R.id.rv_menu);
        setAdapter();
    }

    private void setAdapter() {
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        rv_menu.setLayoutManager(layoutManager);

        rv_menu.setAdapter(new MenuAdapter(getMenu(), this));
    }

    private ArrayList<Menu> getMenu() {
        ArrayList<Menu> items = new ArrayList<>();
        items.add(new Menu(R.drawable.cerro, "-2.181189, -79.875494"));
        items.add(new Menu(R.drawable.parque_historico, "-2.145215, -79.870114"));
        items.add(new Menu(R.drawable.perla, "-2.186301, -79.876494"));
        items.add(new Menu(R.drawable.samanes, "-2.103526, -79.900805"));

        return items;
    }
}
