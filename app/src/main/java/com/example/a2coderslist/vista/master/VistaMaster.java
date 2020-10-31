package com.example.a2coderslist.vista.master;

import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a2coderslist.Mediador;
import com.example.a2coderslist.R;
import com.example.a2coderslist.modelo.master.ContenidoListaMaster;
import com.example.a2coderslist.presentador.master.IPresentadorMaster;
import com.example.a2coderslist.vista.adaptador.AdaptadorMaster;
import com.example.a2coderslist.vista.detail.VistaDetail;

import java.util.ArrayList;

public class VistaMaster extends AppCompatActivity implements IVistaMaster {
private ArrayList<ContenidoListaMaster> items;
private ListView listMaster;
private Mediador mediador;
private IPresentadorMaster presentadorMaster;
private int position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
        listMaster = this.findViewById(R.id.listMaster);
        mediador= (Mediador) this.getApplication();
        presentadorMaster= mediador.getPresentadorMaster();
        mediador.setVistaMaster(this);
        items= presentadorMaster.getAnimeList();
        setAdapterList(items);
        listMaster.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                position=i;
                Log.d("position is ",String.valueOf(position));
                Log.d("position is",String.valueOf(i));
                mediador.launchActivityForResult(VistaDetail.class,VistaMaster.this,0);
            }
        });



    }
@Override
    public void setAdapterList(ArrayList data){
    AdaptadorMaster adaptadorMaster = new AdaptadorMaster(this,R.layout.item_master,data);
    listMaster.setAdapter(adaptadorMaster);

}
@Override
    public int getPosition(){
        return position;
}



}
