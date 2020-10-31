package com.example.a2coderslist.presentador.detail;
import android.util.Log;
import com.example.a2coderslist.modelo.master.ContenidoListaMaster;
import com.example.a2coderslist.modelo.master.IModeloMaster;
import com.example.a2coderslist.modelo.master.ModeloMaster;



public class PresentadorDetail implements IPresentadorDetail {

private IModeloMaster modeloMaster;

public PresentadorDetail(){
    modeloMaster= ModeloMaster.getInstance();
}

@Override
public int getPosition(){
        return modeloMaster.getCurrentPosition();
}
@Override
public ContenidoListaMaster getItem(){
        return modeloMaster.getListaMaster().get(getPosition());
}
     @Override
    public String getDescription(){
        return modeloMaster.getDescription().get(getPosition());
}

    @Override
    public void onButtonFavouriteClicked() {
      ContenidoListaMaster item=   modeloMaster.getListaMaster().get(getPosition());
      Log.d("element:",String.valueOf(modeloMaster.sameElement(item)));
      if( modeloMaster.sameElement(item)==0){
          modeloMaster.getFavoritos().add(item);
      }
   else{
       Log.d("error","item already exists in list");
      }
      }
    }


