package com.example.takehomeassignment08_meixuanl;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonViewHolder>{


    private List<Pokemon> pokemons;
    private Context context;

    public PokemonAdapter(List<Pokemon> pokemons, Context context){
        this.pokemons= pokemons;
        this.context=context;
    }
    @Override
    public PokemonViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent,false);
        return new PokemonViewHolder(view,context);
    }

    @Override
    public void onBindViewHolder(PokemonViewHolder holder, int position){
        Pokemon pokemon=pokemons.get(position);
        holder.name.setText(pokemon.name);
        holder.firstInGame.setText(pokemon.firstInGame);
        holder.image.setImageResource(pokemon.photoId);
        holder.id_view.setText(pokemon.id);
    }

    @Override
    public int getItemCount(){
        return pokemons.size();
    }
}
