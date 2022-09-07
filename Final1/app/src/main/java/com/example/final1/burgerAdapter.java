package com.example.final1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.BitSet;
import java.util.List;

public class burgerAdapter extends ArrayAdapter {

    List<Burger> burgerList;

    public burgerAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        burgerList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.burger_row, parent, false);

        Burger currenBurger = burgerList.get(position);

        TextView burgerNameTextView = view.findViewById(R.id.burgerName);
        ImageView burgerImageView = view.findViewById(R.id.burgerIMG);

        burgerNameTextView.setText(currenBurger.getBurgerName());
        burgerImageView.setImageResource(currenBurger.getBurgerImage());



             return view;
    }
}