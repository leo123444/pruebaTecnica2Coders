package com.example.a2coderslist.presentador.master;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;

import com.example.a2coderslist.Mediador;
import com.example.a2coderslist.modelo.master.ContenidoListaMaster;
import com.example.a2coderslist.modelo.master.IModeloMaster;
import com.example.a2coderslist.modelo.master.ModeloMaster;
import com.example.a2coderslist.vista.master.IVistaMaster;

import java.util.ArrayList;

public class PresentadorMaster implements IPresentadorMaster {
    private IModeloMaster modelo;
    private Mediador appMediador;
    private IVistaMaster vistaMaster;

    public PresentadorMaster() {
        appMediador = Mediador.getInstance();
        modelo = ModeloMaster.getInstance();
        vistaMaster= appMediador.getVistaMaster();
        Log.d("appmediador is",appMediador.toString());

    }


    @Override
    public ArrayList<ContenidoListaMaster> getAnimeList(){
        return modelo.getListaMaster();
    }


@Override
    public int getCurrentListPosition(){
        return appMediador.getVistaMaster().getPosition();
}

}
