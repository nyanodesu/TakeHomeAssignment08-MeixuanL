package com.example.takehomeassignment08_meixuanl;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PokemonViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView name;
    public TextView firstInGame;
    public ImageView image;
    public TextView id_view;


    public PokemonViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        name = (TextView) itemView.findViewById(R.id.name);
        firstInGame = (TextView) itemView.findViewById(R.id.first_in_game);
        image = (ImageView) itemView.findViewById(R.id.image);
        id_view = (TextView) itemView.findViewById(R.id.id_view);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id1 = id_view.getText().toString();
                Toast.makeText(context,id1, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
