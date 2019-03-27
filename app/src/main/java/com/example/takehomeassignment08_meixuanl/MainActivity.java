package com.example.takehomeassignment08_meixuanl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.takehomeassignment08_meixuanl.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Pokemon> pokemons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler_View);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new PokemonAdapter(pokemons,this));
    }

    public void initialData(){
        pokemons=new ArrayList<>();
        pokemons.add(new Pokemon(R.string.pikachu, R.string.firstInGame_pikachu,R.mipmap.pikachu,R.string.id_pikachu));
        pokemons.add(new Pokemon(R.string.bulbasaur,R.string.firstInGame_bulbasaur,R.mipmap.bulbasaur,R.string.id_bulbasaur));
        pokemons.add(new Pokemon(R.string.charmander,R.string.firstInGame_charmander,R.mipmap.charmander,R.string.id_charmander));
        pokemons.add(new Pokemon(R.string.squirtle,R.string.firstInGame_squirtle,R.mipmap.squirtle,R.string.id_squirtle));
        pokemons.add(new Pokemon(R.string.chikorita,R.string.firstInGame_chikorita,R.mipmap.chikorita,R.string.id_chikorita));
        pokemons.add(new Pokemon(R.string.cyndaquil,R.string.firstInGame_cyndaquil,R.mipmap.cyndaquil,R.string.cyndaquil));
        pokemons.add(new Pokemon(R.string.totodile,R.string.firstInGame_totodile,R.mipmap.totodile,R.string.id_totodile));
    }
}
