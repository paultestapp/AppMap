package com.psf.mymaps;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.psf.mymaps.models.Menu;

import java.util.ArrayList;

/**
 * Created by paulsalcedo on 25/2/18.
 */

public class MenuAdapter extends  RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private ArrayList<Menu> items;
    private Activity activity;

    public MenuAdapter(ArrayList<Menu> items, Activity activity) {
        this.items = items;
        this.activity = activity;
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_menu, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int i) {
        final int idx = i;

        final Menu item = items.get(idx);

        holder.iv_photo.setImageResource(item.getPhoto());
        holder.iv_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iMap = new Intent(activity, MapsActivity.class);
                iMap.putExtra("geolocation", item.getGeolocation());
                activity.startActivity(iMap);
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv_photo;

        public MenuViewHolder(View itemView) {
            super(itemView);
            iv_photo = itemView.findViewById(R.id.iv_photo);
        }
    }

}
