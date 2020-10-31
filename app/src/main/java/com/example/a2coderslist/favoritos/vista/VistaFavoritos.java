package com.example.a2coderslist.favoritos.vista;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a2coderslist.Mediador;
import com.example.a2coderslist.R;
import com.example.a2coderslist.vista.adaptador.AdaptadorFavoritos;
import com.example.a2coderslist.favoritos.presentador.IPresentadorFavoritos;

import java.util.ArrayList;

public class VistaFavoritos extends AppCompatActivity implements IVistaFavoritos {
private Mediador mediador;
private IPresentadorFavoritos presentador;
private ListView listFavourites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);
        mediador =  (Mediador) this.getApplication();
        presentador= mediador.getPresentadorFavoritos();
        mediador.setVistaFavoritos(this);
        listFavourites = this.findViewById(R.id.listFavourites);
        setAdapterList(presentador.getFavouritesItems());
}
    @Override
    public void setAdapterList(ArrayList data){
        AdaptadorFavoritos adaptadorFavoritos = new AdaptadorFavoritos(this,R.layout.item_favourites,data);
        listFavourites.setAdapter(adaptadorFavoritos);

    }
}
