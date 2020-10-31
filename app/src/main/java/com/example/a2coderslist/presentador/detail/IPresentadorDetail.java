package com.example.a2coderslist.presentador.detail;

import com.example.a2coderslist.modelo.master.ContenidoListaMaster;

public interface IPresentadorDetail {

    int getPosition();

    ContenidoListaMaster getItem();

    String getDescription();

    void onButtonFavouriteClicked();
}
