package com.example.a2coderslist.favoritos.presentador;

import com.example.a2coderslist.Mediador;
import com.example.a2coderslist.modelo.master.IModeloMaster;
import com.example.a2coderslist.modelo.master.ModeloMaster;

import java.util.ArrayList;

public class PresentadorFavoritos implements IPresentadorFavoritos {

   private IModeloMaster modelo;

    public PresentadorFavoritos(){
       modelo= ModeloMaster.getInstance();
   }


    @Override
    public ArrayList getFavouritesItems() {
        return modelo.getFavoritos();
    }
}
