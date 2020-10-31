package com.example.a2coderslist.vista.adaptador;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a2coderslist.R;
import com.example.a2coderslist.modelo.master.ContenidoListaMaster;

import java.util.ArrayList;

public class AdaptadorMaster extends ArrayAdapter {

private ArrayList<ContenidoListaMaster>lista;
private Context context;
public AdaptadorMaster(@NonNull Context context,int i, ArrayList lista)
{
    super(context,i,lista);
    this.context=context;
    this.lista=lista;
}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // En primer lugar "inflamos" una nueva vista, que serÃ¡ la que se
        // mostrarÃ¡ en la celda del ListView. Para ello primero creamos el
        // inflater, y despuÃ©s inflamos la vista.
        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.item_master, null);

        // A partir de la vista, recogeremos los controles que contiene para
        // poder manipularlos.
        // Recogemos el ImageView y le asignamos una foto.
        ImageView imagen = (ImageView) item.findViewById(R.id.icon);
        imagen.setImageResource(lista.get(position).getIcon());

        // Recogemos el TextView para mostrar el nombre y establecemos el
        // nombre.
        TextView textViewTitle = (TextView) item.findViewById(R.id.textViewTitle);
        textViewTitle.setText(lista.get(position).getTitle());

        //Recogemos el text view para mostrar un pequeño detalle
        TextView textViewDetail = (TextView) item.findViewById(R.id.textViewDetail);
        textViewDetail.setText(lista.get(position).getDetail());
        return item;
    }}

