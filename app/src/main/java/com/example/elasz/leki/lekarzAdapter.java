package com.example.elasz.leki;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
/**
 * Created by elasz on 17.01.2018.
 */

public class lekarzAdapter  extends RecyclerView.Adapter<lekarzAdapter.ViewHolder> {
    ArrayList<Lekarz> list = new ArrayList<>();

    lekarzAdapter(ArrayList<Lekarz> lekarz) { this.list = lekarz;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setName(list.get(position).getImie());
        holder.setPrice(list.get(position).getSpecjalizacja());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.imie)
        TextView Imie;

        @BindView(R.id.cena)
        TextView Specjalizacja;

        @BindView(R.id.button_wybierz)
        Button button_wybierz;

        @OnClick(R.id.button_wybierz)
        void onNameClick() {
            if (button_wybierz.getText() == "Wybrano") {
                button_wybierz.setText("Wybierz");
            } else {
                button_wybierz.setText("Wybrano");
            }
        }

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        private void setName(String name) {
            Imie.setText(name);
        }

        private void setPrice(String price) {
            Specjalizacja.setText(price);
        }


    }
}
