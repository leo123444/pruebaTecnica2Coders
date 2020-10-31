package com.example.a2coderslist.modelo.master;

import androidx.core.graphics.drawable.RoundedBitmapDrawable;

import java.util.ArrayList;

public interface IModeloMaster {


    ArrayList<ContenidoListaMaster> getListaMaster();

    ArrayList<String>getDescription();

    ArrayList<ContenidoListaMaster>getFavoritos();

    int getCurrentPosition();

    int sameElement(ContenidoListaMaster item);


}
