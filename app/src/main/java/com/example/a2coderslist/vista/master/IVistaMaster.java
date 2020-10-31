package com.example.a2coderslist.vista.master;

import com.example.a2coderslist.modelo.master.ContenidoListaMaster;
import com.example.a2coderslist.vista.adaptador.AdaptadorMaster;

import java.util.ArrayList;

public interface IVistaMaster {

    void setAdapterList(ArrayList data);

    int getPosition();
}
