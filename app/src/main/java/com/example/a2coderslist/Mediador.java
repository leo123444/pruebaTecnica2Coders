package com.example.a2coderslist;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;


import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import com.example.a2coderslist.presentador.detail.IPresentadorDetail;
import com.example.a2coderslist.presentador.detail.PresentadorDetail;
import com.example.a2coderslist.presentador.master.IPresentadorMaster;
import com.example.a2coderslist.presentador.master.PresentadorMaster;
import com.example.a2coderslist.vista.detail.IVistaDetail;
import com.example.a2coderslist.favoritos.presentador.IPresentadorFavoritos;
import com.example.a2coderslist.favoritos.presentador.PresentadorFavoritos;
import com.example.a2coderslist.favoritos.vista.IVistaFavoritos;
import com.example.a2coderslist.vista.master.IVistaMaster;

public class Mediador extends Application {

    private static Mediador singleton;
    private IVistaMaster vistaMaster;
    private IVistaDetail vistaDetail;
    private IVistaFavoritos vistaFavoritos;



    private IPresentadorDetail presentadorDetail;
    private IPresentadorMaster presentadorMaster;
    private IPresentadorFavoritos presentadorFavoritos;


    public static Mediador getInstance(){
        if(singleton==null){
            singleton= new Mediador();
        }
        return singleton;
    }



    //Métodos de acceso a la vista y presentador
    public IVistaMaster getVistaMaster() {
        return vistaMaster;
    }

    public void setVistaMaster(IVistaMaster vistaMaster) {
        this.vistaMaster = vistaMaster;
    }



    public void setVistaDetail(IVistaDetail vistaDetail) {
        this.vistaDetail = vistaDetail;
    }

    public void setVistaFavoritos(IVistaFavoritos vistaFavoritos) {
        this.vistaFavoritos = vistaFavoritos;
    }

    public IPresentadorDetail getPresentadorDetail() {
       if(this.presentadorDetail==null){
           presentadorDetail= new PresentadorDetail();
       }
        return presentadorDetail;
    }

    public IPresentadorFavoritos getPresentadorFavoritos() {
    if(this.presentadorFavoritos==null){
        presentadorFavoritos= new PresentadorFavoritos();
    }
    return presentadorFavoritos;
    }



    public IPresentadorMaster getPresentadorMaster() {
        if(this.presentadorMaster == null){
            presentadorMaster = new PresentadorMaster();
        }
        return presentadorMaster;
    }



 //Métodos para la navegación entre  pantallas en la aplicación
    public void launchActivityForResult(Class actividadInvocada,
                                        Activity actividadInvocadora, int requestCode) {
        Intent i = new Intent(actividadInvocadora, actividadInvocada);
        actividadInvocadora.startActivityForResult(i, requestCode);
    }



   //Inicialización de la aplicación
    @Override
    public void onCreate(){
    super.onCreate();
    presentadorMaster=null;
    presentadorDetail=null;
    presentadorFavoritos=null;
    singleton=this;
 }



}
