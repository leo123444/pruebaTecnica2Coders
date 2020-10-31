package com.example.a2coderslist.presentador.master;

import com.example.a2coderslist.modelo.master.ContenidoListaMaster;

import java.util.ArrayList;

public interface IPresentadorMaster {
    ArrayList<ContenidoListaMaster> getAnimeList();

    int getCurrentListPosition();
}
